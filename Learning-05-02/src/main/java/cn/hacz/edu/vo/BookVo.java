package cn.hacz.edu.vo;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "book")
public class BookVo {

	@JacksonXmlProperty(isAttribute = true)
	private String id;

	@JacksonXmlProperty(isAttribute = true)
	private String name;

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<VolumeVo> volume = new ArrayList<>();

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "BookVo [id=" + id + ", name=" + name + ", volume=" + volume + "]";
	}

	public String getName() {
		return name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<VolumeVo> getVolume() {
		return volume;
	}

	public void setVolume(List<VolumeVo> volume) {
		this.volume = volume;
	}

}
