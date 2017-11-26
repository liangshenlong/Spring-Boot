package cn.hacz.edu.config;

import org.hibernate.SessionFactory;
import org.hibernate.jpa.HibernateEntityManagerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * project -
 *
 * @author guo
 * @date 日期:2017年8月22日 时间:下午6:09:45
 * @JDK:version used:jdk1.7
 * @version 3.0
 * @Description 功能模块：使用JavaConfig的Hibernate存储库
 */
@Configuration
public class Hibernate {
	@Bean
	public SessionFactory sessionFactory(HibernateEntityManagerFactory hemf) {
		return hemf.getSessionFactory();
	}

}
