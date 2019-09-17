package com.nox.database.dao.implementation;

import com.nox.database.HibernateSessionFactoryUtil;
import com.nox.database.dao.api.PlayerDAO;
import com.nox.database.entity.Player;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class PlayerDAOimpl implements PlayerDAO {

    public void save(Player player) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(player);
        tx1.commit();
        session.close();
    }

    public void update(Player player) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(player);
        tx1.commit();
        session.close();
    }

    public void delete(Player player) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(player);
        tx1.commit();
        session.close();
    }

    public Player findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Player.class, id);
    }

    public List<Player> findAllPlayers() {
        List<Player> players = (List<Player>) HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery(" FROM Player").list();
        return players;
    }

    public Player findByName(String name){
        Query query = HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery(
                "FROM Player WHERE name = :name"
        );
        query.setParameter("name", name);
        Player player= (Player) query.uniqueResult();
        return player;
    }
}
