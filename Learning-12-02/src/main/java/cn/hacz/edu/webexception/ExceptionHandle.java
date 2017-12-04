package cn.hacz.edu.webexception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * project - spring boot
 *
 * @author guod
 * @date 日期:2017年10月31日 时间:下午7:41:03
 * @JDK:version used:jdk1.8
 * @version 3.0
 * @Description 功能模块：异常控制器
 */
@ControllerAdvice
public class ExceptionHandle {

	private final static Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

	@ExceptionHandler(value = Exception.class)
	@ResponseBody
	public R handle(Exception e) {
		if (e instanceof MyException) {
			MyException girlException = (MyException) e;
			return R.error("0001", girlException.getMessage());
		} else {
			logger.error("[系统异常]{}", e);
			return R.error("-1", "未知错误");
		}
	}
}
