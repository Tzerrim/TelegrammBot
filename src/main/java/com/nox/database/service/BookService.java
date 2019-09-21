package com.nox.database.service;

import com.nox.database.dao.implementation.BookDAOimpl;
import com.nox.database.entity.Book;

import java.util.List;

public class BookService {

    BookDAOimpl bookDAO = new BookDAOimpl();

    public BookService(){

    }

    public Book findBookById(int id){
        return bookDAO.findById(id);
    }

    public void saveBook(Book book){
        bookDAO.save(book);
    }

    public void deleteBook(Book book) {
        bookDAO.delete(book);
    }

    public void updateBooks (Book book){
        bookDAO.update(book);
    }

    public List<Book> findAllBooks(){
        return  bookDAO.findAll();
    }

    public List<Book> findBooksByTalbetops( String tabletopName){
        return  bookDAO.findBooksByTalbetop(tabletopName);
    }
}
