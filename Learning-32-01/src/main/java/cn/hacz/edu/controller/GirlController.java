package cn.hacz.edu.controller;

import cn.hacz.edu.dao.GirlDaoI;
import cn.hacz.edu.entity.GirlEntity;
import cn.hacz.edu.webexception.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GirlController {
    @Autowired
    private GirlDaoI girlDaoI;

    @GetMapping(value = "/getAllGirl")
    public R getAllGirl() {
        return R.ok(girlDaoI.findAll());
    }

    @PostMapping(value = "/insertOneGirl")
    public R insertOneGirl(GirlEntity girlEntity) {
        return R.ok(girlDaoI.save(girlEntity));
    }
}
