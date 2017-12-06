package cn.hacz.edu.jackson;

import cn.hacz.edu.vo.BookVo;
import cn.hacz.edu.vo.VolumeVo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * ========================
 * project -
 *
 * @author guod
 * @version 3.0
 * @date 日期:2017/12/6 时间:9:01
 * @JDK: v1.8
 * @Description 功能模块：
 * GitHub地址：https://github.com/s121528
 * ========================
 */
public class Jackson02Test {
    public static void main(String[] args) {
        Workbook workBook = getWorkBook("D:" + File.separator + "students.xls");
        List<String[]> list = new ArrayList<String[]>();
        getRows(workBook, list);
        System.out.println(list);
    }

    @Test
    public void jackson01() throws JsonProcessingException {
        BookVo bookVo = new BookVo();
        bookVo.setId("001");
        bookVo.setName("第一章");
        VolumeVo volumeVo = new VolumeVo();
        bookVo.getVolume().add(volumeVo);
        ObjectWriter o = new XmlMapper().writerWithDefaultPrettyPrinter();
        String s = o.writeValueAsString(bookVo);
        System.out.println(s);
    }

    /**
     * 功能：通过后缀名返回相应的对象实体
     *
     * @param filePath
     * @return
     */
    public static Workbook getWorkBook(String filePath) {
        // 获得文件名
        File file = new File(filePath);
        // 创建Workbook工作薄对象，表示整个excel
        Workbook workbook = null;
        try {
            // 获取excel文件的io流
            InputStream is = new FileInputStream(file);
            // 根据文件后缀名不同(xls和xlsx)获得不同的Workbook实现类对象
            if (filePath.endsWith("xls")) {
                // 2003
                workbook = new HSSFWorkbook(is);
            } else if (filePath.endsWith("xlsx")) {
                // 2007
                workbook = new XSSFWorkbook(is);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return workbook;
    }

    private static void getRows(Workbook workBook, List<String[]> list) {
        if (workBook == null) {
            return;
        }

        for (int sheetNum = 0; sheetNum < workBook.getNumberOfSheets(); sheetNum++) {
            // 获得当前sheet工作表
            Sheet sheet = workBook.getSheetAt(sheetNum);
            if (sheet == null) {
                continue;
            }
            // 获得当前sheet的开始行
            int firstRowNum = sheet.getFirstRowNum();
            // 获得当前sheet的结束行
            int lastRowNum = sheet.getLastRowNum();
            // 循环除了第一行的所有行
            for (int rowNum = firstRowNum; rowNum <= lastRowNum; rowNum++) {
                // 获得当前行
                Row row = sheet.getRow(rowNum);
                if (row == null) {
                    continue;
                }
                // 获得当前行的开始列
                int firstCellNum = row.getFirstCellNum();
                // 获得当前行的列数
                int lastCellNum = row.getPhysicalNumberOfCells();
                String[] cells = new String[row.getPhysicalNumberOfCells()];
                // 循环当前行
                for (int cellNum = firstCellNum; cellNum < lastCellNum; cellNum++) {
                    Cell cell = row.getCell(cellNum);
                    cells[cellNum] = getCellValue(cell);
                }
                list.add(cells);
            }
        }
    }

    public static String getCellValue(Cell cell) {
        String cellValue = "";
        if (cell == null) {
            return cellValue;
        }
        // 把数字当成String来读，避免出现1读成1.0的情况
        if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
            cell.setCellType(Cell.CELL_TYPE_STRING);
        }
        // 判断数据的类型
        switch (cell.getCellType()) {
            case Cell.CELL_TYPE_NUMERIC: // 数字
                cellValue = String.valueOf(cell.getNumericCellValue());
                break;
            case Cell.CELL_TYPE_STRING: // 字符串
                cellValue = String.valueOf(cell.getStringCellValue());
                break;
            case Cell.CELL_TYPE_BOOLEAN: // Boolean
                cellValue = String.valueOf(cell.getBooleanCellValue());
                break;
            case Cell.CELL_TYPE_FORMULA: // 公式
                cellValue = String.valueOf(cell.getCellFormula());
                break;
            case Cell.CELL_TYPE_BLANK: // 空值
                cellValue = "";
                break;
            case Cell.CELL_TYPE_ERROR: // 故障
                cellValue = "非法字符";
                break;
            default:
                cellValue = "未知类型";
                break;
        }
        return cellValue;
    }

}
