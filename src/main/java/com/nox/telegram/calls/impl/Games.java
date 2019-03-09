package com.nox.telegram.calls.impl;

import com.nox.telegram.calls.api.Call;
import com.nox.telegram.calls.constants.Constants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Games implements Call {
    private Logger logger =  LogManager.getLogger(Games.class);
    StringBuilder result = new StringBuilder();

    public String getResult(String game) {
        logger.info("Games: " + game);
        for (int i = 0; i < Constants.GAMES.size(); i++ ){
            result.append(i+1).append(". ").append(Constants.GAMES.get(i).toUpperCase()).append("\n");
        }
        return result.toString();
    }
}
