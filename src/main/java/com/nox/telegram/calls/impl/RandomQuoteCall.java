package com.nox.telegram.calls.impl;

import com.nox.telegram.calls.api.Call;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RandomQuoteCall implements Call {
    private Logger logger =  LogManager.getLogger(RandomQuoteCall.class);
    String result = new String();

    public String getResult(String parameter) {
        logger.info("RandomQuoteCall: "+parameter);
        result = "This is a RANDOM_QUOTE Function";
        return result;
    }

}
