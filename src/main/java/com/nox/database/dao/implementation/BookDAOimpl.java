package com.nox.database.dao.implementation;

import com.nox.database.HibernateSessionFactoryUtil;
import com.nox.database.dao.interf.BookDAO;
import com.nox.database.entity.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class BookDAOimpl implements BookDAO {

    public void save(Book book) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(book);
        tx1.commit();
        session.close();
    }

    public void update(Book book) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(book);
        tx1.commit();
        session.close();
    }

    public void delete(Book book) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(book);
        tx1.commit();
        session.close();
    }

    public Book findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Book.class, id);
    }

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

    public List<Book> findAllBooks() {
        List<Book> books = (List<Book>) HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery(" FROM Book").list();
        return books;
    }
}
