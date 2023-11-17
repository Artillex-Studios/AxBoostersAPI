package com.artillexstudios.axboosters.hooks;

import com.artillexstudios.axapi.utils.StringUtils;
import com.artillexstudios.axboosters.hooks.booster.BoosterHook;
import com.artillexstudios.axboosters.hooks.team.TeamHook;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.UUID;

public class HookManager {
    private static final HashSet<BoosterHook> LOADED_BOOSTER_HOOKS = new HashSet<>();
    private static final HashSet<TeamHook> LOADED_TEAM_HOOKS = new HashSet<>();

    public void updateHooks() {
    }

    @SuppressWarnings("unused")
    public static void registerBoosterHook(@NotNull Plugin plugin, @NotNull BoosterHook hook) {
        LOADED_BOOSTER_HOOKS.add(hook);
        Bukkit.getConsoleSender().sendMessage(StringUtils.formatToString("&#33FF33[AxBoosters] Hooked into " + plugin.getName() + "!"));
    }

    @SuppressWarnings("unused")
    public static void registerTeamHook(@NotNull Plugin plugin, @NotNull TeamHook hook) {
        LOADED_TEAM_HOOKS.add(hook);
        Bukkit.getConsoleSender().sendMessage(StringUtils.formatToString("&#33FF33[AxBoosters] Hooked into " + plugin.getName() + "!"));
    }

    @NotNull
    public static HashSet<BoosterHook> getLoadedBoosterHooks() {
        return LOADED_BOOSTER_HOOKS;
    }

    @NotNull
    public static HashSet<TeamHook> getLoadedTeamHooks() {
        return LOADED_TEAM_HOOKS;
    }

    public static boolean isSameTeam(@NotNull UUID player1, @NotNull UUID player2) {
        for (TeamHook hook : LOADED_TEAM_HOOKS) if (hook.isSameTeam(player1, player2)) return true;
        return false;
    }
}
