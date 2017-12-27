package cn.hacz.edu.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * ========================
 * project -
 *
 * @author guod
 * @version 3.0
 * @date 日期:2017/12/27 时间:11:07
 * @JDK: v1.8
 * @Description 功能模块：
 * GitHub地址：https://github.com/s121528
 * ========================
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);
        ElConfig resourceService = context.getBean(ElConfig.class);
        resourceService.outputResource();
    }
}
