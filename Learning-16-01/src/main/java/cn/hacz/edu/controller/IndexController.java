package cn.hacz.edu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @RequestMapping(value = "/index")
    public String index() {
        return "API controller层的接口调用测试！";
    }
}
