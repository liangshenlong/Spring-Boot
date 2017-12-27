#### 详细讲解
> [简书资料](https://www.jianshu.com/p/0a827681daad)

#### 主要知识点
1. 认识Java配置
2. 熟悉依赖注入（IOC、DI）
3. 切面（AOP）
4. 属性注入和EL表达式

#### 重要代码
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

#### 本人联系方式
1. 邮箱：s121528@163.com
2. QQ：1007916121
3. GitHub地址：https://github.com/s121528
4. 码云地址：https://gitee.com/sunguo