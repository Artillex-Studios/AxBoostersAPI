package com.artillexstudios.axboosters.hooks.booster;

import com.artillexstudios.axboosters.users.User;
import net.kyori.adventure.key.Key;
import org.bukkit.Material;

public interface BoosterHook {

    Key getKey();

    Material getIcon();

    boolean isPersistent();

    default void apply(User user) {}

    default void unapply(User user) {}
}
