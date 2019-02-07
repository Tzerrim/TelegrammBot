package Telegram.calls.impl;

import Telegram.calls.api.Call;

public class HelpCall implements Call {
    String result = new String();

    public String getResult( String parameter)  {
        result = "This is a HELP Function";
        return result;
    }
}
