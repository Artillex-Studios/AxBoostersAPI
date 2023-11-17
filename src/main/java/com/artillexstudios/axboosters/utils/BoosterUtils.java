package com.artillexstudios.axboosters.utils;

import com.artillexstudios.axboosters.booster.Booster;
import com.artillexstudios.axboosters.enums.Audience;
import com.artillexstudios.axboosters.hooks.HookManager;
import com.artillexstudios.axboosters.schedulers.TickBoosters;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static com.artillexstudios.axboosters.AxBoosters.MESSAGES;

public class BoosterUtils {

    @NotNull
    public static List<String> getBoosterTypes() {
        return new ArrayList<>(MESSAGES.getSection("boost-types").getRoutesAsStrings(false));
    }

    public static boolean isRunning(@NotNull Booster booster) {
        if (checkConflictPersonal(booster)) return true;
        if (checkConflictTeam(booster)) return true;
        return checkConflictGlobal(booster);
    }

    private static boolean checkConflictPersonal(@NotNull Booster booster) {
        for (Booster runningBooster : TickBoosters.getActiveBoosters()) {
            if (!runningBooster.getAudience().equals(Audience.PERSONAL)) continue;
            if (!runningBooster.getOwner().equals(booster.getOwner())) continue;
            if (!runningBooster.getBoosterType().getType().equals(booster.getBoosterType().getType())) continue;

            return true;
        }

        return false;
    }

    private static boolean checkConflictTeam(@NotNull Booster booster) {
        for (Booster runningBooster : TickBoosters.getActiveBoosters()) {
            if (!runningBooster.getAudience().equals(Audience.TEAM)) continue;
            if (!HookManager.isSameTeam(booster.getOwner(), runningBooster.getOwner())) continue;
            if (!runningBooster.getBoosterType().getType().equals(booster.getBoosterType().getType())) continue;

            return true;
        }

        return false;
    }

    private static boolean checkConflictGlobal(@NotNull Booster booster) {
        for (Booster runningBooster : TickBoosters.getActiveBoosters()) {
            if (!runningBooster.getAudience().equals(Audience.GLOBAL)) continue;
            if (!runningBooster.getBoosterType().getType().equals(booster.getBoosterType().getType())) continue;

            return true;
        }

        return false;
    }

    public static float getMultiplier(@NotNull Player player, @NotNull String type) {
        return getMultiplier(player.getUniqueId(), type);
    }

    public static float getMultiplier(@NotNull UUID uuid, @NotNull String type) {
        float max = 1f;

        for (Booster booster : TickBoosters.getActiveBoosters()) {
            if (booster.getAudience().equals(Audience.PERSONAL) && !booster.getOwner().equals(uuid)) continue;
            if (booster.getAudience().equals(Audience.TEAM) && !HookManager.isSameTeam(booster.getOwner(), uuid)) continue;
            if (!booster.getBoosterType().getType().equalsIgnoreCase(type)) continue;

            max = Math.max(booster.getMultiplier(), max);
        }

        return max;
    }
}
