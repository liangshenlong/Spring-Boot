package cn.hacz.edu;

import cn.hacz.edu.properties.UrlProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Learning0103ApplicationTests {
    @Autowired
    private UrlProperties urlProperties;

    @Test
    public void contextLoads() {
        System.out.println(urlProperties.getUrl().get(2));
    }

}
