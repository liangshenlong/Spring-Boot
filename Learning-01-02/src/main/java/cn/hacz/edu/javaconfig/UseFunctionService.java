package cn.hacz.edu.javaconfig;

/**
 * 功能：使用功能类的bean
 *
 * @author guod
 */
public class UseFunctionService {
    FunctionService functionService;

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public String SayHello(String word) {
        return functionService.sayHello(word);
    }

}
