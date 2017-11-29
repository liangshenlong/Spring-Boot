package cn.hacz.edu.controller;

import cn.hacz.edu.properties.UrlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：guod
 * Date：2017/11/29
 * Time：9:11
 * Description：功能模块：
 * JDK：V1.8
 * GitHub地址：https://github.com/s121528
 * ========================
 */
@RestController
public class PropertiesController {
    @Autowired
    private UrlProperties urlProperties;

    @GetMapping(value = "/properties")
    public String properties() {
        return urlProperties.getIp();
    }
}
