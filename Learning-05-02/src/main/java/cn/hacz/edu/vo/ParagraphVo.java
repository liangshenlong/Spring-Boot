package cn.hacz.edu.vo;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * project -
 *
 * @author guo
 * @date 日期:2017年8月23日 时间:下午7:27:03
 * @JDK:version used:jdk1.7
 * @version 3.0
 * @Description 功能模块：
 */

public class ParagraphVo {
	@JacksonXmlProperty(isAttribute = true)
	private String id;

	@JacksonXmlProperty(localName = "Block")
	private List<BlockVo> blockVo = new ArrayList<>();
	
	@JacksonXmlElementWrapper(useWrapping = false)
	private List<MarkVo> markVo = new ArrayList<>(); 

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<BlockVo> getBlockVo() {
		return blockVo;
	}

	public void setBlockVo(List<BlockVo> blockVo) {
		this.blockVo = blockVo;
	}

	public List<MarkVo> getMarkVo() {
		return markVo;
	}

	public void setMarkVo(List<MarkVo> markVo) {
		this.markVo = markVo;
	}

}
