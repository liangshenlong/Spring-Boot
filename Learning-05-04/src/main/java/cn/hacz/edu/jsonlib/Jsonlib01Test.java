package cn.hacz.edu.jsonlib;

import cn.hacz.edu.entity.UserEntity;
import cn.hacz.edu.util.JsonLibUtils;
import jdk.nashorn.internal.runtime.regexp.JoniRegExp;
import org.apache.xpath.SourceTree;
import org.junit.Test;

import javax.sound.midi.Soundbank;

/**
 * ========================
 * project -
 *
 * @author guod
 * @version 3.0
 * @date 日期:2017/12/7 时间:10:35
 * @JDK: v1.8
 * @Description 功能模块：
 * GitHub地址：https://github.com/s121528
 * ========================
 */
public class Jsonlib01Test {
    @Test
    public void josnlib01() {
        UserEntity userEntity = new UserEntity("郭东升", 22);
        String json = JsonLibUtils.pojo2json(userEntity);
        System.out.println(json);
    }
}
