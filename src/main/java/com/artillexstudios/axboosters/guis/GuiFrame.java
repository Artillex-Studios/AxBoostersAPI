package com.artillexstudios.axboosters.guis;

import com.artillexstudios.axapi.config.Config;
import org.bukkit.entity.Player;

public class GuiFrame {
    protected final Config file;
    protected Player player;

    public GuiFrame(Config file, Player player) {
        this.file = file;
        this.player = player;
    }
}
