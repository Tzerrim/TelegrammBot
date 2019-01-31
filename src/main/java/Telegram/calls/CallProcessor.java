package Telegram.calls;

import Telegram.calls.api.Call;

import static Telegram.calls.constants.Constants.CALLS;
import static Telegram.calls.constants.Constants.NO_FUNCTION_MESSAGE;

public class CallProcessor {
    public static String ProcessCall (String request) {
        String result;
        Call requestedFunc = CALLS.get(request);
        if (null != requestedFunc) {
            result = requestedFunc.getResult();
        }
        else {
            result = NO_FUNCTION_MESSAGE;
        }
        return result;
    }
}
