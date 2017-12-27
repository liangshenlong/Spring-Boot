package cn.hacz.edu.aop;

import org.springframework.stereotype.Service;

/**
 * 功能：编写使用方法规则被拦截的类
 *
 * @author guod
 */
@Service
public class DemoAnnotationService {
    @Action(name = "注解式拦截的add操作")
    public void add() {

    }

}
