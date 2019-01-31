package Telegram;

import Telegram.calls.CallProcessor;
import org.apache.logging.log4j.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Bot extends TelegramLongPollingBot {

    private Logger LOG =  LogManager.getLogger(Bot.class.getName());






    @Override
    public void onUpdateReceived(Update update) {
        LOG.info("onUpdateReceived");
        LOG.info(update.getMessage().getText() );
        String responseText = "";
        if (update.hasMessage() && update.getMessage().hasText()) {
            String message_text = update.getMessage().getText();
            long chat_id = update.getMessage().getChatId();

            if ("/".equals(message_text.substring(0,1))) { // if it is a command to bot
                responseText = CallProcessor.ProcessCall(message_text.substring(1));
                SendMessage message = new SendMessage() // Create a message object object
                        .setChatId(chat_id)
                        .setText(responseText);
                try {
                    execute(message); // Sending our message object to user
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    /**
     * Метод возвращает имя бота, указанное при регистрации.
     * @return имя бота
     */
    @Override
    public String getBotUsername() {
        return BOT_NAME;
    }

    /**
     * Метод возвращает token бота для связи с сервером Telegram
     * @return token для бота
     */
    @Override
    public String getBotToken() {
        return BOT_TOKEN;
    }
}