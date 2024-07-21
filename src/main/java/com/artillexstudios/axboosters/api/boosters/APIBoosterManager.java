package com.artillexstudios.axboosters.api.boosters;

import com.artillexstudios.axboosters.hooks.booster.BoosterHook;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class APIBoosterManager {
    // note: you should store the Booster object locally, axboosters will never unregister it (only after a restart)
    // api boosters also don't expire
    public static void register(Plugin plugin, APIBooster booster) {
    }

    public static void unregister(Plugin plugin, APIBooster booster) {
    }

    public static void unregister(Plugin plugin) {
    }

    private static void updateUsers(APIBooster booster) {
    }

    public static float getAPIMultiplierPercent(Player player, BoosterHook hook) {
        return 0;
    }
}
