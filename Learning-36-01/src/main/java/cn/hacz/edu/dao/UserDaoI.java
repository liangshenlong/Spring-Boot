package cn.hacz.edu.dao;

import cn.hacz.edu.entity.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.io.Serializable;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：guod
 * Date：2017/11/28
 * Time：16:00
 * Description：功能模块：
 * JDK：V1.8
 * GitHub地址：https://github.com/s121528
 * ========================
 */
public interface UserDaoI extends MongoRepository<UserEntity, Serializable> {
    UserEntity findByName(String name);
}
