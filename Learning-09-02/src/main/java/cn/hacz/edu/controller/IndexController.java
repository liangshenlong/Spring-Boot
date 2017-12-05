package cn.hacz.edu.controller;

import org.apache.poi.hssf.usermodel.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：guod
 * Date：2017/12/5
 * Time：15:23
 * Description：功能模块：
 * JDK：V1.8
 * GitHub地址：https://github.com/s121528
 * ========================
 */
@RestController
public class IndexController {
    @GetMapping(value = "/index")
    public void index() {
        // 个excel表格
        HSSFWorkbook wb = new HSSFWorkbook();
        // 一个工作表格（sheet）
        HSSFSheet sheet = wb.createSheet("测试表格");
        // 一行（row）
        HSSFRow row1 = sheet.createRow(0);
        // 一个单元格（cell）
        HSSFCell cell2 = row1.createCell((short) 0);
        // 单元格格式（cellstyle）
        HSSFCellStyle style4 = wb.createCellStyle();
        // 单元格内容格式
        HSSFDataFormat format = wb.createDataFormat();
    }
}
