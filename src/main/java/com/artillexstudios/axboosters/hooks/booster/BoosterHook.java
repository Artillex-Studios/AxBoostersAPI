package com.artillexstudios.axboosters.hooks.booster;

import org.bukkit.event.Listener;

public interface BoosterHook extends Listener {
    String getName();

    // if persistent is false: the plugin will unload the hook after a reload
    boolean isPersistent();
}
