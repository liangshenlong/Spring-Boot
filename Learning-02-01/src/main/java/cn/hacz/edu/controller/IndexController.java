package cn.hacz.edu.controller;

import cn.hacz.edu.webexception.R;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @RequestMapping(value = "/")
    public R index() {
        return R.ok();
    }
}