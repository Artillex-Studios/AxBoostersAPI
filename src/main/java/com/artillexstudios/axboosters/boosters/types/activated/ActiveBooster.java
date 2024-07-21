package com.artillexstudios.axboosters.boosters.types.activated;

import com.artillexstudios.axboosters.boosters.BoosterType;

public class ActiveBooster {
    private final Booster booster;
    private final long started;
    private int id;
    private final boolean local;

    public ActiveBooster(int id, Booster booster, long started, boolean local) {
        this.booster = booster;
        this.started = started;
        this.id = id;
        this.local = local;
    }

    public long getStarted() {
        return started;
    }

    public Booster getBooster() {
        return booster;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isLocal() {
        return local;
    }

    public BoosterType getType() {
        return booster.getType();
    }
}
