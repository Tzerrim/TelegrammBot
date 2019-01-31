package Telegram.calls.constants;

import java.util.HashMap;
import java.util.Map;
import Telegram.calls.api.Call;
import Telegram.calls.impl.BooksCall;
import Telegram.calls.impl.HelpCall;
import Telegram.calls.impl.RandomQuoteCall;

public class Constants {
    public static final String NO_FUNCTION_MESSAGE = "Ублюдок, мать твою! Что хернб ты опять написал?";

    public static final String HELP = "help";
    public static final String BOOKS = "books";
    public static final String RANDOM_QUOTE = "random_quote";

    public  static final Map<String, Call> CALLS ;

    static {
        CALLS = new HashMap<String, Call>();
        CALLS.put(HELP, (Call) new HelpCall());
        CALLS.put(BOOKS, (Call) new BooksCall());
        CALLS.put(RANDOM_QUOTE, (Call) new RandomQuoteCall());
    }
}
