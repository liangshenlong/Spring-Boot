package cn.hacz.edu.controller;

import cn.hacz.edu.entity.Student;
import org.apache.poi.hssf.usermodel.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：guod
 * Date：2017/12/5
 * Time：15:30
 * Description：功能模块：
 * JDK：V1.8
 * GitHub地址：https://github.com/s121528
 * ========================
 */
public class ExcelOperate {
    public static void main(String[] args) {
        // 创建Excel表格
        createExcel(getStudent());
        // 读取Excel表格
        List<Student> list = readExcel();
        System.out.println(list.toString());

    }

    /**
     * 初始化数据
     *
     * @return 数据
     */
    private static List<Student> getStudent() {
        List<Student> list = new ArrayList<>();
        Student student1 = new Student("小明", 8, "二年级");
        Student student2 = new Student("小光", 9, "三年级");
        Student student3 = new Student("小花", 10, "四年级");
        list.add(student1);
        list.add(student2);
        list.add(student3);
        return list;
    }

    /**
     * 功能：创建Excel
     *
     * @param studentList
     */
    private static void createExcel(List<Student> studentList) {
        // 创建一个Excel文件
        HSSFWorkbook workbook = new HSSFWorkbook();
        // 创建一个工作表
        HSSFSheet sheet = workbook.createSheet("学生表一");
        // 添加表头行
        HSSFRow hssfRow = sheet.createRow(0);
        // 设置单元格格式居中
        HSSFCellStyle cellStyle = workbook.createCellStyle();

        // 添加表头内容
        HSSFCell headCell = hssfRow.createCell(0);
        headCell.setCellValue("姓名");
        headCell.setCellStyle(cellStyle);

        headCell = hssfRow.createCell(1);
        headCell.setCellValue("年龄");
        headCell.setCellStyle(cellStyle);

        headCell = hssfRow.createCell(2);
        headCell.setCellValue("年级");
        headCell.setCellStyle(cellStyle);
        for (int i = 0; i < studentList.size(); i++) {
            hssfRow = sheet.createRow(i + 1);
            Student student = studentList.get(i);

            // 创建单元格，并设置值
            HSSFCell cell = hssfRow.createCell(0);
            cell.setCellValue(student.getName());
            cell.setCellStyle(cellStyle);

            cell = hssfRow.createCell(1);
            cell.setCellValue(student.getAge());
            cell.setCellStyle(cellStyle);

            cell = hssfRow.createCell(2);
            cell.setCellValue(student.getAdd());
            cell.setCellStyle(cellStyle);
        }
        // 保存Excel文件
        try {
            OutputStream outputStream = new FileOutputStream("D:/students.xls");
            workbook.write(outputStream);
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 功能：读取Excel内容
     *
     * @return list
     */
    private static List<Student> readExcel() {
        List<Student> list = new ArrayList<>();
        HSSFWorkbook workbook = null;
        try {
            InputStream inputStream = new FileInputStream("D:/students.xls");
            workbook = new HSSFWorkbook(inputStream);
            inputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int numSheet = 0; numSheet < workbook.getNumberOfSheets(); numSheet++) {
            HSSFSheet hssfSheet = workbook.getSheetAt(numSheet);
            if (hssfSheet == null) {
                continue;
            }
            for (int rowNum = 1; rowNum <= hssfSheet.getLastRowNum(); rowNum++) {
                HSSFRow hssfRow = hssfSheet.getRow(rowNum);
                if (hssfRow == null) {
                    continue;
                }
                // 将单元格中的内容存入集合
                Student student = new Student();
                HSSFCell cell = hssfRow.getCell(0);
                if (cell == null) {
                    continue;
                }
                student.setName(cell.getStringCellValue());
                cell = hssfRow.getCell(1);
                if (cell == null) {
                    continue;
                }
                student.setAge((int) cell.getNumericCellValue());

                cell = hssfRow.getCell(2);
                if (cell == null) {
                    continue;
                }
                student.setAdd(cell.getStringCellValue());

                list.add(student);

            }
        }
        return list;
    }
}
