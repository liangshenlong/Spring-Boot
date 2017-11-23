package cn.hacz.edu.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service(value = "demoService")
public class DemoService {
	@Value("其他类的属性") // 1
	private String another;

	public String getAnother() {
		return another;
	}

	public void setAnother(String another) {
		this.another = another;
	}

}
