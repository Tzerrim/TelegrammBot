package com.nox.telegram.calls.utils;

public class CommonUtils {

    private CommonUtils(){}

    /**
     *
     * @param name string to be formatted
     * @return returns input string in format where first character is in upper case and all other characters are in lower case
     */
    public static String nameFormatter (String name) {
        return name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
    }
}
