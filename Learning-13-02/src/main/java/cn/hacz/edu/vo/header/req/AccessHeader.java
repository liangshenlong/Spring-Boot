package cn.hacz.edu.vo.header.req;

import cn.hacz.edu.vo.header.Header;

/**
 * ========================
 * project -
 *
 * @author guod
 * @version 3.0
 * @date 日期:2018/1/2 时间:11:15
 * @JDK: v1.8
 * @Description 功能模块：
 * GitHub地址：https://github.com/s121528
 * ========================
 */
public class AccessHeader implements Header {
    private String orgCode;

    private String userName;

    private String passWd;

    private String topicName;

    private String topicCode;

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWd() {
        return passWd;
    }

    public void setPassWd(String passWd) {
        this.passWd = passWd;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getTopicCode() {
        return topicCode;
    }

    public void setTopicCode(String topicCode) {
        this.topicCode = topicCode;
    }
}
