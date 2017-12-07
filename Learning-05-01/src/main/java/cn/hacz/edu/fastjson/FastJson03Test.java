package cn.hacz.edu.fastjson;

import cn.hacz.edu.util.FastJsonUtils;
import org.junit.Assert;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ========================
 * project -
 *
 * @author guod
 * @version 3.0
 * @date 日期:2017/12/7 时间:10:47
 * @JDK: v1.8
 * @Description 功能模块：
 * GitHub地址：https://github.com/s121528
 * ========================
 */
public class FastJson03Test {
    @Test
    public void fastjson01() {
        Date date = new Date();
        String json = FastJsonUtils.obj2json(date);
        String expected = "\"" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date) + "\"";
        Assert.assertEquals(expected, json);
        System.out.println(expected);
    }
}
