package com.nox.telegram.calls.impl;

import com.nox.database.entity.Book;
import com.nox.database.entity.Tabletop;
import com.nox.database.service.BookService;
import com.nox.database.service.TabletopService;
import com.nox.telegram.calls.api.Call;
import com.nox.telegram.calls.utils.CommonUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.stream.Collectors;

public class BooksCall implements Call {
    private Logger logger =  LogManager.getLogger(BooksCall.class);

    String result = new String();

    public String getResult(String game) {
        logger.info("Books: " + game);
        BookService bookService = new BookService();

        if (null == game){
            List<Book> books = bookService.findAllBooks();
            result = books.stream()
                    .map( n -> n.toDataString() )
                    .collect( Collectors.joining( " --- \n" ) );
        }
        else {
            TabletopService tabletopService = new TabletopService();
            Tabletop tabletop = tabletopService.findTabletopByName(CommonUtils.nameFormatter (game));
            if (tabletop != null){
                List<Book> books = bookService.findBooksByTalbetops(tabletop.getName());
                result = books.stream()
                        .map( n -> n.toDataString() )
                        .collect( Collectors.joining( " --- \n" ) );
            }
            else {
                result = "I can't help you. Go help yourself!";
            }
        }
        return result;
    }
}
