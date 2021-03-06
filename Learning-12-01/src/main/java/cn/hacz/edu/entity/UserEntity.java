package cn.hacz.edu.entity;

import cn.hacz.edu.webexception.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：guod
 * Date：2017/11/23
 * Time：9:30
 * Description：功能模块：
 * GitHub地址：https://github.com/s121528
 * ========================
 */
@Entity
@Table(name = "guo_user")
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
