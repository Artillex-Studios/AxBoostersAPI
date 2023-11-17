package com.artillexstudios.axboosters.users;

import org.bukkit.entity.Player;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;

public class UserList {
    public static final HashMap<Player, User> users = new HashMap<>();

    public static void addUser(Player p, User ku) {
        users.put(p, ku);
    }

    public static void removeUser(Player p) {
        users.remove(p);
    }

    public static HashMap<Player, User> getUsers() {
        return users;
    }

    @Nullable
    public static User getUser(Player p) {
        if (!users.containsKey(p)) return null;
        return users.get(p);
    }
}
