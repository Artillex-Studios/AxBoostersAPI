package com.artillexstudios.axboosters.users;

import org.bukkit.entity.Player;

import java.util.concurrent.ConcurrentHashMap;

public class UserList {
    private static final ConcurrentHashMap<Player, User> users = new ConcurrentHashMap<>();

    public static User addUser(Player player) {
        final User user = new User(player);
        users.put(player, user);
        return user;
    }

    public static User removeUser(Player player) {
        return users.remove(player);
    }

    public static ConcurrentHashMap<Player, User> getUsers() {
        return users;
    }

    public static User getUser(Player player) {
        return users.get(player);
    }
}
