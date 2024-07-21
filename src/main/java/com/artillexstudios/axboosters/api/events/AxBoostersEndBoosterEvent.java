package com.artillexstudios.axboosters.api.events;

import com.artillexstudios.axboosters.boosters.types.activated.ActiveBooster;
import org.bukkit.Bukkit;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class AxBoostersEndBoosterEvent extends Event {
    private static final HandlerList handlerList = new HandlerList();
    private final ActiveBooster activeBooster;

    public AxBoostersEndBoosterEvent(ActiveBooster activeBooster) {
        super(!Bukkit.isPrimaryThread());
        this.activeBooster = activeBooster;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return handlerList;
    }

    public static HandlerList getHandlerList() {
        return handlerList;
    }

    public ActiveBooster getActiveBooster() {
        return activeBooster;
    }
}