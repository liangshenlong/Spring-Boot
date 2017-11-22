package cn.hacz.edu.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("cn.hacz.edu.aop")
@EnableAspectJAutoProxy //1
public class AopConfig {

}
