package com.nox.telegram;

import com.nox.functionality.impl.fileLastModified;
import com.nox.functionality.impl.filesTree;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

import java.util.logging.Level;

public class Bot extends TelegramLongPollingBot {

    /**
     * Метод для обработки сообщений
     * @param update Содержит сообщение от пользователя.
     */
    @Override
    public void onUpdateReceived(Update update) {

        // We check if the update has a message and the message has text
        if (update.hasMessage() && update.getMessage().hasText()) {
            // Set variables
            String message_text = update.getMessage().getText();
            long chat_id = update.getMessage().getChatId();

            if ("/help".equals(message_text)) {
                message_text = "Hello, chummer";
            }
            else if ("/tree".equals(message_text)){
                filesTree ft = new filesTree();
                message_text = ft.getResult();
            }
            else if ("/when_log_scribus".equals(message_text)){
                fileLastModified lm = new fileLastModified();
                message_text = lm.getResult();
            }
            SendMessage message = new SendMessage() // Create a message object object
                    .setChatId(chat_id)
                    .setText(message_text);
            try {
                execute(message); // Sending our message object to user
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }





}
