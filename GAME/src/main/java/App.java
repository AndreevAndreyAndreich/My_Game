package com.example.telegrambot;
import org.telegram.telegrambots.ApiContextInitializer;

import java.util.logging.Logger;

public class App {
    private static final Logger log = Logger.getLogger(String.valueOf(App.class));

    public static void main(String[] args) {
        ApiContextInitializer.init();
        Bot test_habr_bot = new Bot("test_habr_bot", "1012522162:AAHLvPVqKF48LdqnsvS3l5YrJfvFey6dBa0");
        test_habr_bot.botConnect();
    }
}