package cn.hacz.edu.hello;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：guod
 * Date：2017/12/1
 * Time：11:21
 * Description：功能模块：新建一个普通类，调用HelloWorld注解
 * JDK：V1.8
 * GitHub地址：https://github.com/s121528
 * ========================
 */
public class SayHello {
    @HelloWorld(name = "郭冬冬", group = "Java开发小组")
    public void say(String name) {
        if (name == null || name.equals("")) {
            System.out.println("hello world");
        } else {
            System.out.println("hello world\t" + name);
        }
    }
}
