package cn.hacz.edu.dao.impl;

import cn.hacz.edu.dao.BaseDao;
import cn.hacz.edu.webexception.BaseEntity;
import cn.hacz.edu.webexception.PageHelper;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;

@Repository
public class BaseDaoImpl implements BaseDao {
    @Resource
    private SessionFactory sessionFactory;

    @Override
    public Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void saveOrUpdate(BaseEntity o) {

    }

    @Override
    public Serializable save(BaseEntity o) {
        return null;
    }

    @Override
    public void persist(BaseEntity o) {

    }

    @Override
    public void delete(BaseEntity o) {

    }

    @Override
    public void update(BaseEntity o) {

    }

    @Override
    public <M> M getById(Class<M> c, Serializable id) {
        return null;
    }

    @Override
    public <M> M get(Class<M> resultType, String hql, Map<String, Object> params) {
        return null;
    }

    @Override
    public <M> M get(Class<M> resultType, String hql, Object... params) {
        return null;
    }

    @Override
    public <M> M get(Class<M> resultType, String hql) {
        return null;
    }

    @Override
    public <M> List<M> find(Class<M> resultType, String hql, Map<String, Object> params, PageHelper ph) {
        return null;
    }

    @Override
    public <M> List<M> find(Class<M> resultType, String hql, Map<String, Object> params) {
        return null;
    }

    @Override
    public <M> List<M> find(Class<M> resultType, String hql, PageHelper ph, Object... params) {
        return null;
    }

    @Override
    public <M> List<M> find(Class<M> resultType, String hql, Object... params) {
        return null;
    }

    @Override
    public <M> List<M> find(Class<M> resultType, String hql, PageHelper ph) {
        return null;
    }

    @Override
    public <M> List<M> find(Class<M> resultType, String hql) {
        return null;
    }

    @Override
    public Long count(String hql, Map<String, Object> params) {
        return null;
    }

    @Override
    public Long count(String hql, Object... params) {
        return null;
    }

    @Override
    public Long count(String hql) {
        return null;
    }

    @Override
    public int execute(String hql, Map<String, Object> params) {
        return 0;
    }

    @Override
    public int execute(String hql, Object... params) {
        return 0;
    }

    @Override
    public int execute(String hql) {
        return 0;
    }

    @Override
    public List findBySql(String sql, Map<String, Object> params, PageHelper ph) {
        return null;
    }

    @Override
    public List findBySql(String sql, Map<String, Object> params) {
        return null;
    }

    @Override
    public List findBySql(String sql, List<Object> params) {
        return null;
    }

    @Override
    public List findBySql(String sql, PageHelper ph) {
        return null;
    }

    @Override
    public List findBySql(String sql) {
        return null;
    }

    @Override
    public BigInteger countBySql(String sql, Map<String, Object> params) {
        return null;
    }

    @Override
    public BigInteger countBySql(String sql) {
        return null;
    }

    @Override
    public int executeSql(String sql, Map<String, Object> params) {
        return 0;
    }

    @Override
    public int executeSql(String sql) {
        return 0;
    }

    @Override
    public <M> List<M> findBySql(Class<M> c, String sql, Map<String, Object> params) {
        return null;
    }
}
