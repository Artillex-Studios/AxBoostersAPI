package com.artillexstudios.axboosters.utils;

import com.artillexstudios.axboosters.AxBoosters;
import com.artillexstudios.axboosters.booster.ActiveBooster;
import com.artillexstudios.axboosters.booster.Boosters;
import com.artillexstudios.axboosters.enums.Audience;
import com.artillexstudios.axboosters.hooks.HookManager;
import com.artillexstudios.axboosters.hooks.booster.BoosterHook;
import com.artillexstudios.axboosters.schedulers.TickBoosters;
import net.kyori.adventure.platform.bukkit.BukkitAudiences;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static com.artillexstudios.axboosters.AxBoosters.CONFIG;

public class BoosterUtils {

    @NotNull
    public static List<String> getBoosterTypes() {
        return new ArrayList<>(Boosters.getBoosters().keySet());
    }

    public static boolean isRunning(@NotNull ActiveBooster booster) {
        if (checkConflictPersonal(booster)) return true;
        if (checkConflictTeam(booster)) return true;
        return checkConflictGlobal(booster);
    }

    private static boolean checkConflictPersonal(@NotNull ActiveBooster booster) {
        for (ActiveBooster runningBooster : TickBoosters.getActiveBoosters()) {
            if (!runningBooster.getAudience().equals(Audience.PERSONAL)) continue;
            if (!runningBooster.getOwner().equals(booster.getOwner())) continue;
            if (!runningBooster.getBoosterType().getName().equals(booster.getBoosterType().getName())) continue;
            if (booster.getMultiplier() > runningBooster.getMultiplier()) continue;

            return true;
        }

        return false;
    }

    private static boolean checkConflictTeam(@NotNull ActiveBooster booster) {
        for (ActiveBooster runningBooster : TickBoosters.getActiveBoosters()) {
            if (!runningBooster.getAudience().equals(Audience.TEAM)) continue;
            if (!HookManager.isSameTeam(booster.getOwner(), runningBooster.getOwner())) continue;
            if (!runningBooster.getBoosterType().getName().equals(booster.getBoosterType().getName())) continue;
            if (booster.getMultiplier() > runningBooster.getMultiplier()) continue;

            return true;
        }

        return false;
    }

    private static boolean checkConflictGlobal(@NotNull ActiveBooster booster) {
        for (ActiveBooster runningBooster : TickBoosters.getActiveBoosters()) {
            if (!runningBooster.getAudience().equals(Audience.GLOBAL)) continue;
            if (!runningBooster.getBoosterType().getName().equals(booster.getBoosterType().getName())) continue;
            if (booster.getMultiplier() > runningBooster.getMultiplier()) continue;

            return true;
        }

        return false;
    }

    public static float getMultiplier(@NotNull Player player, @NotNull BoosterHook type) {
        return getMultiplier(player.getUniqueId(), type);
    }

    public static float getMultiplier(@NotNull UUID uuid, @NotNull BoosterHook type) {
        float max = 1f;

        for (ActiveBooster booster : TickBoosters.getActiveBoosters()) {
            if (booster.getAudience().equals(Audience.PERSONAL) && !booster.getOwner().equals(uuid)) continue;
            if (booster.getAudience().equals(Audience.TEAM) && !HookManager.isSameTeam(booster.getOwner(), uuid)) continue;
            if (!booster.getBoosterType().getBoosted().contains(type)) continue;

            max = Math.max(booster.getMultiplier(), max);
        }

        return max;
    }

    public static void broadcastMessage(@NotNull ActiveBooster booster, @NotNull Component message) {
        if (CONFIG.getBoolean("only-broadcast-to-affected", true)) {
            switch (booster.getAudience()) {
                case TEAM -> {
                    for (Player player : Bukkit.getOnlinePlayers()) {
                        if (!HookManager.isSameTeam(booster.getOwner(), player.getUniqueId())) continue;
                        BukkitAudiences.create(AxBoosters.getInstance()).player(player).sendMessage(message);
                    }
                }
                case PERSONAL -> BukkitAudiences.create(AxBoosters.getInstance()).player(booster.getOwner()).sendMessage(message);
                case GLOBAL -> BukkitAudiences.create(AxBoosters.getInstance()).all().sendMessage(message);
            }

        } else {
            BukkitAudiences.create(AxBoosters.getInstance()).all().sendMessage(message);
        }
    }
}
