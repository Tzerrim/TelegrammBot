package com.nox.main;

import com.nox.telegram.Bot;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class main {

    static Logger logger =   LogManager.getLogger(main.class);
    public static void main(String[] args) {


        if ( args.length < 2 || args.length > 2) {

        }
        else {
            // Initialize Api Context
            ApiContextInitializer.init();

            // Instantiate Telegram Bots API
            TelegramBotsApi botsApi = new TelegramBotsApi();

            // Register our bot
            try {
                botsApi.registerBot(new Bot(args[0], args[1]));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }

    }
}
