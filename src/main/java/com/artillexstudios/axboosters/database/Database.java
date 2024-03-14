package com.artillexstudios.axboosters.database;

import com.artillexstudios.axboosters.booster.ActiveBooster;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.UUID;

public interface Database {

    String getType();

    void setup();

    void addBooster(@NotNull ActiveBooster booster);

    void removeBooster(@NotNull ActiveBooster booster);

    void removeActiveBooster(@NotNull ActiveBooster booster);

    @NotNull
    ArrayList<ActiveBooster> getBoosters(@NotNull UUID uuid);

    int getBoosterCount(@NotNull UUID uuid);

    void activeBooster(@NotNull ActiveBooster booster);

    @NotNull
    ArrayList<ActiveBooster> getActiveBoosters();

    @NotNull
    ArrayList<ActiveBooster> stopExpiredBoosters();

    void disable();
}
