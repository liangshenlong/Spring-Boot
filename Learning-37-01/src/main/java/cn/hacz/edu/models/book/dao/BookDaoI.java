package cn.hacz.edu.models.book.dao;

import cn.hacz.edu.models.base.BaseDaoI;
import cn.hacz.edu.models.book.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.List;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：guod
 * Date：2017/11/30
 * Time：9:20
 * Description：功能模块：
 * JDK：V1.8
 * GitHub地址：https://github.com/s121528
 * ========================
 */
public interface BookDaoI extends BaseDaoI<BookEntity> {
    List<BookEntity> findByName();
}
