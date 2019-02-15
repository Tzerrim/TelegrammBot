package com.nox.telegram.calls.impl;

import com.nox.telegram.calls.api.Call;
import com.nox.telegram.calls.constants.Constants;

public class BooksCall implements Call {
    String result = new String();

    public String getResult(String game) {
        if (Constants.PATHFINDER.equals(game.toLowerCase())){
            return Constants.BOOKS_LIST_PATHFINDER;
        }
        result = "This is a BOOKS Function";
        return result;
    }
}
