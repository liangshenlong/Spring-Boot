package cn.hacz.edu.datasource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
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
        entityManagerFactoryRef = "entityManagerFactoryBook",//实体管理引用
        transactionManagerRef = "transactionManagerBook",//事务管理引用
        basePackages = {"cn.hacz.edu.models.book"}) //设置书籍数据源所应用到的包
public class BookDataSourceConfigurer {
    //注入书籍数据源
    @Autowired
    @Qualifier("bookDataSource")
    private DataSource bookDataSource;

    //配置EntityManager实体
    @Primary
    @Bean(name = "entityManagerBook")
    public EntityManager entityManager(EntityManagerFactoryBuilder builder) {
        return entityManagerFactoryBook(builder).getObject().createEntityManager();
    }

    //配置EntityManager工厂实体
    @Primary
    @Bean(name = "entityManagerFactoryBook")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBook(EntityManagerFactoryBuilder builder) {
        return builder
                .dataSource(bookDataSource)
                .properties(getVendorProperties(bookDataSource))
                .packages(new String[]{"cn.hacz.edu.models.book"}) //设置应用creditDataSource的基础包名
                .persistenceUnit("bookPersistenceUnit")
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
    @Primary
    @Bean(name = "transactionManagerBook")
    public PlatformTransactionManager transactionManagerBook(EntityManagerFactoryBuilder builder) {
        return new JpaTransactionManager(entityManagerFactoryBook(builder).getObject());
    }
}