package com.artillexstudios.axboosters.boosters.types.item;

import com.artillexstudios.axboosters.enums.EnchantType;
import com.artillexstudios.axboosters.hooks.booster.BoosterHook;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class ItemBooster {

    public static float getMultiplierHand(Player player, BoosterHook hook) {
        return 0;
    }

    public static float getMultiplierOffHand(Player player, BoosterHook hook) {
        return 0;
    }

    public static float getMultiplierArmor(Player player, BoosterHook hook) {
        return 0;
    }

    public static float getMultiplierInventory(Player player, BoosterHook hook) {
        return 0;
    }

    private static float getMultiplierItem(ItemStack item, BoosterHook hook, EnchantType enchantType) {
        return 0;
    }
}
