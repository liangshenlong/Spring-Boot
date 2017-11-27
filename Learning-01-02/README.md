### 主要知识点（spring Boot提倡约定优于配置）
> Java配置、依赖注入（IOC、DI）、切面（AOP）、EL

```
@Configuration
public class AppConfig {

    @Bean
    public MyService myService() {
        return new MyServiceImpl();
    }

}
等价下面的代码：
<beans>
    <bean id="myService" class="com.acme.services.MyServiceImpl"/>
</beans>
```
##### @Configuration
+ @Configuration注解的类，等价 与XML中配置beans

##### @Bean
+ @Bean标注方法等价于XML中配置的bean
+ @Bean只能用于注解方法和注解的定义。
+ 注解的方法：会实例化、配置并初始化一个新的对象，这个对象会由spring IoC 容器管理。