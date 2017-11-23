package cn.hacz.edu.web.api;

import cn.hacz.edu.entity.UserEntity;
import cn.hacz.edu.webexception.R;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：guod
 * Date：2017/11/23
 * Time：9:43
 * Description：功能模块：
 * GitHub地址：https://github.com/s121528
 * ========================
 */
@RestController
public class ClientController {
    @RequestMapping(value = "/javatest")
    public R index() {
        RestTemplate restTemplate = new RestTemplate();
        UserEntity forObject = restTemplate.getForObject("http://localhost:8080/getFindOneUser/{id}", UserEntity.class, "1");
        return R.ok(forObject);
    }
}
