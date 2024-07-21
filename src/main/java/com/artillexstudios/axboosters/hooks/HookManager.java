package com.artillexstudios.axboosters.hooks;

import com.artillexstudios.axboosters.hooks.booster.BoosterHook;
import com.artillexstudios.axboosters.hooks.team.TeamHook;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.UUID;

public class HookManager {
    private static final HashSet<BoosterHook> LOADED_BOOSTER_HOOKS = new HashSet<>();
    private static final HashSet<TeamHook> LOADED_TEAM_HOOKS = new HashSet<>();

    @SuppressWarnings("unused")
    public static void registerBoosterHook(@NotNull Plugin plugin, @NotNull BoosterHook hook) {
    }

    @SuppressWarnings("unused")
    public static void registerTeamHook(@NotNull Plugin plugin, @NotNull TeamHook hook) {
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
        return false;
    }

    public static void registerBoosterHook(@NotNull BoosterHook hook) {

    }

    public static void registerTeamHook(@NotNull TeamHook hook) {
    }

    public static void setupHooks() {
    }

    public static void updateHooks() {
    }
}