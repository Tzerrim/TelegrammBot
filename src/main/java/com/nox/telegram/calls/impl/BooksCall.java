package com.nox.telegram.calls.impl;

import com.nox.telegram.calls.api.Call;
import com.nox.telegram.calls.constants.Constants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BooksCall implements Call {
    private Logger logger =  LogManager.getLogger(BooksCall.class);

    String result = new String();

    public String getResult(String game) {
        logger.info("Books: " + game);
        if (Constants.PATHFINDER.equals(game.toLowerCase())){
            return Constants.BOOKS_LIST_PATHFINDER;
        }
        result = "This is a BOOKS Function";
        return result;
    }
}
