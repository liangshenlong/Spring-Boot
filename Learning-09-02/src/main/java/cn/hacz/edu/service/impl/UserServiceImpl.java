package cn.hacz.edu.service.impl;

import cn.hacz.edu.dao.UserEntityDaoI;
import cn.hacz.edu.entity.UserEntity;
import cn.hacz.edu.service.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * ========================
 * project -
 *
 * @author guod
 * @version 3.0
 * @date 日期:2017/12/6 时间:10:53
 * @JDK: v1.8
 * @Description 功能模块：
 * GitHub地址：https://github.com/s121528
 * ========================
 */
@Service
public class UserServiceImpl implements UserServiceI {
    @Autowired
    private UserEntityDaoI userEntityDaoI;

    @Override
    public void insertUsers(Map<String, Object> param) {
        for (String key : param.keySet()) {
            System.out.println(key);
        }
    }
}
