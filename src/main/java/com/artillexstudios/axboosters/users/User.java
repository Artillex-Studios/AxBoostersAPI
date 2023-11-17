package com.artillexstudios.axboosters.users;

import com.artillexstudios.axboosters.booster.Booster;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class User {
    private final String name;
    private final Player player;

    public User(Player player) {
        this.player = player;
        this.name = player.getName();
    }

    public void updateBossBar(ArrayList<Booster> activeBoosters) {
    }

    public Player getPlayer() {
        return player;
    }

    public String getName() {
        return name;
    }
}
