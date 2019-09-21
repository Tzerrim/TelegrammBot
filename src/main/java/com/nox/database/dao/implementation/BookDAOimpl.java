package com.nox.database.dao.implementation;

import com.nox.database.HibernateSessionFactoryUtil;
import com.nox.database.dao.api.ApiDAO;
import com.nox.database.entity.Book;
import org.hibernate.query.Query;

import java.util.List;

public class BookDAOimpl extends ApiDAO<Book>  {

       public List<Book> findBooksByTalbetop(String tabletopName) {
        Query query = HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery(
                        "FROM Book " +
                            "WHERE tabletops_id = ( " +
                                "SELECT id " +
                                "FROM Tabletop " +
                                "WHERE name = :tabletopName)"
        );
        query.setParameter("tabletopName", tabletopName);
        List<Book> books = ( List<Book>) query.list();
        return books;
    }


}
