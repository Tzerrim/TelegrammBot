package Telegram.calls.constants;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import Telegram.calls.api.Call;
import Telegram.calls.impl.BooksCall;
import Telegram.calls.impl.Games;
import Telegram.calls.impl.HelpCall;
import Telegram.calls.impl.RandomQuoteCall;

public class Constants {
    public static final String NO_FUNCTION_MESSAGE = "Ублюдок, мать твою! Что херню ты опять написал?";

    public static final String HELP = "help";
    public static final String BOOKS = "books";
    public static final String RANDOM_QUOTE = "random_quote";
    public static final String GAME_LIST = "games";

    public static final String HELP_DESCRIPTION = "Shows a list of functions with descriptions, formats and so on.";
    public static final String BOOKS_DESCRIPTION  = "Returns a list of a books of all tabletops, or some special. To see special just add space and name of talbetop after request command";
    public static final String GAME_LIST_DESCRIPTION = "Shows a list of active tabletops";

    public static final String PATHFINDER = "pathfinder";
    public static final String SHADOWRUN = "shadowrun";
    public static final String TAVELLER = "traveller";
    public static final String EARTH_DAWN = "eath_dawn";


    public static final String BOOKS_LIST_PATHFINDER = "1. Core Rulebooks\n2. Pathfinder Advanced Players Guide\n" +
            "3. Ultimate Magic\n4. Ultimate Combat\n5. Advanced Race Guide\n6. Advanced Class Guide\n7. Occult Adventures\n" +
            "8. Ultimate Intrigue\n9. Ultimate Equipment";

    public static final Map<String, Call> CALLS ;
    public static final Map<String, String> DESCRIPTIONS;
    public static final List<String> GAMES;
//    public static final List<String> HELP_COMMANDS;

    static {
        CALLS = new HashMap<String, Call>();
        CALLS.put(HELP, (Call) new HelpCall());
        CALLS.put(BOOKS, (Call) new BooksCall());
        CALLS.put(RANDOM_QUOTE, (Call) new RandomQuoteCall());
        CALLS.put(GAME_LIST, (Call) new Games());

        GAMES = new ArrayList<String>();
        GAMES.add(PATHFINDER);
        GAMES.add(SHADOWRUN);
        GAMES.add(TAVELLER);
        GAMES.add(EARTH_DAWN);

        DESCRIPTIONS = new HashMap<String, String>();
        DESCRIPTIONS.put(HELP, HELP_DESCRIPTION);
        DESCRIPTIONS.put(BOOKS, BOOKS_DESCRIPTION);
        DESCRIPTIONS.put(GAME_LIST, GAME_LIST_DESCRIPTION);
    }
}