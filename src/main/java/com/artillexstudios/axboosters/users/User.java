package com.artillexstudios.axboosters.users;

import com.artillexstudios.axboosters.booster.ActiveBooster;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class User {
    private final String name;
    private final Player player;

    public User(Player player) {
        this.player = player;
        this.name = player.getName();
    }

    public void updateBossBar(@NotNull ArrayList<ActiveBooster> activeBoosters) {
    }

    public Player getPlayer() {
        return player;
    }

    public String getName() {
        return name;
    }
}
