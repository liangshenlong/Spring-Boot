package cn.hacz.edu.fastjson;

import cn.hacz.edu.vo.Address;
import cn.hacz.edu.vo.Skill;
import cn.hacz.edu.vo.User;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
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
 * @date 日期:2017/12/5 时间:17:06
 * @JDK: v1.8
 * @Description 功能模块：
 * GitHub地址：https://github.com/s121528
 * ========================
 */
public class FastJson02Test {
    @Test
    public void fastJson01() {
        Map<String, Object> map = new HashMap<>();
        List<String> l = new ArrayList<>();
        l.add("makai1");
        l.add("makai2");
        l.add("makai3");

        map.put("rows", l);
        map.put("total", 3);
        // 序列化
        String str = JSON.toJSONString(map);
        System.out.println(str);
        // 反序列化
        JSONObject jsonObject = JSON.parseObject(str);
        // 获取方式一
        Integer integer = jsonObject.getInteger("total");
        System.out.println(integer);
        // 获取方式二
        JSONArray jsonArray = jsonObject.getJSONArray("rows");
        System.out.println(jsonArray.size());
        for (int i = 0; i < jsonArray.size(); i++) {
            String string = jsonArray.getString(i);
            System.out.println("G-->" + string);
        }
    }

    @Test
    public void fastJson02() {
        User user = new User();
        Address address = new Address();
        address.setName("郭东升");
        Skill skill = new Skill();
        skill.setName("计算机");
        skill.setPrice(6666);
        user.setName("河南");
        user.setAge(22);
        user.setAddress(address);
        user.getSkills().add(skill);
        String s = JSON.toJSONString(user);
        System.out.println(s);
    }
}
