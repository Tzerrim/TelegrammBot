package com.nox.telegram.calls.impl;

import com.nox.telegram.calls.api.Call;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PlayersCall implements Call {
    private Logger logger = LogManager.getLogger(PlayersCall.class);

    String result = new String();

    public String getResult(String game) {
        return result;
    }
}
