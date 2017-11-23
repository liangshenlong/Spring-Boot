package cn.hacz.edu.controller;

import org.apache.commons.io.IOUtils;
import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：guod
 * Date：2017/11/23
 * GitHub地址：https://github.com/s121528
 * ========================
 */
@RestController
@PropertySource("classpath:test.properties")
public class ElControler {
    @Value("I Love You!") // 1
    private String normal;

    @Value("#{systemProperties['os.name']}") // 2
    private String osName;

    @Value("#{ T(java.lang.Math).random() * 100.0 }") // 3
    private double randomNumber;

    @Value("http://www.baidu.com") // 4
    private Resource testUrl;

    @Value("#{demoService.another}") // 5
    private String fromAnother;

    @Value("classpath:test.txt") // 6
    private Resource testFile;

    @Value("${book.name}") // 7注意需要引入properties的配置文件
    private String bookName;

    @Autowired
    private Environment environment; //7

    @GetMapping(value = "/elIndex")
    public String elIndex() throws IOException {
        return normal + osName + bookName + testUrl + fromAnother + IOUtils.toString(testUrl.getInputStream()) + IOUtils.toString(testFile.getInputStream()) + environment.getProperty("book.author");
    }

}
