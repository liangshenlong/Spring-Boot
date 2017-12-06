package cn.hacz.edu.webexception;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StopWatch;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * project - spring boot
 *
 * @author guod
 * @date 日期:2017年10月31日 时间:下午7:38:36
 * @JDK:version used:jdk1.8
 * @version 3.0
 * @Description 功能模块：Controller的日志切片
 */
@Aspect
@Configuration
public class ControllerAspect {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LogManager.getLogger(ControllerAspect.class.getName());

	@Autowired
	private SnowFlakeIdGenerator snowFlakeIdGenerator;

	@Autowired
	private ObjectMapper mapper;

	/**
	 * 所有Controller
	 */
	@Pointcut("execution(public * cn.hacz.edu.controller.*Controller.*(..))")
	public void pointcut() {
	}

	/**
	 * Spring 环绕通知 切点
	 *
	 * @param pjp
	 * @return
	 * @throws Throwable
	 */
	@Around("pointcut()")
	public Object around(ProceedingJoinPoint pjp) throws Throwable {

		RequestAttributes ra = RequestContextHolder.getRequestAttributes();
		ServletRequestAttributes sra = (ServletRequestAttributes) ra;
		HttpServletRequest request = sra.getRequest();

		String url = request.getRequestURL().toString();
		String method = request.getMethod();
		String uri = request.getRequestURI();
		String queryString = request.getQueryString();
		long logId = snowFlakeIdGenerator.generateLongId();
		logger.info("============================================");
		logger.info("请求开始, 各个参数, logid:{}, url: {}", logId, url);

		StopWatch watch = new StopWatch(String.valueOf(logId));
		watch.start();

		Object result = null;
		R j = null;
		try {
			result = pjp.proceed();
			j = (R) result;
			j.setSuccess(true);
		} catch (Throwable e) {
			logger.error("******************************");
			logger.error("出错详细日志logid:{}, url: {}, method: {}, uri: {}, params: {}", logId, url, method, uri, queryString);
			logger.error("出错 logId: " + logId, e);// 此处应该直接落地
			logger.error("******************************");
			throw e;
		}

		watch.stop();
		logger.info("请求结束，logId: {}, 执行时间 {} controller的返回值是 {}", logId, watch.getTotalTimeMillis(), mapper.writeValueAsString(result));
		logger.info("============================================");
		return result;
	}

}