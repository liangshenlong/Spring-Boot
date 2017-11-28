package cn.hacz.edu.service;

import cn.hacz.edu.entity.UserEntity;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：guod
 * Date：2017/11/28
 * Time：16:01
 * Description：功能模块：
 * JDK：V1.8
 * GitHub地址：https://github.com/s121528
 * ========================
 */
public interface UserServiceI {
    void save(UserEntity user);

    UserEntity findByName(String name);
}
