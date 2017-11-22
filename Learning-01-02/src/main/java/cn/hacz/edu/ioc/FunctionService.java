package cn.hacz.edu.ioc;

import org.springframework.stereotype.Service;

@Service //1
public class FunctionService {
	public String sayHello(String word){
		return "Hello " + word +" !"; 
	}

}
