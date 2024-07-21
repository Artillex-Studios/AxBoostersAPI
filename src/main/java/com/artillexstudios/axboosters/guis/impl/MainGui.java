package com.artillexstudios.axboosters.guis.impl;

import com.artillexstudios.axapi.config.Config;
import com.artillexstudios.axapi.libs.boostedyaml.boostedyaml.settings.dumper.DumperSettings;
import com.artillexstudios.axapi.libs.boostedyaml.boostedyaml.settings.general.GeneralSettings;
import com.artillexstudios.axapi.libs.boostedyaml.boostedyaml.settings.loader.LoaderSettings;
import com.artillexstudios.axapi.libs.boostedyaml.boostedyaml.settings.updater.UpdaterSettings;
import com.artillexstudios.axboosters.AxBoosters;
import com.artillexstudios.axboosters.guis.GuiFrame;
import org.bukkit.entity.Player;

import java.io.File;

public class MainGui extends GuiFrame {
    private static final Config GUI = new Config(new File(AxBoosters.getInstance().getDataFolder(), "guis/main.yml"),
            AxBoosters.getInstance().getResource("guis/main.yml"),
            GeneralSettings.builder().setUseDefaults(false).build(),
            LoaderSettings.builder().build(),
            DumperSettings.DEFAULT,
            UpdaterSettings.builder().build()
    );

    public MainGui(Player player) {
        super(GUI, player);
    }

    public static boolean reload() {
        return GUI.reload();
    }

    public void open() {
    }
}
