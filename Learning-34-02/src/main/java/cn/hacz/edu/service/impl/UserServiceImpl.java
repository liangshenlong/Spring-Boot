package cn.hacz.edu.service.impl;

import cn.hacz.edu.mapper.UserMapper;
import cn.hacz.edu.model.User;
import cn.hacz.edu.service.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：guod
 * Date：2017/12/4
 * Time：14:47
 * Description：功能模块：
 * JDK：V1.8
 * GitHub地址：https://github.com/s121528
 * ========================
 */
@Service
public class UserServiceImpl implements UserServiceI {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUser() {
        return null;
    }
}
