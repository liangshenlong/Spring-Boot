package cn.hacz.edu.config;

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

public class SpringMvcConfig extends WebMvcConfigurerAdapter {
    //自定义静态资源文件路径
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/yuqiyu/9/resources/**").addResourceLocations("classpath:/static/");
    }
}
