package cn.hacz.edu.datasource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManager;
import javax.sql.DataSource;
import java.util.Map;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：guod
 * Date：2017/11/30
 * Time：9:07
 * Description：功能模块：
 * JDK：V1.8
 * GitHub地址：https://github.com/s121528
 * ========================
 */
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "entityManagerFactoryUser",//实体管理引用
        transactionManagerRef = "transactionManagerUser",//失误管理引用
        basePackages = {"cn.hacz.edu.models.user"}) //设置用户数据源所应用到的包
public class UserDataSourceConfigurer {
    //注入用户数据源
    @Autowired
    @Qualifier("userDataSource")
    private DataSource userDataSource;

    //配置EntityManager实体
    @Bean(name = "entityManagerUser")
    public EntityManager entityManager(EntityManagerFactoryBuilder builder) {
        return entityManagerFactoryUser(builder).getObject().createEntityManager();
    }

    //配置EntityManager工厂实体
    @Bean(name = "entityManagerFactoryUser")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryUser(EntityManagerFactoryBuilder builder) {
        return builder
                .dataSource(userDataSource)
                .properties(getVendorProperties(userDataSource))
                .packages(new String[]{"cn.hacz.edu.models.user"}) //设置应用creditDataSource的基础包名
                .persistenceUnit("userPersistenceUnit")
                .build();
    }

    //注入jpa配置实体
    @Autowired
    private JpaProperties jpaProperties;

    //获取jpa配置信息
    private Map<String, String> getVendorProperties(DataSource dataSource) {
        return jpaProperties.getHibernateProperties(dataSource);
    }

    //配置事务
    @Bean(name = "transactionManagerUser")
    public PlatformTransactionManager transactionManagerUser(EntityManagerFactoryBuilder builder) {
        return new JpaTransactionManager(entityManagerFactoryUser(builder).getObject());
    }
}

