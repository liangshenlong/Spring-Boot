package cn.hacz.edu.controller;

import cn.hacz.edu.dao.UserEntityDaoI;
import cn.hacz.edu.entity.Student;
import cn.hacz.edu.entity.UserEntity;
import cn.hacz.edu.service.UserServiceI;
import cn.hacz.edu.webexception.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ========================
 * project -
 *
 * @author guod
 * @version 3.0
 * @date 日期:2017/12/6 时间:10:15
 * @JDK: v1.8
 * @Description 功能模块：
 * GitHub地址：https://github.com/s121528
 * ========================
 */
@RestController
public class ExcelController {
    @Autowired
    private UserServiceI userServiceI;

    @RequestMapping(value = "/writeExcel01")
    public R writeExcel01(MultipartFile file,HttpServletRequest request) {
        Map<String, Object> param = new HashMap<>(16);
        List<UserEntity> allUsers = new ArrayList<>();
        try {
            List<String[]> userList = PoiUtils.readExcel(file);
            for (int i = 0; i < userList.size(); i++) {
                String[] users = userList.get(i);
                UserEntity user = new UserEntity();
                user.setName(users[0]);
                user.setAddress(users[1]);
                allUsers.add(user);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        param.put("allUsers", allUsers);
        userServiceI.insertUsers(param);
        return R.ok(allUsers);
    }
}
