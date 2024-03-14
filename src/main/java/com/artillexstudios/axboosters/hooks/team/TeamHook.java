package com.artillexstudios.axboosters.hooks.team;

import java.util.UUID;

public interface TeamHook {
    String getName();

    // if persistent is false: the plugin will unload the hook after a reload
    boolean isPersistent();
    boolean isSameTeam(UUID player1, UUID player2);
}
