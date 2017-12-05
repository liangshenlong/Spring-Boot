package cn.hacz.edu.fastjson;

import cn.hacz.edu.entity.UserEntity;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import javax.xml.ws.Service;

/**
 * ========================
 * project - json数据处理
 *
 * @author guod
 * @version 3.0
 * @date 日期:2017/12/5 时间:16:48
 * @JDK: v1.8
 * @Description 功能模块：fastjson
 * GitHub地址：https://github.com/s121528
 * ========================
 */
public class FastJson01Test {
    @Test
    public void fastJson01() {
        String json01 = "{\"name\":\"郭冬冬\",\"age\":22}";
        System.out.println(json01);
    }

    @Test
    public void fastJson02() {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(1L);
        userEntity.setName("郭冬冬");
        userEntity.setAge(12);
        userEntity.setAddress("河南");
        // 序列化
        String s = JSON.toJSONString(userEntity);
        System.out.println(s);
        // 反序列化
        UserEntity userEntity1 = JSON.parseObject(s, UserEntity.class);
        System.out.println(userEntity.getAddress());
    }

    @Test
    public void fastJson03() {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(1L);
        userEntity.setName("郭冬冬");
        userEntity.setAge(12);
        userEntity.setAddress("河南");
        // 序列化
        String s = JSON.toJSONString(userEntity);
        System.out.println(s);
        // 反序列化
        JSONObject jsonObject = JSON.parseObject(s);
        System.out.println(jsonObject.getString("name"));
    }
}
