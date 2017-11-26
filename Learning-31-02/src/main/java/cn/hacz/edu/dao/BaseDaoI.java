package cn.hacz.edu.dao;

import cn.hacz.edu.webexception.Page;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;


/**
 * project - DAO基类
 *
 * @author guo
 * @version 3.0
 * @date 日期:2017年8月21日 时间:下午6:16:44
 * @JDK:version used:jdk1.7
 * @Description 功能模块：其他DAO继承此类获取常用的数据库操作方法
 */
public interface BaseDaoI<T> {

    /**
     * @return Serializable
     * @Title save
     * @date 日期:2017年8月17日 时间:下午2:55:15
     * @Description 功能：保存对象
     */
    public Serializable save(T o);

    /**
     * @param o
     * @return void
     * @Title delete
     * @date 日期:2017年8月21日 时间:下午6:17:23
     * @Description 功能：删除一个对象
     */
    public void delete(T o);

    /**
     * @param o
     * @return void
     * @Title update
     * @date 日期:2017年8月21日 时间:下午6:17:58
     * @Description 功能：更新一个对象
     */
    public void update(T o);

    /**
     * @param c类型
     * @param id
     * @return T要获得的对象
     * @Title get
     * @date 日期:2017年8月21日 时间:下午6:24:20
     * @Description 功能：通过主键获得对象
     */
    public T get(Class<T> c, Serializable id);

    /**
     * @param hqlHQL语句
     * @param params参数
     * @return T对象
     * @Title get
     * @date 日期:2017年8月21日 时间:下午6:30:22
     * @Description 功能：通过HQL语句获取一个对象
     */
    public T get(String hql, Map<String, Object> params);

    public T get(String hql, Object... params);

    public T get(String hql);

    /**
     * @param HQL语句
     * @param params参数
     * @param ph分页插件
     * @return List<T>
     * @Title find
     * @date 日期:2017年8月22日 时间:上午10:01:14
     * @Description 功能：通过HQL获得一个集合
     */
    public List<T> find(String hql, Map<String, Object> params, Page ph);

    public List<T> find(String hql, Map<String, Object> params);

    public List<T> find(String hql, Object... params);

    public List<T> find(String hql, Page ph);

    public List<T> find(String hql);

    /**
     * @param HQL语句
     * @param params参数
     * @return Long记录数
     * @Title count
     * @date 日期:2017年8月22日 时间:上午10:01:55
     * @Description 功能：统计数据库中的相应数据
     */
    public Long count(String hql, Map<String, Object> params);

    public Long count(String hql, Object... params);

    public Long count(String hql);

    /**
     * @param HQL语句
     * @param params参数
     * @return int影响的结果数目
     * @Title execute
     * @date 日期:2017年8月22日 时间:上午10:02:26
     * @Description 功能：执行HQL语句获取更新数据的条数
     */
    public int execute(String hql, Map<String, Object> params);

    public int execute(String hql, Object... params);

    public int execute(String hql);

    /**
     * @param sql：SQL语句
     * @param params：参数
     * @param ph：分页使用
     * @return List<?>
     * @Title findBySql
     * @date 日期:2017年8月21日 时间:下午6:18:17
     * @Description 功能：通过SQL查询结果集
     */
    public List<?> findBySql(String sql, Map<String, Object> params, Page ph);

    public List<?> findBySql(String sql, Map<String, Object> params);

    public List<?> findBySql(String sql, Object... params);

    public List<?> findBySql(String sql, List<Object> params);

    public List<?> findBySql(String sql, Page ph);

    public List<?> findBySql(String sql);

    /**
     * @param sqlSQL语句
     * @param params数目
     * @return BigInteger
     * @Title countBySql
     * @date 日期:2017年8月21日 时间:下午6:28:44
     * @Description 功能：通过SQL进行统计
     */
    public BigInteger countBySql(String sql, Map<String, Object> params);

    public BigInteger countBySql(String sql);

    /**
     * @param sql
     * @param params
     * @return int
     * @Title executeSql
     * @date 日期:2017年8月21日 时间:下午6:29:36
     * @Description 功能：执行SQL语句
     */
    public int executeSql(String sql, Map<String, Object> params);

    public int executeSql(String sql);

}
