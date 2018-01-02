package cn.hacz.edu;

import cn.hacz.edu.vo.RootXml;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;

import java.io.IOException;

/**
 * ========================
 * project -
 *
 * @author guod
 * @version 3.0
 * @date 日期:2018/1/2 时间:11:30
 * @JDK: v1.8
 * @Description 功能模块：
 * GitHub地址：https://github.com/s121528
 * ========================
 */
public class MainTest {
    public static void main(String[] args) throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        RootXml rootXml = new RootXml();
        RootXml.Value1 value1 = new RootXml.Value1();
        rootXml.setK1("字符串类型");
        rootXml.setK2(15);
        rootXml.getKi().add("java");
        value1.setA("a7b");
        rootXml.setK7(value1);
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);
        xmlMapper.configure(ToXmlGenerator.Feature.WRITE_XML_DECLARATION, true);
        String s = xmlMapper.writeValueAsString(rootXml);
        xmlMapper.writeValue(System.out, rootXml);
    }
}
