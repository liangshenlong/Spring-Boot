package cn.hacz.edu.webexception;

/**
 * project - spring boot
 *
 * @author guod
 * @date 日期:2017年10月31日 时间:下午7:42:16
 * @JDK:version used:jdk1.8
 * @version 3.0
 * @Description 功能模块：自定义异常处理
 */
public class MyException extends RuntimeException {

	private static final long serialVersionUID = 5262995294021309166L;
	private Integer code;

	public MyException(ResultEnum resultEnum) {
		super(resultEnum.getMsg());
		this.code = resultEnum.getCode();
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}
}
