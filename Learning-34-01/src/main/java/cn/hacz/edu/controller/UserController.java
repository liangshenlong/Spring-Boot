package cn.hacz.edu.controller;

import cn.hacz.edu.model.User;
import cn.hacz.edu.service.UserServiceI;
import cn.hacz.edu.webexception.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：guod
 * Date：2017/11/27
 * Time：8:53
 * Description：功能模块：
 * GitHub地址：https://github.com/s121528
 * ========================
 */
@RestController
public class UserController {
    @Autowired
    private UserServiceI userServiceI;

    @ResponseBody
    @RequestMapping(value = "/add", produces = {"application/json;charset=UTF-8"})
    public R addUser(User user) {
        return R.ok(userServiceI.addUser(user));
    }

    @RequestMapping(value = "/all/{pageNum}/{pageSize}", produces = {"application/json;charset=UTF-8"})
    public R findAllUser(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize) {

        return R.ok(userServiceI.findAllUser(pageNum, pageSize));
    }

}
