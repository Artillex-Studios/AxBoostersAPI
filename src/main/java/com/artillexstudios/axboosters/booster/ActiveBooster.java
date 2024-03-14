package com.artillexstudios.axboosters.booster;

import com.artillexstudios.axboosters.enums.Audience;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

public class ActiveBooster {
    private Integer id;
    private final UUID owner;
    private final String type;
    private final Audience audience;
    private final float multiplier;
    private final int length;
    private Long started = null;

    public ActiveBooster(@NotNull UUID owner, @NotNull String type, @NotNull Audience audience, float multiplier, int length) {
        this.owner = owner;
        this.type = type;
        this.audience = audience;
        this.multiplier = multiplier;
        this.length = length;
    }

    public ActiveBooster(int id, @NotNull UUID owner, @NotNull String type, @NotNull Audience audience, float multiplier, int length) {
        this.id = id;
        this.owner = owner;
        this.type = type;
        this.audience = audience;
        this.multiplier = multiplier;
        this.length = length;
    }

    public ActiveBooster(int id, @NotNull UUID owner, @NotNull String type, @NotNull Audience audience, float multiplier, int length, long started) {
        this.id = id;
        this.owner = owner;
        this.type = type;
        this.audience = audience;
        this.multiplier = multiplier;
        this.length = length;
        this.started = started;
    }

    @Nullable
    public Integer getId() {
        return id;
    }

    @NotNull
    public UUID getOwner() {
        return owner;
    }

    @NotNull
    public String getType() {
        return type;
    }

    @NotNull
    public Audience getAudience() {
        return audience;
    }

    public float getMultiplier() {
        return multiplier;
    }

    public int getLength() {
        return length;
    }

    @Nullable
    public Long getStarted() {
        return started;
    }

    public BoosterType getBoosterType() {
        return Boosters.getBoosters().get(type);
    }
}
