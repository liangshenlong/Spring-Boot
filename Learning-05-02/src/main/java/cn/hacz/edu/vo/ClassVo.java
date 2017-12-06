package cn.hacz.edu.vo;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * project -
 *
 * @author guo
 * @date 日期:2017年8月23日 时间:下午6:58:12
 * @JDK:version used:jdk1.7
 * @version 3.0
 * @Description 功能模块：
 */

public class ClassVo {

	@JacksonXmlProperty(isAttribute = true)
	private String level;

	@JacksonXmlProperty(localName = "Block")
	@JacksonXmlElementWrapper(useWrapping = false)
	private List<BlockVo> blockVo = new ArrayList<>();

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public List<BlockVo> getBlockVo() {
		return blockVo;
	}

	public void setBlockVo(List<BlockVo> blockVo) {
		this.blockVo = blockVo;
	}

}
