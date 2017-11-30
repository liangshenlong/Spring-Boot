package cn.hacz.edu.models.base;

import cn.hacz.edu.models.book.entity.BookEntity;
import cn.hacz.edu.models.user.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import sun.plugin2.message.Serializer;

import java.io.Serializable;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：guod
 * Date：2017/11/30
 * Time：9:17
 * Description：功能模块：如需自定义CRUD函数，可自己在继承该接口的子接口内实现
 * JDK：V1.8
 * GitHub地址：https://github.com/s121528
 * ========================
 */
public interface BaseDaoI<T> extends JpaRepository<T, Serializable>, JpaSpecificationExecutor<T>, Serializable {
    UserEntity findUser(@Param("name") String name);
}
