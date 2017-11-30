package cn.hacz.edu.models.user.entity;

import cn.hacz.edu.webexception.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：guod
 * Date：2017/11/30
 * Time：9:10
 * Description：功能模块：
 * JDK：V1.8
 * GitHub地址：https://github.com/s121528
 * ========================
 */
@Entity
@Table(name = "guo")
public class UserEntity extends BaseEntity {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
