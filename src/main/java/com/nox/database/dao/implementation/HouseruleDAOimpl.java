package com.nox.database.dao.implementation;

import com.nox.database.HibernateSessionFactoryUtil;
import com.nox.database.dao.interf.HouseruleDAO;
import com.nox.database.entity.Houserule;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class HouseruleDAOimpl implements HouseruleDAO {

    public void save(Houserule houserule){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(houserule);
        tx1.commit();
        session.close();
    }

    public void update(Houserule houserule){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(houserule);
        tx1.commit();
        session.close();
    }

    public void delete(Houserule houserule){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(houserule);
        tx1.commit();
        session.close();
    }

    public Houserule findById(int id){
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Houserule.class, id);
    }

    public List<Houserule> findAllHouserules(){
        List<Houserule> houserules = (List<Houserule>) HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery(" FROM Houserule").list();
        return houserules;
    }

    public List<Houserule> findHouserulesByTalbetop(String tabletopName){
        Query query = HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery(
                "FROM Houserule " +
                        "WHERE tabletops_id = (" +
                        " SELECT id " +
                        "   FROM Tabletop " +
                        "   WHERE name = :tabletopName)"
        );
        query.setParameter("tabletopName", tabletopName);
        List<Houserule> houserules = ( List<Houserule>) query.list();
        return houserules;
    }

}
