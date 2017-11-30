package cn.hacz.edu.models.book.entity;

import cn.hacz.edu.webexception.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：guod
 * Date：2017/11/30
 * Time：8:57
 * Description：功能模块：
 * JDK：V1.8
 * GitHub地址：https://github.com/s121528
 * ========================
 */
@Entity
@Table(name = "sun")
public class BookEntity extends BaseEntity {
    private String name;
    private Integer price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
