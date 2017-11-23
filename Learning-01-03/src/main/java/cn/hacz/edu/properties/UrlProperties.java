package cn.hacz.edu.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：Guod
 * Date：2017/11/23
 * Time：7:56
 * Description：功能模块：
 * GitHub地址：https://github.com/s121528
 * ========================
 */
@Component
@ConfigurationProperties("properties.guod")
public class UrlProperties {
    private String ip;

    private int port;

    public List<String> url;

    private String systemPos;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public List<String> getUrl() {
        return url;
    }

    public void setUrl(List<String> url) {
        this.url = url;
    }

    public String getSystemPos() {
        return systemPos;
    }

    public void setSystemPos(String systemPos) {
        this.systemPos = systemPos;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    private String packageName;
}
