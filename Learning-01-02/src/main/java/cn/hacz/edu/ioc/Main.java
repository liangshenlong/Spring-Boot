package cn.hacz.edu.ioc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author guod
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);

        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);

        System.out.println(useFunctionService.SayHello("world"));

        context.close();
    }
}
