package cn.hacz.edu.config;

import cn.hacz.edu.controller.UserFunctionController;
import cn.hacz.edu.service.FunctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：guod
 * Date：2017/11/30
 * Time：10:23
 * Description：功能模块：
 * JDK：V1.8
 * GitHub地址：https://github.com/s121528
 * ========================
 */
@Configuration
public class JavaConfig {
    @Bean
    public FunctionService functionService() {
        return new FunctionService();
    }

    @Bean
    public UserFunctionController userFunctionController() {
        UserFunctionController userFunctionController = new UserFunctionController();
        userFunctionController.setFunctionService(functionService());
        return userFunctionController;
    }
}
