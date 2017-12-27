package cn.hacz.edu.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * ========================
 * project -
 *
 * @author guod
 * @version 3.0
 * @date 日期:2017/12/27 时间:11:43
 * @JDK: v1.8
 * @Description 功能模块：
 * GitHub地址：https://github.com/s121528
 * ========================
 */
public class JSR250WayService {
    @PostConstruct
    public void init() {
        System.out.println("JSR250-init-method");
    }

    public JSR250WayService() {
        super();
        System.out.println("初始化构造函数");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("JSR250-destroy-method");
    }
}
