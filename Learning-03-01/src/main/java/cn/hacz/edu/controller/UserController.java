package cn.hacz.edu.controller;

import cn.hacz.edu.dao.UserDaoI;
import cn.hacz.edu.webexception.BaseController;
import cn.hacz.edu.webexception.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController extends BaseController {
    @Autowired
    private UserDaoI userDaoI;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public R list() {
        return R.ok(userDaoI.findAll());
    }
}
