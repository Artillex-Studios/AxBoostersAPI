package com.artillexstudios.axboosters.booster;

import java.util.HashMap;

public class Boosters {
    private static final HashMap<String, BoosterType> boosters = new HashMap<>();

    public static void reload() {
    }

    public static HashMap<String, BoosterType> getBoosters() {
        return boosters;
    }
}
