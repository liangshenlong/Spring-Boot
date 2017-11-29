package cn.hacz.edu.main;

import cn.hacz.edu.entity.Student;

import java.lang.reflect.Constructor;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：Guod
 * Date：2017/11/29
 * Time：20:13
 * Description：功能模块：调用有参构造器进行实例化（重点）
 * JDK：V1.8
 * GitHub地址：https://github.com/s121528
 * ========================
 */
public class ClassMain02 {
    public static void main(String[] args) throws Exception {
        Constructor<?>[] constructors = Class.forName("cn.hacz.edu.entity.Student").getConstructors();
        Student student = (Student) constructors[1].newInstance("guo", "调用有参构造器进行实例化（重点）");
        System.out.println(student);
    }
}
