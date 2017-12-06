package cn.hacz.edu.gson;

import cn.hacz.edu.entity.AddressEntity;
import cn.hacz.edu.entity.SkillEntity;
import cn.hacz.edu.entity.UserEntity;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.Test;

/**
 * ========================
 * project -
 *
 * @author guod
 * @version 3.0
 * @date 日期:2017/12/6 时间:17:32
 * @JDK: v1.8
 * @Description 功能模块：
 * GitHub地址：https://github.com/s121528
 * ========================
 */
public class Gson01Test {
    @Test
    public void gson01() {
        String gson01 = "{\"name\":\"guo\"}";
        System.out.println(gson01);
    }

    @Test
    public void gson02() {
        UserEntity userEntity = new UserEntity();
        AddressEntity addressEntity = new AddressEntity();
        addressEntity.setName("guo");
        addressEntity.setNumber("001");
        SkillEntity skillEntity = new SkillEntity();
        skillEntity.setName("dong");
        skillEntity.setPrice(666D);
        userEntity.setAge(22);
        userEntity.setName("guodong");
        userEntity.setAddress(addressEntity);
        userEntity.getSkills().add(skillEntity);
        Gson gson = new Gson();
        // 序列化：
        String s = gson.toJson(userEntity);
        System.out.println(s);
        // 反序列化
        UserEntity userEntity1 = gson.fromJson(s, UserEntity.class);
        System.out.println(userEntity.getAddress().getName());
    }

    @Test
    public void gson03() {
        UserEntity userEntity = new UserEntity();
        AddressEntity addressEntity = new AddressEntity();
        addressEntity.setName("guo");
        addressEntity.setNumber("001");
        SkillEntity skillEntity = new SkillEntity();
        skillEntity.setName("dong");
        skillEntity.setPrice(666D);
        userEntity.setAge(22);
        userEntity.setName("guodong");
        userEntity.setAddress(addressEntity);
        userEntity.getSkills().add(skillEntity);
        GsonBuilder gsonBuilder = new GsonBuilder().setDateFormat("yyyy-MM-dd");
        // 序列化
        String s = gsonBuilder.create().toJson(userEntity);
        System.out.println(s);
        // 反序列化
        GsonBuilder gsonBuilder1 = gsonBuilder.setDateFormat(s);
        System.out.println(gsonBuilder1);
    }
}
