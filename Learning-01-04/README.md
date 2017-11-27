### 主要知识点（spring Boot提倡约定优于配置）
> Spring——Bean

##### Bean的定义
+ 被称作 bean 的对象是构成应用程序的支柱也是由 Spring IoC 容器管理的。bean 是一个被实例化，组装，并通过 Spring IoC 容器所管理的对象。这些 bean 是由用容器提供的配置元数据创建的，例如，在 XML 的表单中的 定义。
+ bean 定义包含称为配置元数据的信息，下述容器也需要知道配置元数据：如何创建一个 bean、bean 的生命周期的详细信息、bean 的依赖关系。

##### Spring 配置元数据
+ 基于 XML 的配置文件
+ 基于注解的配置
+ 基于 Java 的配置
```
@Configuration
public class AppConfig{
    @Bean
    public MyService myService() {
        return new MyServiceImpl();
    }
}
对于上面的@Beans配置文件相同的XML配置文件如下：

<beans>
    <bean id="myService" class="com.howtodoinjava.services.MyServiceImpl"/>
</beans>
```