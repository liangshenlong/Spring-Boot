package cn.hacz.edu.hello;

import java.lang.reflect.InvocationTargetException;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：guod
 * Date：2017/12/1
 * Time：11:21
 * Description：功能模块：测试注解
 * JDK：V1.8
 * GitHub地址：https://github.com/s121528
 * ========================
 */
public class MainTest {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        testApp();
    }

    public static void testApp() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        ParseAnnotation pa = new ParseAnnotation();
        pa.parseMethod(SayHello.class);
    }
}
