package cn.hacz.edu.vo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * project -
 *
 * @author guo
 * @date 日期:2017年8月23日 时间:下午7:13:04
 * @JDK:version used:jdk1.7
 * @version 3.0
 * @Description 功能模块：
 */

public class ArticleVo {
	@JacksonXmlProperty(isAttribute = true)
	private String id;

	@JacksonXmlProperty(localName = "Title")
	private TitleVo titleVo;

	@JacksonXmlProperty(localName = "Author")
	private AuthorVo authorVo;

	@JacksonXmlProperty(localName = "Paragraph")
	private ParagraphVo paragraphVo = new ParagraphVo();

	public AuthorVo getAuthorVo() {
		return authorVo;
	}

	public String getId() {
		return id;
	}

	public ParagraphVo getParagraphVo() {
		return paragraphVo;
	}

	public TitleVo getTitleVo() {
		return titleVo;
	}

	public void setAuthorVo(AuthorVo authorVo) {
		this.authorVo = authorVo;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setParagraphVo(ParagraphVo paragraphVo) {
		this.paragraphVo = paragraphVo;
	}

	public void setTitleVo(TitleVo titleVo) {
		this.titleVo = titleVo;
	}

}
