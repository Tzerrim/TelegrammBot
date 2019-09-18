package com.nox.database.dao.api;


import com.nox.database.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * TODO: think about JAVA generics!
 */
public abstract class ApiDAO<T> {

    private Class<T> entityType;

    @SuppressWarnings("unchecked")
    public ApiDAO() {
        this.entityType = ((Class<T>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0]);
    }

    public void save (T arg){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(arg);
        tx1.commit();
        session.close();
    }

    public void update(T arg) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(arg);
        tx1.commit();
        session.close();
    }

    public void delete(T arg) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(arg);
        tx1.commit();
        session.close();
    }

    public T findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(entityType, id);
    }

    public List<T> findAll() {
        List<T> result = (List<T>) HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery(" FROM " + entityType).list();
        return result;
    }


}
