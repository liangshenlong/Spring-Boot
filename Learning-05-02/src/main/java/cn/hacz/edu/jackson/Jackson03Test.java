package cn.hacz.edu.jackson;

import cn.hacz.edu.entity.UserEntity;
import cn.hacz.edu.util.JacksonUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ========================
 * project -
 *
 * @author guod
 * @version 3.0
 * @date 日期:2017/12/7 时间:9:20
 * @JDK: v1.8
 * @Description 功能模块：
 * GitHub地址：https://github.com/s121528
 * ========================
 */
public class Jackson03Test {
    @Test
    public void jackson01() throws Exception {
        String s = JacksonUtils.obj2json(new UserEntity("郭冬冬", 12));
        Assert.assertEquals("{\"name\":\"郭冬冬\",\"age\":12,\"address\":null,\"skills\":[],\"properties\":{}}", s);
        System.out.println(s);
        List<UserEntity> list = new ArrayList<>();
        list.add(new UserEntity("郭冬冬", 12));
        list.add(new UserEntity("郭冬冬", 12));
        list.add(new UserEntity("郭冬冬", 12));
        String s1 = JacksonUtils.obj2json(list);
        System.out.println(s1);
        Map<String, Object> map = new HashMap<>();
        map.put("001", new UserEntity("guo", 12));
        map.put("002", new UserEntity("guo", 12));
        String s2 = JacksonUtils.obj2json(map);
        System.out.println(s2);
    }

    @Test
    public void jackson02() throws Exception {
        String s01 = "{\"name\":\"郭冬冬\",\"age\":12,\"address\":null,\"skills\":[],\"properties\":{}}";
        UserEntity userEntity = JacksonUtils.json2pojo(s01, UserEntity.class);
        System.out.println(userEntity.getName());
        String s02 = "[{\"name\":\"郭冬冬\",\"age\":12,\"address\":null,\"skills\":[],\"properties\":{}},{\"name\":\"郭冬冬\",\"age\":12,\"address\":null,\"skills\":[],\"properties\":{}},{\"name\":\"郭冬冬\",\"age\":12,\"address\":null,\"skills\":[],\"properties\":{}}]\n";
        List<UserEntity> userEntities = JacksonUtils.json2list(s02, UserEntity.class);
        for (UserEntity user : userEntities) {
            System.out.println(user.getName());
        }

        String s03 = "{\"001\":{\"name\":\"guo\",\"age\":12,\"address\":null,\"skills\":[],\"properties\":{}},\"002\":{\"name\":\"guo\",\"age\":12,\"address\":null,\"skills\":[],\"properties\":{}}}\n";
        Map<String, UserEntity> stringUserEntityMap = JacksonUtils.json2map(s03, UserEntity.class);
        for (String key : stringUserEntityMap.keySet()) {
            System.out.println(key + stringUserEntityMap.get(key).getName());
        }

    }

    @Test
    public void json03() throws Exception {
        String s01 = "{\"id\":1,\"name\":\"张三\"}";
        String s02 = "[{\"name\":\"郭冬冬\",\"age\":12,\"address\":null,\"skills\":[],\"properties\":{}},{\"name\":\"郭冬冬\",\"age\":12,\"address\":null,\"skills\":[],\"properties\":{}},{\"name\":\"郭冬冬\",\"age\":12,\"address\":null,\"skills\":[],\"properties\":{}}]\n";
        String s03 = "{\"001\":{\"name\":\"guo\",\"age\":12,\"address\":null,\"skills\":[],\"properties\":{}},\"002\":{\"name\":\"guo\",\"age\":12,\"address\":null,\"skills\":[],\"properties\":{}}}\n";
        String xml01 = JacksonUtils.json2xml(s01);
        /*String xml02 = JacksonUtils.json2xml(s02);测试后发现xml转换为json时也有问题，居然不认识数组，真是悲剧。*/
        String xml03 = JacksonUtils.json2xml(s03);
        System.out.println(xml01);
        System.out.println(xml03);
    }
}
