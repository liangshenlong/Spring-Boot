package cn.hacz.edu.service;

import cn.hacz.edu.model.User;

import java.util.List;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：guod
 * Date：2017/11/27
 * Time：8:48
 * Description：功能模块：
 * GitHub地址：https://github.com/s121528
 * ========================
 */
public interface UserServiceI {
    int addUser(User user);

    List<User> findAllUser(int pageNum, int pageSize);
}
