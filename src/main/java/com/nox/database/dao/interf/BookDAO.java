package com.nox.database.dao.interf;

import com.nox.database.entity.Book;

import java.util.List;


public interface BookDAO {

    public void save (Book book);

    public void update (Book book);

    public void delete (Book book);

    public Book findById (int id);

    public List<Book> findBooksByTalbetop(String tabletopName);

    public List<Book> findAllBooks ();

}
