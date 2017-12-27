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
 *
 * @author guod
 * Date：2017/11/23
 * GitHub地址：https://github.com/s121528
 * ========================
 */
@RestController
@PropertySource("classpath:test.properties")
public class ElControler {
    /**
     * 1
     */
    @Value("I Love You!")
    private String normal;
    /**
     * 2
     */
    @Value("#{systemProperties['os.name']}")
    private String osName;
    /**
     * 3
     */
    @Value("#{ T(java.lang.Math).random() * 100.0 }")
    private double randomNumber;
    /**
     * 4
     */
    @Value("http://www.baidu.com")
    private Resource testUrl;
    /**
     * 5
     */
    @Value("#{guoService.another}")
    private String fromAnother;
    /**
     * 6
     */
    @Value("classpath:test.txt")
    private Resource testFile;
    /**
     * 7注意需要引入properties的配置文件
     */
    @Value("${book.name}")
    private String bookName;
    /**
     * 7
     */
    @Autowired
    private Environment environment;

    @GetMapping(value = "/elIndex")
    public String elIndex() throws IOException {
        return normal + osName + bookName + testUrl + fromAnother + IOUtils.toString(testUrl.getInputStream()) + IOUtils.toString(testFile.getInputStream()) + environment.getProperty("book.author");
    }

}
