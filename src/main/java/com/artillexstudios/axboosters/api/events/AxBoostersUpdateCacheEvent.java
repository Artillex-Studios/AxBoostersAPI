package com.artillexstudios.axboosters.api.events;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class AxBoostersUpdateCacheEvent extends Event {
    private static final HandlerList handlerList = new HandlerList();
    private final Player player;

    public AxBoostersUpdateCacheEvent(@NotNull Player player) {
        super(!Bukkit.isPrimaryThread());
        this.player = player;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return handlerList;
    }

    public static HandlerList getHandlerList() {
        return handlerList;
    }

    @NotNull
    public Player getPlayer() {
        return player;
    }
}