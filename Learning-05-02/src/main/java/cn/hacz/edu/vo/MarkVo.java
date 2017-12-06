package cn.hacz.edu.vo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class MarkVo {
	
	@JacksonXmlProperty(isAttribute = true)
	private String id;
	
	private BlockVo blockVo;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public BlockVo getBlockVo() {
		return blockVo;
	}

	public void setBlockVo(BlockVo blockVo) {
		this.blockVo = blockVo;
	}

}
