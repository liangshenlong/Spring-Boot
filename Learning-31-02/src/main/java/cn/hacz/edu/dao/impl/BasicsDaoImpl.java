package cn.hacz.edu.dao.impl;

import cn.hacz.edu.dao.BaseDaoI;
import cn.hacz.edu.webexception.Page;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Collection;
import java.util.List;
import java.util.Map;


/**
 * project -
 *
 * @author guo
 * @version 3.0
 * @date 日期:2017年8月21日 时间:下午6:21:32
 * @JDK:version used:jdk1.7
 * @Description 功能模块：DAO的实现类
 */
@SuppressWarnings("unchecked")
public class BasicsDaoImpl<T> implements BaseDaoI<T> {

    @Autowired
    private SessionFactory sessionFactory;

    public Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public Serializable save(T o) {
        return getCurrentSession().save(o);
    }

    @Override
    public T get(Class<T> c, Serializable id) {
        return (T) getCurrentSession().get(c, id);
    }

    @Override
    public T get(String hql) {
        Query q = getCurrentSession().createQuery(hql);
        List<T> l = q.list();
        if (l != null && l.size() > 0) {
            return l.get(0);
        }
        return null;
    }

    @Override
    public T get(String hql, Map<String, Object> params) {
        Query q = getCurrentSession().createQuery(hql);
        if (params != null && !params.isEmpty()) {
            for (String key : params.keySet()) {
                Object obj = params.get(key);
                // 这里考虑传入的参数是什么类型，不同类型使用的方法不同
                if (obj instanceof Collection<?>) {
                    q.setParameterList(key, (Collection<?>) obj);
                } else if (obj instanceof Object[]) {
                    q.setParameterList(key, (Object[]) obj);
                } else {
                    q.setParameter(key, obj);
                }
            }
        }
        List<T> l = q.list();
        if (l != null && l.size() > 0) {
            return l.get(0);
        }
        return null;
    }

    @Override
    public void delete(T o) {
        if (o != null) {
            getCurrentSession().delete(o);
        }
    }

    @Override
    public void update(T o) {
        getCurrentSession().update(o);
    }

    @Override
    public List<T> find(String hql) {
        Query q = getCurrentSession().createQuery(hql);
        return q.list();
    }

    @Override
    public List<T> find(String hql, Map<String, Object> params) {
        Query q = getCurrentSession().createQuery(hql);
        if (params != null && !params.isEmpty()) {
            for (String key : params.keySet()) {
                Object obj = params.get(key);
                // 这里考虑传入的参数是什么类型，不同类型使用的方法不同
                if (obj instanceof Collection<?>) {
                    q.setParameterList(key, (Collection<?>) obj);
                } else if (obj instanceof Object[]) {
                    q.setParameterList(key, (Object[]) obj);
                } else {
                    q.setParameter(key, obj);
                }
            }
        }
        return q.list();
    }

    @Override
    public List<T> find(String hql, Map<String, Object> params, Page ph) {
        Query q = getCurrentSession().createQuery(hql);
        if (params != null && !params.isEmpty()) {
            for (String key : params.keySet()) {
                Object obj = params.get(key);
                // 这里考虑传入的参数是什么类型，不同类型使用的方法不同
                if (obj instanceof Collection<?>) {
                    q.setParameterList(key, (Collection<?>) obj);
                } else if (obj instanceof Object[]) {
                    q.setParameterList(key, (Object[]) obj);
                } else {
                    q.setParameter(key, obj);
                }
            }
        }
        return q.setFirstResult((ph.getPage() - 1) * ph.getRows()).setMaxResults(ph.getRows()).list();
    }

    @Override
    public List<T> find(String hql, Page ph) {
        Query q = getCurrentSession().createQuery(hql);
        return q.setFirstResult((ph.getPage() - 1) * ph.getRows()).setMaxResults(ph.getRows()).list();
    }

    @Override
    public Long count(String hql) {
        Query q = getCurrentSession().createQuery(hql);
        return (Long) q.uniqueResult();
    }

    @Override
    public Long count(String hql, Map<String, Object> params) {
        Query q = getCurrentSession().createQuery(hql);
        if (params != null && !params.isEmpty()) {
            for (String key : params.keySet()) {
                Object obj = params.get(key);
                // 这里考虑传入的参数是什么类型，不同类型使用的方法不同
                if (obj instanceof Collection<?>) {
                    q.setParameterList(key, (Collection<?>) obj);
                } else if (obj instanceof Object[]) {
                    q.setParameterList(key, (Object[]) obj);
                } else {
                    q.setParameter(key, obj);
                }
            }
        }
        return (Long) q.uniqueResult();
    }

    @Override
    public int execute(String hql) {
        Query q = getCurrentSession().createQuery(hql);
        return q.executeUpdate();
    }

    @Override
    public int execute(String hql, Map<String, Object> params) {
        Query q = getCurrentSession().createQuery(hql);
        if (params != null && !params.isEmpty()) {
            for (String key : params.keySet()) {
                Object obj = params.get(key);
                // 这里考虑传入的参数是什么类型，不同类型使用的方法不同
                if (obj instanceof Collection<?>) {
                    q.setParameterList(key, (Collection<?>) obj);
                } else if (obj instanceof Object[]) {
                    q.setParameterList(key, (Object[]) obj);
                } else {
                    q.setParameter(key, obj);
                }
            }
        }
        return q.executeUpdate();
    }

    @Override
    public List<?> findBySql(String sql) {
        SQLQuery q = getCurrentSession().createSQLQuery(sql);
        return q.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).list();
    }

    @Override
    public List<?> findBySql(String sql, Page ph) {
        SQLQuery q = getCurrentSession().createSQLQuery(sql);
        return q.setFirstResult((ph.getPage() - 1) * ph.getRows()).setMaxResults(ph.getRows()).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).list();
    }

    @Override
    public List<?> findBySql(String sql, Map<String, Object> params) {
        SQLQuery q = getCurrentSession().createSQLQuery(sql);
        if (params != null && !params.isEmpty()) {
            for (String key : params.keySet()) {
                Object obj = params.get(key);
                // 这里考虑传入的参数是什么类型，不同类型使用的方法不同
                if (obj instanceof Collection<?>) {
                    q.setParameterList(key, (Collection<?>) obj);
                } else if (obj instanceof Object[]) {
                    q.setParameterList(key, (Object[]) obj);
                } else {
                    q.setParameter(key, obj);
                }
            }
        }
        return q.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).list();
    }

    @Override
    public List<?> findBySql(String sql, Object... params) {
        SQLQuery q = getCurrentSession().createSQLQuery(sql);
        if (params != null && params.length > 0) {
            for (int i = 0; i < params.length; i++) {
                q.setParameter(i, params[i]);
            }
        }
        return q.list();
    }

    @Override
    public List<?> findBySql(String sql, Map<String, Object> params, Page ph) {
        SQLQuery q = getCurrentSession().createSQLQuery(sql);
        if (params != null && !params.isEmpty()) {
            for (String key : params.keySet()) {
                Object obj = params.get(key);
                // 这里考虑传入的参数是什么类型，不同类型使用的方法不同
                if (obj instanceof Collection<?>) {
                    q.setParameterList(key, (Collection<?>) obj);
                } else if (obj instanceof Object[]) {
                    q.setParameterList(key, (Object[]) obj);
                } else {
                    q.setParameter(key, obj);
                }
            }
        }
        return q.setFirstResult((ph.getPage() - 1) * ph.getRows()).setMaxResults(ph.getRows()).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).list();
    }

    @Override
    public int executeSql(String sql) {
        SQLQuery q = getCurrentSession().createSQLQuery(sql);
        return q.executeUpdate();
    }

    @Override
    public int executeSql(String sql, Map<String, Object> params) {
        SQLQuery q = getCurrentSession().createSQLQuery(sql);
        if (params != null && !params.isEmpty()) {
            for (String key : params.keySet()) {
                Object obj = params.get(key);
                // 这里考虑传入的参数是什么类型，不同类型使用的方法不同
                if (obj instanceof Collection<?>) {
                    q.setParameterList(key, (Collection<?>) obj);
                } else if (obj instanceof Object[]) {
                    q.setParameterList(key, (Object[]) obj);
                } else {
                    q.setParameter(key, obj);
                }
            }
        }
        return q.executeUpdate();
    }

    @Override
    public BigInteger countBySql(String sql) {
        SQLQuery q = getCurrentSession().createSQLQuery(sql);
        return (BigInteger) q.uniqueResult();
    }

    @Override
    public BigInteger countBySql(String sql, Map<String, Object> params) {
        SQLQuery q = getCurrentSession().createSQLQuery(sql);
        if (params != null && !params.isEmpty()) {
            for (String key : params.keySet()) {
                Object obj = params.get(key);
                // 这里考虑传入的参数是什么类型，不同类型使用的方法不同
                if (obj instanceof Collection<?>) {
                    q.setParameterList(key, (Collection<?>) obj);
                } else if (obj instanceof Object[]) {
                    q.setParameterList(key, (Object[]) obj);
                } else {
                    q.setParameter(key, obj);
                }
            }
        }
        return (BigInteger) q.uniqueResult();
    }

    @Override
    public T get(String hql, Object... params) {
        Query q = getCurrentSession().createQuery(hql);
        if (params != null && params.length > 0) {
            for (int i = 0; i < params.length; i++) {
                q.setParameter(i, params[i]);
            }
        }
        List<T> l = q.list();
        if (l != null && l.size() > 0) {
            return l.get(0);
        }
        return null;
    }

    @Override
    public List<T> find(String hql, Object... params) {
        Query q = getCurrentSession().createQuery(hql);
        if (params != null && params.length > 0) {
            for (int i = 0; i < params.length; i++) {
                q.setParameter(i, params[i]);
            }
        }
        return q.list();
    }

    @Override
    public Long count(String hql, Object... params) {
        Query q = getCurrentSession().createQuery(hql);
        if (params != null && params.length > 0) {
            for (int i = 0; i < params.length; i++) {
                q.setParameter(i, params[i]);
            }
        }
        return (Long) q.uniqueResult();
    }

    @Override
    public int execute(String hql, Object... params) {
        Query q = getCurrentSession().createQuery(hql);
        if (params != null && params.length > 0) {
            for (int i = 0; i < params.length; i++) {
                q.setParameter(i, params[i]);
            }
        }
        return q.executeUpdate();
    }

    @Override
    public List<?> findBySql(String sql, List<Object> params) {
        SQLQuery q = getCurrentSession().createSQLQuery(sql);
        if (params != null && params.size() > 0) {
            for (int i = 0; i < params.size(); i++) {
                q.setParameter(i, params.get(i));
            }
        }
        return q.setFirstResult(0).setMaxResults(10).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).list();
    }

}
