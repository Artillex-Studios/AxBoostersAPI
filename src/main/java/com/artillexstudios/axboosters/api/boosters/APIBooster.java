package com.artillexstudios.axboosters.api.boosters;

import com.artillexstudios.axboosters.boosters.BoosterType;
import com.artillexstudios.axboosters.boosters.types.activated.Booster;
import com.artillexstudios.axboosters.enums.Audience;

import java.util.UUID;

public class APIBooster extends Booster {
    public APIBooster(BoosterType type, Audience audience, float multiplier) {
        super(type, audience, multiplier, 0, System.currentTimeMillis());
    }

    public APIBooster(UUID owner, BoosterType type, Audience audience, float multiplier) {
        super(owner, type, audience, multiplier, 0, System.currentTimeMillis());
    }
}
