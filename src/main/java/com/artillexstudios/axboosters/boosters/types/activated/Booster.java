package com.artillexstudios.axboosters.boosters.types.activated;

import com.artillexstudios.axboosters.boosters.BoosterType;
import com.artillexstudios.axboosters.enums.Audience;
import com.artillexstudios.axboosters.hooks.HookManager;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Objects;
import java.util.UUID;

public class Booster {
    private final BoosterType type;
    private final Audience audience;
    private final float multiplier;
    private final int length;
    private Integer id = null;
    private UUID owner = null; // owner can be null if the booster is a global
    private final long date;

    public Booster(BoosterType type, Audience audience, float multiplier, int length) {
        this(type, audience, multiplier, length, System.currentTimeMillis());
    }

    public Booster(BoosterType type, Audience audience, float multiplier, int length, long date) {
        this.type = type;
        this.audience = audience;
        this.multiplier = multiplier;
        this.length = length;
        this.date = date;
    }

    public Booster(UUID owner, BoosterType type, Audience audience, float multiplier, int length, long date) {
        this(type, audience, multiplier, length, date);
        this.owner = owner;
    }

    public Booster(int id, UUID owner, BoosterType type, Audience audience, float multiplier, int length, long date) {
        this(owner, type, audience, multiplier, length, date);
        this.id = id;
    }

    @Nullable
    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Nullable
    public UUID getOwner() {
        return owner;
    }

    public BoosterType getType() {
        return type;
    }

    public Audience getAudience() {
        return audience;
    }

    public float getMultiplier() {
        return multiplier;
    }

    public int getLength() {
        return length;
    }

    public long getDate() {
        return date;
    }

    public boolean isInScope(Player player) {
        switch (audience) {
            case GLOBAL -> {
                return true;
            }
            case TEAM -> {
                return HookManager.isSameTeam(owner, player.getUniqueId());
            }
            case PERSONAL -> {
                return Objects.equals(owner, player.getUniqueId());
            }
        }
        return false;
    }

    public ArrayList<Player> getAllInScope() {
        return new ArrayList<>();
    }
}
