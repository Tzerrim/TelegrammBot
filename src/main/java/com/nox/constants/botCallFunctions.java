package com.nox.constants;

import com.nox.botCall.impl.help;
import com.nox.botCall.inteface.botCall;

import java.util.HashMap;
import java.util.Map;

public  class botCallFunctions {
    // Funtions
    public static String HELP = "/help"; // no params
    public static String WHEN = "/when"; // no params
    public static String BOOKS = "/books"; // all , or by role game, case insensetive
    public static String LAST_MODULE = "/last"; // last any module, or or by role game, case insensetive
    public static String PLAYER_CHARCTERS = "/player"; //
    public static String MAN = "/manual";
    public static final Map<String, botCall> botCalls;
    // Decriptions
    public static String HELP_DESCRIPTION =  "Type /when to get info about soonest game; \nType /books <game> to see the actual books set for this game";
    // Tabletops
    public static String SHADOWRUN = "shadowrun";
    public static String PATHFINDER = "pathfinder";
    public static String DND5 = "dnd5";
    public static String STARFINDER = "starfinder";
    public static String LOVECRAFT = "lovecraft";

    static {
        botCalls = new HashMap<String, botCall>();
        botCalls.put(HELP, (botCall) new help());
    }
}
