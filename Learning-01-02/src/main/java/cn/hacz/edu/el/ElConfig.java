package cn.hacz.edu.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

/**
 * ========================
 * project -
 *
 * @author guod
 * @version 3.0
 * @date 日期:2017/12/27 时间:11:06
 * @JDK: v1.8
 * @Description 功能模块：
 * GitHub地址：https://github.com/s121528
 * ========================
 */
@Configuration
@ComponentScan("cn.hacz.edu.el")
@PropertySource("classpath:test.properties")
public class ElConfig {
    @Value("郭东升")
    private String name;

    @Value("#{systemProperties['os.name']}")
    private String osName;

    @Value("#{ T(java.lang.Math).random() * 100.0 }")
    private double randomNumber;

    @Value("#{guoService.another}")
    private String fromAnother;

    @Value("classpath:test.txt")
    private Resource testFile;

    @Value("http://www.baidu.com")
    private Resource testUrl;

    @Value("${book.name}")
    private String bookName;

    @Autowired
    private Environment environment;


    public void outputResource() {
        try {
            System.out.println(name);
            System.out.println(osName);
            System.out.println(randomNumber);
            System.out.println(fromAnother);
            System.out.println(IOUtils.toString(testFile.getInputStream()));

            System.out.println(IOUtils.toString(testUrl.getInputStream()));
            System.out.println(bookName);
            System.out.println(environment.getProperty("book.author"));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
