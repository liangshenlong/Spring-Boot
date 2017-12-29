package cn.hacz.edu.jackson;

import cn.hacz.edu.entity.AddressEntity;
import cn.hacz.edu.entity.SkillEntity;
import cn.hacz.edu.entity.UserEntity;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

/**
 * ========================
 * project -
 *
 * @author guod
 * @version 3.0
 * @date 日期:2017/12/6 时间:8:32
 * @JDK: v1.8
 * @Description 功能模块：
 * GitHub地址：https://github.com/s121528
 * ========================
 */
public class Jackson01Test {
    @Test
    public void jackson01() {
        String jackson01 = "{\"name\":\"郭东升\",\"age\":22,\"skill\":[{\"计算机\":\"2017\"}]}";
        System.out.println(jackson01);
    }

    @Test
    public void jackson02() throws Exception {
        //create ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();

        UserEntity userEntity = new UserEntity();
        AddressEntity addressEntity = new AddressEntity();
        addressEntity.setName("河南省");
        addressEntity.setNumber("001");
        SkillEntity skillEntity = new SkillEntity();
        skillEntity.setName("计算机");
        skillEntity.setPrice(6666D);
        userEntity.setName("郭东升");
        userEntity.setAge(22);
        userEntity.setAddress(addressEntity);
        userEntity.getSkills().add(skillEntity);
        userEntity.getProperties().put("map对象", "和添加对象一样");
        // 序列化
        String s = objectMapper.writeValueAsString(userEntity);
        System.out.println(s);
        // 反序列化
        UserEntity userEntity1 = objectMapper.readValue(s, UserEntity.class);
        System.out.println(userEntity1.getAddress().getName());
    }
}
