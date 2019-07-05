package com.nox.telegram.calls.constants;

import java.util.HashMap;
import java.util.Map;
import com.nox.telegram.calls.api.Call;
import com.nox.telegram.calls.impl.*;

public class Constants {
    public static final String NO_FUNCTION_MESSAGE = "Ублюдок, мать твою! Что херню ты опять написал?";

    public static final String HELP = "help";
    public static final String BOOKS = "books";
    public static final String RANDOM_QUOTE = "random_quote";
    public static final String GAME_LIST = "games";
    public static final String PLAYER_LIST = "player";
    public static final String CHARACTER_LIST = "character";
    public static final String HOUSERULE_LIST = "houserule";

    public static final String HELP_DESCRIPTION = "Shows a list of functions with descriptions, formats and so on.";
    public static final String BOOKS_DESCRIPTION  = "Returns a list of a books of all tabletops, or some special. To see special just add space and name of talbetop after request command";
    public static final String GAME_LIST_DESCRIPTION = "Shows a list of active tabletops";

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
    }
}
