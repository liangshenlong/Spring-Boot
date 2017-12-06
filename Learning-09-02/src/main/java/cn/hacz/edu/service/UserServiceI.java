package cn.hacz.edu.service;

import java.util.Map;

/**
 * ========================
 * project -
 *
 * @author guod
 * @version 3.0
 * @date 日期:2017/12/6 时间:10:52
 * @JDK: v1.8
 * @Description 功能模块：
 * GitHub地址：https://github.com/s121528
 * ========================
 */
public interface UserServiceI {
    /**
     * fetch data by rule id
     *
     * @param param rule id
     */
    void insertUsers(Map<String, Object> param);
}
