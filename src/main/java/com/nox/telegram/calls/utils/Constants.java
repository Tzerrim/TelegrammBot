package com.nox.telegram.calls.utils;

import java.util.HashMap;
import java.util.Map;
import com.nox.telegram.calls.api.Call;
import com.nox.telegram.calls.impl.*;

/**
 * TODO:  Keys:
 * Players:
 * -a - only active players
 * -i - only inactive players
 * Characters:
 * -a - only active characters
 * -i - only inactive characters
 */

public class Constants {
    public static final String NO_FUNCTION_MESSAGE = "Ублюдок, мать твою! Что херню ты опять написал?";

    public static final String HELP = "help";
    public static final String BOOKS = "books";
    public static final String RANDOM_QUOTE = "random_quote";
    public static final String GAME_LIST = "games";
    public static final String PLAYER_LIST = "players";
    public static final String CHARACTER_LIST = "characters";
    public static final String HOUSERULE_LIST = "houserules";

    public static final String HELP_DESCRIPTION = "Shows a list of functions with descriptions, formats and so on. TYPE: /help";
    public static final String BOOKS_DESCRIPTION  = "Returns a list of a books of all tabletops, or some special. " +
            "To see special just add space and name of talbetop after request command. TYPE: /books";
    public static final String GAME_LIST_DESCRIPTION = "Shows a list of active tabletops. TYPE: /games";
    public static final String PLAYER_LIST_DESCRIPTION = "Shows a list of players. TYPE: /players";
    public static final String CHARACTER_LIST_DESCRIPTION  = "Shows a list of characters. TYPE: /characters";
    public static final String HOUSERULE_LIST_DESCRIPTION = "Shows a list of houserules. TYPE: /characters";

    public static final Map<String, Call> CALLS ;
    public static final Map<String, String> DESCRIPTIONS;

    static {
        CALLS = new HashMap<String, Call>();
        CALLS.put(HELP, (Call) new HelpCall());
        CALLS.put(BOOKS, (Call) new BooksCall());
        CALLS.put(RANDOM_QUOTE, (Call) new RandomQuoteCall());
        CALLS.put(GAME_LIST, (Call) new TabletopsCall());
        CALLS.put(PLAYER_LIST,(Call) new PlayersCall());
        CALLS.put(CHARACTER_LIST,(Call) new CharacterCall());
        CALLS.put(HOUSERULE_LIST,(Call) new HouserulesCall());

        DESCRIPTIONS = new HashMap<String, String>();
        DESCRIPTIONS.put(HELP, HELP_DESCRIPTION);
        DESCRIPTIONS.put(BOOKS, BOOKS_DESCRIPTION);
        DESCRIPTIONS.put(GAME_LIST, GAME_LIST_DESCRIPTION);
        DESCRIPTIONS.put(PLAYER_LIST, PLAYER_LIST_DESCRIPTION);
        DESCRIPTIONS.put(CHARACTER_LIST, CHARACTER_LIST_DESCRIPTION);
        DESCRIPTIONS.put(HOUSERULE_LIST, HOUSERULE_LIST_DESCRIPTION);
    }
}
