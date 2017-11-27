package cn.hacz.edu.controller;

import cn.hacz.edu.entity.UserEntity;
import cn.hacz.edu.service.UserServiceI;
import cn.hacz.edu.webexception.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：guod
 * Date：2017/11/27
 * Time：9:37
 * Description：功能模块：
 * JDK：V1.8
 * GitHub地址：https://github.com/s121528
 * ========================
 */
@RestController
public class UserController {
    @Autowired
    private UserServiceI userServiceI;

    @GetMapping(value = "/list")
    @RequestMapping(value = "/list")
    public R list() {
        return R.ok(userServiceI.list());
    }
}
