package com.artillexstudios.axboosters.users;

import com.artillexstudios.axboosters.enums.Sorting;
import com.artillexstudios.axboosters.hooks.booster.BoosterHook;
import org.bukkit.entity.Player;

public class User {
    private final Player player;
    private boolean reverse = false;
    private Sorting sorting = Sorting.DATE;
    private int boosterLimit;

    public User(Player player) {
        this.player = player;

        update();
    }

    public void update() {
    }

    public void apply(BoosterHook hook, float multiplier) {
    }

    public void unApply(BoosterHook hook) {
    }

    public float getBoost(BoosterHook hook) {
        return 0;
    }

    public void toggleReverse() {
    }

    public void switchSorting() {
    }

    public void switchSortingBack() {
    }

    public Sorting getSorting() {
        return sorting;
    }

    public boolean isReverse() {
        return reverse;
    }

    public Player getPlayer() {
        return player;
    }

    public void remove() {
    }

    public int getBoosterLimit() {
        return boosterLimit;
    }

    public void setBoosterLimit(int limit) {
    }

    public void updateBossBar() {
    }
}
