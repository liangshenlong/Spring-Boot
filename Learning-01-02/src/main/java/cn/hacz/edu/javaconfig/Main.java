package cn.hacz.edu.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author guod
 */
public class Main {
    public static void main(String[] args) {
        // 通过Java配置来实例化Spring容器
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        // 在Spring容器中获取Bean对象
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);

        // 调用对象中的方法
        System.out.println(useFunctionService.SayHello("java config"));

        context.close();

    }
}
