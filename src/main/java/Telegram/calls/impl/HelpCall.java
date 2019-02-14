package Telegram.calls.impl;

import Telegram.calls.api.Call;
import Telegram.calls.constants.Constants;

import java.util.Map;

public class HelpCall implements Call {
    String result = new String();

    public String getResult( String parameter)  {
        StringBuilder sb = new StringBuilder();
        sb.append("Here is help manual of all current functions: ");
        for (String entry : Constants.DESCRIPTIONS.keySet()){
            sb.append("\n").append(entry).append(" - ").append(Constants.DESCRIPTIONS.get(entry));
        }
        result = sb.toString();
        return result;
    }
}
