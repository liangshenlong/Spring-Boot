package cn.hacz.edu.prepost;

/**
 * ========================
 * project -
 *
 * @author guod
 * @version 3.0
 * @date 日期:2017/12/27 时间:11:41
 * @JDK: v1.8
 * @Description 功能模块：
 * GitHub地址：https://github.com/s121528
 * ========================
 */
public class BeanWayService {
    public void init() {
        System.out.println("@bean-init-method");
    }

    public BeanWayService() {
        super();
        System.out.println("初始化构造函数");
    }

    public void destroy() {
        System.out.println("@bean-destroy-method");
    }
}
