package com.nox.telegram.calls.impl;

import com.nox.telegram.calls.api.Call;
import com.nox.telegram.calls.constants.Constants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HelpCall implements Call {
    private Logger logger =  LogManager.getLogger(HelpCall.class);
    String result = new String();

    public String getResult( String parameter)  {
        logger.info("HelpCall: " + parameter);
        StringBuilder sb = new StringBuilder();
        sb.append("Here is help manual of all current functions: ");
        for (String entry : Constants.DESCRIPTIONS.keySet()){
            sb.append("\n").append(entry).append(" - ").append(Constants.DESCRIPTIONS.get(entry));
        }
        result = sb.toString();
        return result;
    }
}
