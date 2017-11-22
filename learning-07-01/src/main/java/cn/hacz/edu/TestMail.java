package cn.hacz.edu;


import cn.hacz.edu.core.MailSender;
import cn.hacz.edu.enums.MailContentTypeEnum;

import java.util.ArrayList;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/4/8
 * Time：20:49
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
public class TestMail {
    public static void main(String[] args) throws Exception {
        new MailSender()
                .title("测试SpringBoot发送邮件")
                .content("")
                .contentType(MailContentTypeEnum.TEXT)
                .targets(new ArrayList<String>() {{
                    add("1007916121@qq.com");
                }})
                .send();
    }
}
