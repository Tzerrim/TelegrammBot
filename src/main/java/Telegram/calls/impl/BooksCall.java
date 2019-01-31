package Telegram.calls.impl;

import Telegram.calls.api.Call;

public class BooksCall implements Call {
    String result = new String();

    public String getResult() {
        result = "This is a BOOKS Function";
        return result;
    }
}
