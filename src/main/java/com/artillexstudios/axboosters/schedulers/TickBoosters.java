package com.artillexstudios.axboosters.schedulers;

import com.artillexstudios.axboosters.booster.Booster;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class TickBoosters {
    private static ArrayList<Booster> activeBoosters = new ArrayList<>();

    @NotNull
    public static ArrayList<Booster> getActiveBoosters() {
        return activeBoosters;
    }
}
