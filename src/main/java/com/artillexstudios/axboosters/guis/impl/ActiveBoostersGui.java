package com.artillexstudios.axboosters.guis.impl;

import com.artillexstudios.axapi.config.Config;
import com.artillexstudios.axapi.libs.boostedyaml.boostedyaml.settings.dumper.DumperSettings;
import com.artillexstudios.axapi.libs.boostedyaml.boostedyaml.settings.general.GeneralSettings;
import com.artillexstudios.axapi.libs.boostedyaml.boostedyaml.settings.loader.LoaderSettings;
import com.artillexstudios.axapi.libs.boostedyaml.boostedyaml.settings.updater.UpdaterSettings;
import com.artillexstudios.axboosters.AxBoosters;
import com.artillexstudios.axboosters.guis.GuiFrame;
import com.artillexstudios.axboosters.users.User;
import com.artillexstudios.axboosters.users.UserList;
import org.bukkit.entity.Player;

import java.io.File;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

public class ActiveBoostersGui extends GuiFrame {
    private static final Set<ActiveBoostersGui> openMenus = Collections.newSetFromMap(new WeakHashMap<>());

    private static final Config GUI = new Config(new File(AxBoosters.getInstance().getDataFolder(), "guis/active-boosters.yml"),
            AxBoosters.getInstance().getResource("guis/active-boosters.yml"),
            GeneralSettings.builder().setUseDefaults(false).build(),
            LoaderSettings.builder().build(),
            DumperSettings.DEFAULT,
            UpdaterSettings.builder().build()
    );

    private final MainGui prevGui;
    private final User user;

    public ActiveBoostersGui(Player player, MainGui prevGui) {
        super(GUI, player);
        this.user = UserList.getUser(player);
        this.prevGui = prevGui;
    }

    public static boolean reload() {
        return GUI.reload();
    }

    public void open() {
    }

    public void updateTitle() {
    }

    public void loadItems() {
    }

    public static Set<ActiveBoostersGui> getOpenMenus() {
        return openMenus;
    }
}
