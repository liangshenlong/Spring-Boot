package cn.hacz.edu;

import cn.hacz.edu.javaconfig.FunctionService;
import cn.hacz.edu.javaconfig.UseFunctionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Learning0102ApplicationTests {
    @Autowired
    private UseFunctionService useFunctionService;

    @Test
    public void contextLoads() {
        System.out.println(useFunctionService.SayHello("guod hello"));
    }

}
