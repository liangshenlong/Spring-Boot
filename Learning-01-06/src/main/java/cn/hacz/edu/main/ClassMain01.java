package cn.hacz.edu.main;

import cn.hacz.edu.entity.Student;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：Guod
 * Date：2017/11/29
 * Time：20:13
 * Description：功能模块：调用无参构造器进行实例化
 * JDK：V1.8
 * GitHub地址：https://github.com/s121528
 * ========================
 */
public class ClassMain01 {
    public static void main(String[] args) throws Exception {
        Student student = (Student) Class.forName("cn.hacz.edu.entity.Student").newInstance();
        student.setAge(12);
        student.setName("guo");
        student.setSchool("调用无参构造器进行实例化");
        System.out.println(student);
    }
}
