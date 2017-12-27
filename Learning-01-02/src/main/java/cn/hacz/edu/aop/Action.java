package cn.hacz.edu.aop;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 功能：编写拦截规则的注解，注解本身没有功能，注解和xml都是一种元数据，元数据是解释数据的数据，就是配置
 * 注解的功能来自使用注解的地方
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
