package cn.hacz.edu.ioc;

import org.springframework.stereotype.Service;

/**
 * @author guod
 */
@Service
public class FunctionService {
	public String sayHello(String word){
		return "Hello " + word +" !"; 
	}

}
