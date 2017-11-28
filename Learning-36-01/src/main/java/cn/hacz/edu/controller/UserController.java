package cn.hacz.edu.controller;

import cn.hacz.edu.entity.UserEntity;
import cn.hacz.edu.service.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
public class UserController {
    @Autowired
    private UserServiceI userServiceI;
    @Autowired
    private MongoTemplate mongoTemplate;

    @GetMapping("/save")
    public UserEntity save() {
        UserEntity user = new UserEntity(3, "dong", 21);
        userServiceI.save(user);
        return user;
    }

    @GetMapping("/findByName")
    public UserEntity findByName(@RequestParam("name") String name) {
        UserEntity user = userServiceI.findByName(name);
        return user;
    }
}
