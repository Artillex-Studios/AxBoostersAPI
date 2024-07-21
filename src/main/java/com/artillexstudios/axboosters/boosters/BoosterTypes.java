package com.artillexstudios.axboosters.boosters;

import java.util.HashMap;

public class BoosterTypes {
    private static final HashMap<String, BoosterType> boosters = new HashMap<>();

    public static void reload() {
    }

    public static HashMap<String, BoosterType> getBoosterTypes() {
        return boosters;
    }
}
