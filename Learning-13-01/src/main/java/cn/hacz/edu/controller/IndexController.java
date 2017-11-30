package cn.hacz.edu.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：guod
 * Date：2017/11/30
 * Time：11:21
 * Description：功能模块：
 * JDK：V1.8
 * GitHub地址：https://github.com/s121528
 * ========================
 */
@RestController
@Api(description = "swagger接口",value = "value",tags = "taga")
public class IndexController {
    @ApiOperation(value = "查找", notes = "根据用户ID查找用户")
    @GetMapping(value = "/api/index")
    public String index() {
        return "java";
    }
}
