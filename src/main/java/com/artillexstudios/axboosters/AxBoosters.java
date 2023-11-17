package com.artillexstudios.axboosters;

import com.artillexstudios.axapi.AxPlugin;
import com.artillexstudios.axapi.config.Config;
import com.artillexstudios.axapi.data.ThreadedQueue;
import com.artillexstudios.axapi.utils.MessageUtils;
import com.artillexstudios.axboosters.database.Database;

public final class AxBoosters extends AxPlugin {
    private static AxPlugin instance;
    public static Config CONFIG;
    public static Config MESSAGES;
    private static ThreadedQueue<Runnable> threadedQueue;
    private static Database database;
    public static MessageUtils MESSAGEUTILS;

    public static ThreadedQueue<Runnable> getThreadedQueue() {
        return threadedQueue;
    }

    public static Database getDatabase() {
        return database;
    }

    public static AxPlugin getInstance() {
        return instance;
    }
}
