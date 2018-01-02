package cn.hacz.edu.vo;

/**
 * ========================
 * project -
 *
 * @author guod
 * @version 3.0
 * @date 日期:2018/1/2 时间:11:29
 * @JDK: v1.8
 * @Description 功能模块：
 * GitHub地址：https://github.com/s121528
 * ========================
 */

import com.fasterxml.jackson.dataformat.xml.annotation.*;
import lombok.Data;

import java.util.Collection;

@Data
@JacksonXmlRootElement(localName = "root")
public class RootXml {

    private String k1;

    @JacksonXmlProperty(localName = "k-2")
    private Integer k2;

    @JacksonXmlElementWrapper(localName = "k3")
    private Collection<String> ki;

    @JacksonXmlElementWrapper(localName = "k4")
    @JacksonXmlProperty(localName = "ka")
    private Collection<String> k4;

    @JacksonXmlElementWrapper(localName = "k5", useWrapping = false)
    private Collection<String> k5;

    @JacksonXmlProperty(isAttribute = true)
    private Integer k6 = 2;

    @Data
    public static class Value1 {

        @JacksonXmlText
        private String a;
    }

    private Value1 k7;

    @Data
    public static class Value2 {

        @JacksonXmlText(value = false)
        private String a;
    }

    private Value2 k8;
    /**
     * 序列化时是否总是使用 CDATA块
     */
    @JacksonXmlCData
    private String k9;
}
