package cn.hacz.edu.vo;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * project -
 *
 * @author guo
 * @version 3.0
 * @date 日期:2017年8月23日 时间:下午6:54:18
 * @JDK:version used:jdk1.7
 * @Description 功能模块：
 */

public class VolumeVo {

    @JacksonXmlProperty(isAttribute = true)
    private String id;

    @JacksonXmlProperty(isAttribute = true)
    private String name;

    @Override
    public String toString() {
        return "VolumeVo [id=" + id + ", name=" + name + ", classVo=" + classVo + ", articleVo=" + articleVo + "]";
    }

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "Class")
    private List<ClassVo> classVo = new ArrayList<>();

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "Article")
    private List<ArticleVo> articleVo = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ClassVo> getClassVo() {
        return classVo;
    }

    public void setClassVo(List<ClassVo> classVo) {
        this.classVo = classVo;
    }

    public List<ArticleVo> getArticleVo() {
        return articleVo;
    }

    public void setArticleVo(List<ArticleVo> articleVo) {
        this.articleVo = articleVo;
    }

}
