package cn.hacz.edu.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 功能：配置类，通过该注解来表明该类是一个Spring的配置，相当于一个xml文件
 *
 * @author guod
 */
@Configuration
public class JavaConfig {
    /**
     * 功能： 通过该注解来表明是一个Bean对象，相当于xml中的<bean>，bean名称是方法名称
     *
     * @return
     */
    @Bean
    public FunctionService functionService() {
        /**
         * 直接new对象做演示
         */
        return new FunctionService();
    }

    @Bean(name = "useFunctionService")
    public UseFunctionService useFunctionService() {
        UseFunctionService useFunctionService = new UseFunctionService();
        // 注入FunctionService的bean方式一
        useFunctionService.setFunctionService(functionService());
        return useFunctionService;
    }

    /**
     * 功能：注入FunctionService的bean方式一
     *
     * @param functionService
     * @return
     */
    @Bean
    public UseFunctionService useFunctionService(FunctionService functionService) {
        UseFunctionService useFunctionService = new UseFunctionService();
        useFunctionService.setFunctionService(functionService);
        return useFunctionService;
    }
}
