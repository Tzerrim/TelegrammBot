package com.nox.botCall;

import com.nox.botCall.inteface.botCall;
import com.nox.constants.botCallFunctions;

public class stringFunctionsChooser {

    public static String chooseFunction(String call){
        String result;
        botCall bot = botCallFunctions.botCalls.get(call);
        result = bot.getResult();
        return result;
    }
}
