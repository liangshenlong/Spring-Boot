package cn.hacz.edu.hello;

import java.lang.annotation.*;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：guod
 * Date：2017/12/1
 * Time：11:20
 * Description：功能模块：第一步，定义一个HelloWorld注解
 * JDK：V1.8
 * GitHub地址：https://github.com/s121528
 * ========================
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)//定义了注解的作用位置：在方法上
@Inherited//允许子类继承父类中的注解
public @interface HelloWorld {
    String name() default "";

    String group() default "World";
}
