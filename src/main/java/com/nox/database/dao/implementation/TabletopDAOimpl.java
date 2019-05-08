package com.nox.database.dao.implementation;

import com.nox.database.HibernateSessionFactoryUtil;
import com.nox.database.dao.interf.TabletopDAO;
import com.nox.database.entity.Tabletop;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class TabletopDAOimpl implements TabletopDAO {

    public Tabletop findById (int id){
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Tabletop.class, id);
    }

    public void save(Tabletop tabletop) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(tabletop);
        tx1.commit();
        session.close();
    }

    public void update(Tabletop tabletop) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(tabletop);
        tx1.commit();
        session.close();
    }

    public void delete(Tabletop tabletop) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(tabletop);
        tx1.commit();
        session.close();
    }

    public List<Tabletop> findAllTabletops (){
        List<Tabletop> tabletops = (List<Tabletop>)  HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From tabletops").list();
        return tabletops;
    }
}
