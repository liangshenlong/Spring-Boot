package cn.hacz.edu.annotation;

import java.lang.annotation.*;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：guod
 * Date：2017/11/29
 * Time：17:12
 * Description：功能模块：
 * JDK：V1.8
 * GitHub地址：https://github.com/s121528
 * ========================
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitColor {
    public enum Color {
        BLUE,
        RED,
        GREEN
    }

    ;

    Color fruitColor() default Color.GREEN;
}
