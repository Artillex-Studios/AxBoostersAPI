package com.artillexstudios.axboosters.database;

import com.artillexstudios.axboosters.boosters.BoosterType;
import com.artillexstudios.axboosters.boosters.types.activated.ActiveBooster;
import com.artillexstudios.axboosters.boosters.types.activated.Booster;
import com.artillexstudios.axboosters.enums.ChangeCategory;
import com.artillexstudios.axboosters.enums.ChangeType;
import com.artillexstudios.axboosters.enums.Sorting;
import com.artillexstudios.axboosters.users.User;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.UUID;

public interface Database {

    String getType();

    void setup();

    @Nullable
    Integer getIdFromType(BoosterType type);

    @Nullable
    Integer getUserId(@NotNull UUID uuid);

    @Nullable
    String getUserName(@NotNull UUID uuid);

    BoosterType getTypeFromId(int id);

    UUID getUUIDFromId(int id);

    String getNameFromId(int id);

    void addToInventory(UUID player, Booster booster);

    void removeFromInventory(UUID player, Booster booster);

    void removeActiveBooster(ActiveBooster activeBooster);

    ArrayList<Booster> getInventoryContents(UUID player, Sorting sorting, boolean reverse);

    int getBoosterAmount(UUID player);

    void activateBooster(Booster booster);

    void loadActiveBooster(int id);

    void loadAllActiveBoosters();

    void sendThankYou(Player player, ActiveBooster activeBooster);

    boolean haveThankedAlready(ActiveBooster activeBooster, int from, int to);

    void fetchThankYou(int id);

    int getBoosterLimit(@NotNull UUID uuid);

    void setBoosterLimit(UUID uuid, int amount);

    void join(@NotNull User user);

    int loadBoosterType(@NotNull BoosterType type);

    void sendMessage(@NotNull ChangeType changeType, int id, ChangeCategory changeCategory);

    void checkForChanges();

    void removeOldChanges();

    void disable();
}
