package com.nox.botCall.impl;

import com.nox.botCall.inteface.botCall;
import com.nox.constants.botCallFunctions;

public class help implements botCall {


    public String getResult() {
        return botCallFunctions.HELP_DESCRIPTION;
    }
}
