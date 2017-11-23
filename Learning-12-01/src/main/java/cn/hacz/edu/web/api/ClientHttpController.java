package cn.hacz.edu.web.api;

import cn.hacz.edu.util.HttpClientUtil;
import cn.hacz.edu.webexception.R;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：guod
 * Date：2017/11/23
 * Time：11:55
 * Description：功能模块：
 * GitHub地址：https://github.com/s121528
 * ========================
 */
@RestController
public class ClientHttpController {
    @RequestMapping(value = "/clientHttpObj")
    public R clientHttpObj() {
        HttpClientUtil httpClientUtil = new HttpClientUtil();
        Map<String, String> map = new HashMap<>();
        String s = httpClientUtil.doGet("https://www.baidu.com");
        return R.ok(s);
    }

}
