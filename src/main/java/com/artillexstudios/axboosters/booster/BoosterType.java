package com.artillexstudios.axboosters.booster;

import com.artillexstudios.axboosters.hooks.booster.BoosterHook;
import net.kyori.adventure.bossbar.BossBar;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;

public class BoosterType {
    private String name;
    private final ArrayList<BoosterHook> boosted = new ArrayList<>();
    private String bossbarName;
    private BossBar.Color bossbarColor;
    private BossBar.Overlay bossbarStyle;
    private boolean bossbarEnabled;
    private String chatStart;
    private String chatEnd;
    private ItemStack item;
    private String itemName;

    public BoosterType() {
    }

    public String getName() {
        return name;
    }

    public BossBar.Color getBossbarColor() {
        return bossbarColor;
    }

    public ArrayList<BoosterHook> getBoosted() {
        return boosted;
    }

    public BossBar.Overlay getBossbarStyle() {
        return bossbarStyle;
    }

    public String getBossbarName() {
        return bossbarName;
    }

    public boolean isBossbarEnabled() {
        return bossbarEnabled;
    }

    public String getChatEnd() {
        return chatEnd;
    }

    public String getChatStart() {
        return chatStart;
    }

    public ItemStack getItem() {
        return item.clone();
    }

    public String getItemName() {
        return itemName;
    }
}
