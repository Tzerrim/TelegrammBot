package com.nox.telegram.calls.impl;

import com.nox.telegram.calls.api.Call;

public class RandomQuoteCall implements Call {
    String result = new String();

    public String getResult(String parameter) {
        result = "This is a RANDOM_QUOTE Function";
        return result;
    }

}
