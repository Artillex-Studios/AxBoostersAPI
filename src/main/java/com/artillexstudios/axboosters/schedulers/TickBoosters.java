package com.artillexstudios.axboosters.schedulers;

import com.artillexstudios.axboosters.booster.ActiveBooster;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class TickBoosters {
    private static final ArrayList<ActiveBooster> activeBoosters = new ArrayList<>();

    @NotNull
    public static ArrayList<ActiveBooster> getActiveBoosters() {
        return activeBoosters;
    }
}
