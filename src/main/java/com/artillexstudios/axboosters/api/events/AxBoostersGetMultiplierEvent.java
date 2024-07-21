package com.artillexstudios.axboosters.api.events;

import com.artillexstudios.axboosters.hooks.booster.BoosterHook;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class AxBoostersGetMultiplierEvent extends Event {
    private static final HandlerList handlerList = new HandlerList();
    private final Player player;
    private final BoosterHook boosterHook;
    private float multiplier;

    public AxBoostersGetMultiplierEvent(Player player, BoosterHook boosterHook, float multiplier) {
        super(!Bukkit.isPrimaryThread());
        this.player = player;
        this.boosterHook = boosterHook;
        this.multiplier = multiplier;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return handlerList;
    }

    public static HandlerList getHandlerList() {
        return handlerList;
    }

    public Player getPlayer() {
        return player;
    }

    public float getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(float multiplier) {
        this.multiplier = multiplier;
    }

    public BoosterHook getBoosterHook() {
        return boosterHook;
    }
}