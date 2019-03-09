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
            logger.info("Wrong input data");
        }
        else {
            // Initialize Api Context
            ApiContextInitializer.init();
            logger.info("Initialize Api Context");

            // Instantiate Telegram Bots API
            TelegramBotsApi botsApi = new TelegramBotsApi();
            logger.info("Instantiate Telegram Bots API");

            // Register our bot
            try {
                logger.info("Bot name: "+ args[0]);
                logger.info("Bot ID: "+ args[1]);
                botsApi.registerBot(new Bot(args[0], args[1]));
                logger.info("Register bot");
            } catch (TelegramApiException e) {
                logger.error(e.getMessage());
//                e.printStackTrace();
            }
        }

    }
}
