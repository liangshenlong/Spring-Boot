package cn.hacz.edu.controller;

import cn.hacz.edu.vo.UsersVo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ========================
 * project -
 *
 * @author guod
 * @version 3.0
 * @date 日期:2017/12/6 时间:14:38
 * @JDK: v1.8
 * @Description 功能模块：
 * GitHub地址：https://github.com/s121528
 * ========================
 */
@RestController
public class IndexControlelr {
    @RequestMapping("/login")
    public void login(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("user");
        System.out.println(name);
    }

    @RequestMapping(value = "/addUsers", method = RequestMethod.POST)
    public @ResponseBody
    String addUsers(UsersVo vo) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(vo);
        System.out.println(json);
        return "a";
    }
}
