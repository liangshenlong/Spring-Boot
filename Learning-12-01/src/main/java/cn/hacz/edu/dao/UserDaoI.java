package cn.hacz.edu.dao;

import cn.hacz.edu.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.List;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：guod
 * Date：2017/11/23
 * Time：9:55
 * Description：功能模块：
 * GitHub地址：https://github.com/s121528
 * ========================
 */
public interface UserDaoI extends JpaRepository<UserEntity, Serializable> {
    List<UserEntity> findByName(String name);

    List<UserEntity> findByAge(Integer age);
}
