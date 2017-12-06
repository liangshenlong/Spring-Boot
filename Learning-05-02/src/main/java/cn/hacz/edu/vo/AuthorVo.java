package cn.hacz.edu.vo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * project -
 *
 * @author guo
 * @date 日期:2017年8月23日 时间:下午7:23:39
 * @JDK:version used:jdk1.7
 * @version 3.0
 * @Description 功能模块：
 */

public class AuthorVo {
	@JacksonXmlProperty(localName = "Block")
	private BlockVo blockVo;

	public BlockVo getBlockVo() {
		return blockVo;
	}

	public void setBlockVo(BlockVo blockVo) {
		this.blockVo = blockVo;
	}

}
