package com.artillexstudios.axboosters.hooks.team;

import java.util.UUID;

public interface TeamHook {

    String getName();

    boolean isPersistent();

    boolean isSameTeam(UUID player1, UUID player2);
}
