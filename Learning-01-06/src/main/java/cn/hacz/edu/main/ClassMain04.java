package cn.hacz.edu.main;

import java.lang.reflect.Method;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：Guod
 * Date：2017/11/29
 * Time：20:26
 * Description：功能模块：取得类中的全部方法
 * JDK：V1.8
 * GitHub地址：https://github.com/s121528
 * ========================
 */
public class ClassMain04 {
    public static void main(String[] args) throws Exception {
        Class<?> s = Class.forName("cn.hacz.edu.entity.Student");
        System.out.println(s.getPackage().getName());
        Method[] methods = s.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }
}
