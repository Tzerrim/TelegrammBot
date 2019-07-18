package com.nox.telegram.calls;

import com.nox.telegram.calls.api.Call;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.nox.telegram.calls.utils.Constants.CALLS;
import static com.nox.telegram.calls.utils.Constants.NO_FUNCTION_MESSAGE;

public class CallProcessor {
    private static Logger logger =  LogManager.getLogger(CallProcessor.class);

    public static String ProcessCall(String request) {
        logger.info("ProcessCall: "+ request);
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
