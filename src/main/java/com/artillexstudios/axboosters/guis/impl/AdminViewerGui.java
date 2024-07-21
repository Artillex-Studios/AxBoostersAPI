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
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

import java.io.File;

public class AdminViewerGui extends GuiFrame {
    private static final Config GUI = new Config(new File(AxBoosters.getInstance().getDataFolder(), "guis/admin-viewer.yml"),
            AxBoosters.getInstance().getResource("guis/admin-viewer.yml"),
            GeneralSettings.builder().setUseDefaults(false).build(),
            LoaderSettings.builder().build(),
            DumperSettings.DEFAULT,
            UpdaterSettings.builder().build()
    );

    private final User user;
    private final OfflinePlayer owner;
    private final String userName;

    public AdminViewerGui(Player player, OfflinePlayer owner) {
        super(GUI, player);
        this.user = UserList.getUser(player);
        this.owner = owner;
        this.userName = AxBoosters.getDatabase().getUserName(owner.getUniqueId());
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
}
