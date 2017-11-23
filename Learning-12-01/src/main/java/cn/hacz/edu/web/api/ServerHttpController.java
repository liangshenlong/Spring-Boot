package cn.hacz.edu.web.api;

import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：guod
 * Date：2017/11/23
 * Time：11:56
 * Description：功能模块：
 * GitHub地址：https://github.com/s121528
 * ========================
 */
@Controller
public class ServerHttpController {
    @RequestMapping(value = "/httpApiRequest")
    public void httpApiRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        request.setCharacterEncoding("UTF-8");
        // 这句话的意思，是让浏览器用utf8来解析返回的数据
        response.setHeader("Content-type", "text/html;charset=UTF-8");
        Map<String, Object> postParamMap = new HashMap<String, Object>();
        postParamMap.put("code", "0001");
        postParamMap.put("codeMsg", "调用成功!");
        postParamMap.put("time", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        postParamMap.put("success", "true");
        String jsonString = JSON.toJSONString(postParamMap);
        response.getWriter().write(jsonString);
    }
}
