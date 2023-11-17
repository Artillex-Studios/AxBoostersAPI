package com.artillexstudios.axboosters.database;

import com.artillexstudios.axboosters.booster.Booster;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.UUID;

public interface Database {

    String getType();

    void setup();

    void addBooster(@NotNull Booster booster);

    void removeBooster(@NotNull Booster booster);

    void removeActiveBooster(@NotNull Booster booster);

    @NotNull
    ArrayList<Booster> getBoosters(@NotNull UUID uuid);

    int getBoosterCount(@NotNull UUID uuid);

    void activeBooster(@NotNull Booster booster);

    @NotNull
    ArrayList<Booster> getActiveBoosters();

    @NotNull
    ArrayList<Booster> stopExpiredBoosters();

    void disable();
}
