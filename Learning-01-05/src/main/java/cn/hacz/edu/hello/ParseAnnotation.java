package cn.hacz.edu.hello;

import cn.hacz.edu.hello.HelloWorld;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：guod
 * Date：2017/12/1
 * Time：11:20
 * Description：功能模块：新建一个注解解析类，底层通过反射机制实现
 * JDK：V1.8
 * GitHub地址：https://github.com/s121528
 * ========================
 */
public class ParseAnnotation {
    public void parseMethod(Class clazz) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        Object obj = clazz.newInstance();
        Method[] methods = clazz.getDeclaredMethods();

        for (Method m : methods) {
            HelloWorld hello = m.getAnnotation(HelloWorld.class);
            String group;
            String name;
            if (hello != null) {
                name = hello.name();
                group = hello.group();
                m.invoke(obj, name);
                m.invoke(obj, group);
            }
        }
    }
}
