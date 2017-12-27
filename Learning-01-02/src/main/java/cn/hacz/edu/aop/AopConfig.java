package cn.hacz.edu.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author guod
 */
@Configuration
@ComponentScan("cn.hacz.edu.aop")
@EnableAspectJAutoProxy
public class AopConfig {

}