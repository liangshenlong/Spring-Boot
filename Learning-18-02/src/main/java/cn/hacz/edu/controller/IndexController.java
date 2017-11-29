package cn.hacz.edu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：guod
 * Date：2017/11/28
 * Time：16:03
 * Description：功能模块：
 * JDK：V1.8
 * GitHub地址：https://github.com/s121528
 * ========================
 */
@RestController
public class IndexController {

    @RequestMapping(value = "/cors")
    public String corsIndex() {
        return "CORS跨域请求";
    }
}
