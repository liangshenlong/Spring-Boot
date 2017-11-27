package cn.hacz.edu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.hacz.edu.mapper")//将项目中对应的mapper类的路径加进来就可以了
public class Learning3401Application {

    public static void main(String[] args) {
        SpringApplication.run(Learning3401Application.class, args);
    }
}
