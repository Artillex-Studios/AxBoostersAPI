package com.artillexstudios.axboosters.api;

import com.artillexstudios.axboosters.boosters.BoosterType;
import com.artillexstudios.axboosters.boosters.BoosterTypes;
import com.artillexstudios.axboosters.hooks.HookManager;
import com.artillexstudios.axboosters.hooks.booster.BoosterHook;
import com.artillexstudios.axboosters.hooks.team.TeamHook;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class AxBoostersAPI {

    @Nullable
    public static BoosterType getBoosterType(String name) {
        return BoosterTypes.getBoosterTypes().get(name);
    }

    public static void registerBoosterHook(@NotNull Plugin plugin, @NotNull BoosterHook hook) {
        HookManager.registerBoosterHook(plugin, hook);
    }

    public static void registerTeamHook(@NotNull Plugin plugin, @NotNull TeamHook hook) {
        HookManager.registerTeamHook(plugin, hook);
    }
}
