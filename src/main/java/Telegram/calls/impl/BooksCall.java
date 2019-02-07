package Telegram.calls.impl;

import Telegram.calls.api.Call;
import Telegram.calls.constants.Constants;

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
