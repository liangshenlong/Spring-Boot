package cn.hacz.edu;

import cn.hacz.edu.controller.UserFunctionController;
import cn.hacz.edu.service.FunctionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Learning0104ApplicationTests {
    @Autowired
    private UserFunctionController userFunctionController;
    @Autowired
    private FunctionService functionService;

    @Test
    public void contextLoads() {
        System.out.println(userFunctionController.sayHello());
        System.out.println(functionService.say("hello word"));
    }

}
