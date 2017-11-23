package cn.hacz.edu.service.impl;

import cn.hacz.edu.dao.UserDaoI;
import cn.hacz.edu.entity.UserEntity;
import cn.hacz.edu.service.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：guod
 * Date：2017/11/23
 * Time：11:08
 * Description：功能模块：
 * GitHub地址：https://github.com/s121528
 * ========================
 */
@Service
public class UserServiecImpl implements UserServiceI {
    @Autowired
    private UserDaoI userDaoI;

    @Override
    public void insertUserTwo() {
        // 此处可以验证事物
        UserEntity userEntity01 = new UserEntity();
        userEntity01.setName("001");
        userEntity01.setAge(15);
        userDaoI.save(userEntity01);

        UserEntity userEntity02 = new UserEntity();
        userEntity01.setName("002");
        userEntity01.setAge(22);
        userDaoI.save(userEntity02);
    }
}
