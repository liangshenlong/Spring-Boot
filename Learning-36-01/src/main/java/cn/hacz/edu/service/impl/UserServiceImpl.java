package cn.hacz.edu.service.impl;

import cn.hacz.edu.dao.UserDaoI;
import cn.hacz.edu.entity.UserEntity;
import cn.hacz.edu.service.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：guod
 * Date：2017/11/28
 * Time：16:02
 * Description：功能模块：
 * JDK：V1.8
 * GitHub地址：https://github.com/s121528
 * ========================
 */
@Service
public class UserServiceImpl implements UserServiceI {
    @Autowired
    private UserDaoI userDaoI;

    @Override
    public void save(UserEntity user) {
        userDaoI.save(user);
    }

    @Override
    public UserEntity findByName(String name) {
        return this.userDaoI.findByName(name);
    }
}
