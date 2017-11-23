package cn.hacz.edu.web.api;

import cn.hacz.edu.entity.UserEntity;
import cn.hacz.edu.webexception.R;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;


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
public class ClientRestController {
    /**
     * getForObject时,路径做为参数
     *
     * @return
     */
    @RequestMapping(value = "/clientGetForObject")
    public R clientGetForObject() {
        RestTemplate restTemplate = new RestTemplate();
        UserEntity forObject = restTemplate.getForObject("http://localhost:8080/getFindOneUser/{id}", UserEntity.class, "1");
        return R.ok(forObject);
    }

    @RequestMapping(value = "/contextLoads", produces = "application/json")
    public void contextLoads() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/getFindOneUser";
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url)
                .queryParam("name", "guod");
        R postForObject = restTemplate.getForObject(builder.build().encode().toUri(), R.class);
    }



    /**
     * form表单参数
     *
     * @return
     */
    @RequestMapping(value = "/clientGetForm")
    public R clientGetForm() {
        RestTemplate restTemplate = new RestTemplate();
        MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
        map.add("name", "guod");
        map.add("age", "15");
        R forObject = restTemplate.postForObject("http://localhost:8080/addUser", map, R.class);
        return forObject;
    }

    /**
     * json参数
     *
     * @return
     */
    @RequestMapping(value = "/clientGetJson")
    public R clientGetJson() {
        RestTemplate restTemplate = new RestTemplate();
        UserEntity u = new UserEntity();
        u.setName("zhangsan");
        UserEntity userEntity = restTemplate.postForObject("http://localhost:8080/clientGetForm", u, UserEntity.class);
        return R.ok(userEntity);
    }
}
