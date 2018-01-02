package cn.hacz.edu.vo;

import cn.hacz.edu.vo.body.Body;
import cn.hacz.edu.vo.header.Header;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * ========================
 * project -
 *
 * @author guod
 * @version 3.0
 * @date 日期:2018/1/2 时间:11:02
 * @JDK: v1.8
 * @Description 功能模块：
 * GitHub地址：https://github.com/s121528
 * ========================
 */
@JacksonXmlRootElement(localName = "root")
public class Root {
    private Header header;
    private Body body;

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }
}
