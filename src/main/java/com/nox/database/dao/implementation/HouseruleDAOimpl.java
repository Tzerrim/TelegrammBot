package com.nox.database.dao.implementation;

import com.nox.database.HibernateSessionFactoryUtil;
import com.nox.database.dao.api.ApiDAO;
import com.nox.database.entity.Houserule;
import org.hibernate.query.Query;

import java.util.List;

public class HouseruleDAOimpl extends ApiDAO<Houserule> {

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
