package com.nox.telegram.calls.impl;

import com.nox.database.dao.interf.BookDAO;
import com.nox.database.entity.Book;
import com.nox.database.service.BookService;
import com.nox.telegram.calls.api.Call;
import com.nox.telegram.calls.constants.Constants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.stream.Collectors;

public class BooksCall implements Call {
    private Logger logger =  LogManager.getLogger(BooksCall.class);

    String result = new String();

    public String getResult(String game) {
        logger.info("Books: " + game);
        if (null == game){
            BookService bookService = new BookService();
            List<Book> books = bookService.findAllBooks();
            result = books.stream()
                    .map( n -> n.toDataString() )
                    .collect( Collectors.joining( "\n --- \n" ) );
        }
        else {

            if (Constants.PATHFINDER.equals(game.toLowerCase())) {

                BookService bookService = new BookService();
                List<Book> books = bookService.findBooksByTalbetops(Constants.PATHFINDER );
                result = books.stream()
                        .map( n -> n.toDataString() )
                        .collect( Collectors.joining( "\n --- \n"  ) );
            }
        }
        return result;
    }
}
