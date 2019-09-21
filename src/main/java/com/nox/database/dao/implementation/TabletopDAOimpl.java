package com.nox.database.dao.implementation;

import com.nox.database.HibernateSessionFactoryUtil;
import com.nox.database.dao.api.ApiDAO;
import com.nox.database.entity.Tabletop;
import org.hibernate.query.Query;

public class TabletopDAOimpl extends ApiDAO<Tabletop> {

     public Tabletop findByName (String tabletopName){
        Query query = HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery(
                "FROM Tabletop WHERE name = :tabletopName"
        );
        query.setParameter("tabletopName", tabletopName);
        Tabletop tabletop = (Tabletop) query.uniqueResult();
        return tabletop;
    }
}
