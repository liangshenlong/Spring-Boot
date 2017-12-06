package cn.hacz.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ========================
 * project -
 *
 * @author guod
 * @version 3.0
 * @date 日期:2017/12/6 时间:13:51
 * @JDK: v1.8
 * @Description 功能模块：
 * GitHub地址：https://github.com/s121528
 * ========================
 */
@Controller
public class Upload02Controller {
    @RequestMapping(value = "/upload01")
    public String upload01(@RequestParam("image_icon") CommonsMultipartFile file, HttpServletRequest request, HttpServletResponse response) {
        return "";
    }
}
