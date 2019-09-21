package com.nox.database.dao.implementation;

import com.nox.database.HibernateSessionFactoryUtil;
import com.nox.database.dao.api.ApiDAO;
import com.nox.database.entity.Player;
import org.hibernate.query.Query;

public class PlayerDAOimpl extends ApiDAO<Player> {

       public Player findByName(String name){
        Query query = HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery(
                "FROM Player WHERE name = :name"
        );
        query.setParameter("name", name);
        Player player= (Player) query.uniqueResult();
        return player;
    }
}
