package cn.hacz.edu.vo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

/**
 * project -
 *
 * @author guo
 * @date 日期:2017年8月23日 时间:下午7:02:06
 * @JDK:version used:jdk1.7
 * @version 3.0
 * @Description 功能模块：
 */

public class BlockVo {
	@JacksonXmlProperty(isAttribute = true)
	private String page;
	@JacksonXmlProperty(isAttribute = true)
	private String type;
	
	@JacksonXmlText
	private String content = "assdf";

	public String getPage() {
		return page;
	}

	public String getType() {
		return type;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
