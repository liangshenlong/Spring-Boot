package cn.hacz.edu.main;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：Guod
 * Date：2017/11/29
 * Time：20:26
 * Description：功能模块：通过Java反射机制得到类的包名和类名
 * JDK：V1.8
 * GitHub地址：https://github.com/s121528
 * ========================
 */
public class ClassMain03 {
    public static void main(String[] args) throws Exception {
        Class<?> s = Class.forName("cn.hacz.edu.entity.Student");
        System.out.println("完整类名：" + s.getPackage().getName());
        System.out.printf("完整类名：" + s.getClass().getName());
    }
}
