package cn.hacz.edu.controller;

import cn.hacz.edu.webexception.R;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
    @RequestMapping(value = "/admin")
    public R loginSuccess() {
        return R.ok();
    }
}
