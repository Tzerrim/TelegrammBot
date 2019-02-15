package com.nox.telegram.calls;

import com.nox.telegram.calls.api.Call;

import static com.nox.telegram.calls.constants.Constants.CALLS;
import static com.nox.telegram.calls.constants.Constants.NO_FUNCTION_MESSAGE;

public class CallProcessor {
    public static String ProcessCall(String request) {
        String result;
        String[] data = request.split(" ");
        String requestPart = data[0];
        String requestParam;
        if (data.length > 1) {
            requestParam = data[1];
        } else {
            requestParam = null;
        }
        Call requestedFunc = CALLS.get(requestPart);
        if (null != requestedFunc) {
            result = requestedFunc.getResult(requestParam);
        } else {
            result = NO_FUNCTION_MESSAGE;
        }
        return result;
    }
}
