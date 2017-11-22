package cn.hacz.edu.webexception;

/**
 * project - spring boot
 *
 * @author guod
 * @date 日期:2017年10月31日 时间:下午7:42:48
 * @JDK:version used:jdk1.8
 * @version 3.0
 * @Description 功能模块：错误码统一返回管理
 */
public enum ResultEnum {
	UNKONW_ERROR(-1, "未知错误"), 
	SUCCESS(0, "成功"), 
	PRIMARY_SCHOOL(100, "我猜你可能还在上小学"),
	MIDDLE_SCHOOL(101, "你可能在上初中"),
	VALID_ERROR(101, "验证出错"),
	;

	private Integer code;

	private String msg;

	ResultEnum(Integer code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public Integer getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}
}
