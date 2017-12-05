package cn.hacz.edu.entity;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：guod
 * Date：2017/12/5
 * Time：15:31
 * Description：功能模块：
 * JDK：V1.8
 * GitHub地址：https://github.com/s121528
 * ========================
 */
public class Student {
    private String name;
    private int age;
    private String add;

    public Student() {
    }

    public Student(String name, int age, String add) {
        this.name = name;
        this.age = age;
        this.add = add;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", add='" + add + '\'' +
                '}';
    }
}
