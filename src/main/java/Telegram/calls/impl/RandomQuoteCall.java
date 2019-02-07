package Telegram.calls.impl;

import Telegram.calls.api.Call;

public class RandomQuoteCall implements Call {
    String result = new String();

    public String getResult(String parameter) {
        result = "This is a RANDOM_QUOTE Function";
        return result;
    }

}
