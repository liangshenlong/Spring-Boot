package cn.hacz.edu.controller;

import cn.hacz.edu.message.ReponseMessage;
import cn.hacz.edu.message.SendMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：guod
 * Date：2017/11/29
 * Time：14:23
 * Description：功能模块：
 * JDK：V1.8
 * GitHub地址：https://github.com/s121528
 * ========================
 */
@Controller
public class MessageController {
    @MessageMapping("/welcome")
    @SendTo("/topic/getResponse")
    public ReponseMessage say(SendMessage message) throws Exception {
        //等待3秒返回消息内容
        Thread.sleep(3000);
        return new ReponseMessage("欢迎使用webScoket：" + message.getName());
    }
}
