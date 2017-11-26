package cn.hacz.edu.webexception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * project - spring boot
 *
 * @author guod
 * @date 日期:2017年10月31日 时间:下午7:41:51
 * @JDK:version used:jdk1.8
 * @version 3.0
 * @Description 功能模块：controller的日志、http接口调用
 */
@RestController
public class BaseController {

	protected final Logger logger = LoggerFactory.getLogger(this.getClass());

	protected RestTemplate restTemplate = new RestTemplate();

}