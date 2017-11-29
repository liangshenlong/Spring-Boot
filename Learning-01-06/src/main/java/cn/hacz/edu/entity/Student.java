package cn.hacz.edu.entity;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：Guod
 * Date：2017/11/29
 * Time：20:12
 * Description：功能模块：
 * JDK：V1.8
 * GitHub地址：https://github.com/s121528
 * ========================
 */
public class Student {
    private String name;
    private Integer age;
    private String school;

    public Student() {
    }

    public Student(String name, String school) {
        this.name = name;
        this.school = school;
    }

    public Student(String name, Integer age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
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

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school='" + school + '\'' +
                '}';
    }
}
