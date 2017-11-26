package cn.hacz.edu.vo;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class UserVO {
    @NotNull(groups = ValidationLogin.class, message = "id不能为空")
    private Integer id;
    @NotNull(groups = ValidationLogin.class, message = "姓名不能为空")
    private String name;
    @Max(value = 22)
    @Min(value = 18)
    private Integer age;
    private boolean delete;

    // 分组验证接口
    public interface ValidationLogin {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public boolean isDelete() {
        return delete;
    }

    public void setDelete(boolean delete) {
        this.delete = delete;
    }
}
