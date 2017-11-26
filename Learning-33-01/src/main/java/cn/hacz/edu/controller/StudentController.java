package cn.hacz.edu.controller;

import cn.hacz.edu.service.StudentServiceI;
import cn.hacz.edu.webexception.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private StudentServiceI studentServiceI;

    @RequestMapping(value = "/createTable")
    public R createTable() {
        return R.ok(studentServiceI.createTable("tb_student"));
    }
}
