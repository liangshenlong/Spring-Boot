package cn.hacz.edu.service.impl;

import cn.hacz.edu.dao.UserDaoI;
import cn.hacz.edu.entity.UserEntity;
import cn.hacz.edu.service.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：guod
 * Date：2017/11/27
 * Time：9:34
 * Description：功能模块：
 * GitHub地址：https://github.com/s121528
 * ========================
 */
@Service(value = "userServiceI")
@CacheConfig(cacheNames = "user")
public class UserServiceImpl implements UserServiceI {
    @Autowired
    private UserDaoI userDaoI;

    @Cacheable
    public List<UserEntity> list() {
        return userDaoI.findAll();
    }
}
