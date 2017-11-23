1.添加jackson处理java8的依赖

<dependency>
    <groupId>com.fasterxml.jackson.datatype</groupId>
    <artifactId>jackson-datatype-jsr310</artifactId>
</dependency>
2.配置文件写入时间配置

2.1修改配置文件(方案1)

spring.jackson.serialization.write_dates_as_timestamps=false
2.2修改配置对象(方案2)

@Bean
@Primary//覆盖掉默认的objectMapper配置,优先级别最高
public ObjectMapper objectMapper(Jackson2ObjectMapperBuilder builder) {
    ObjectMapper objectMapper = builder.createXmlMapper(false).build();
    objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
    return objectMapper;
}
3.格式化日期的注解

@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
private LocalDateTime queryDateTime;
