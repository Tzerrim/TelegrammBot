package com.nox.database.dao.implementation;

import com.nox.database.HibernateSessionFactoryUtil;
import com.nox.database.dao.api.ApiDAO;
import org.hibernate.query.Query;
import com.nox.database.entity.Character;

import java.util.List;

public class CharacterDAOimpl extends ApiDAO<Character> {

       public List<Character> findCharactersByTalbetop(String tabletopName) {
        Query query = HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery(
                        "FROM Character " +
                        "WHERE tabletops_id = (" +
                        " SELECT id " +
                        "   FROM Tabletop " +
                        "   WHERE name = :tabletopName)"
        );
        query.setParameter("tabletopName", tabletopName);
        List<Character> characters = ( List<Character>) query.list();
        return characters;
    }

    public List<Character> findCharactersByPlayer(String playerName) {
        Query query = HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery(
                "FROM Character " +
                        "WHERE player_id = (" +
                        " SELECT id " +
                        "   FROM Player " +
                        "   WHERE name = :playerName)"
        );
        query.setParameter("playerName ", playerName);
        List<Character> characters = ( List<Character>) query.list();
        return characters;
    }

    public Character findCharacterByName (String name) {
        Query query = HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery(
                "FROM Character WHERE name = :name"
        );
        query.setParameter("name", name);
        Character character = (Character) query.uniqueResult();
        return character;
    }
}
