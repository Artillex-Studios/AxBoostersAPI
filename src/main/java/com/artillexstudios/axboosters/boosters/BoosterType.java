package com.artillexstudios.axboosters.boosters;

import com.artillexstudios.axapi.config.Config;
import com.artillexstudios.axapi.libs.boostedyaml.boostedyaml.block.implementation.Section;
import com.artillexstudios.axapi.utils.BossBar;
import com.artillexstudios.axboosters.exception.BoosterTypeNotLoadedException;
import com.artillexstudios.axboosters.hooks.booster.BoosterHook;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class BoosterType {
    private static final int UNINITIALIZED = -10012012;
    private final Config config;
    private final String internalName;
    private final ArrayList<BoosterHook> boosted = new ArrayList<>();
    private final AtomicInteger id = new AtomicInteger(UNINITIALIZED);
    private String displayName;
    private String serverBossbarName;
    private String playerBossbarName;
    private BossBar.Color bossbarColor;
    private BossBar.Style bossbarStyle;
    private boolean bossbarEnabled;
    private List<String> serverBoosterStart;
    private List<String> serverBoosterEnd;
    private List<String> playerBoosterStart;
    private List<String> playerBoosterEnd;
    private ItemStack icon;
    private Section starter;

    public BoosterType(String internalName, @NotNull Config config) {
        this.config = config;
        this.internalName = internalName;
    }

    public void reload() {
    }

    public int getId() {
        int get = this.id.get();
        if (get == UNINITIALIZED) {
            throw new BoosterTypeNotLoadedException();
        }

        return get;
    }

    public Config getConfig() {
        return config;
    }

    public String getInternalName() {
        return internalName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public ArrayList<BoosterHook> getBoosted() {
        return boosted;
    }

    public String getServerBossbarName() {
        return serverBossbarName;
    }

    public String getPlayerBossbarName() {
        return playerBossbarName;
    }

    public BossBar.Color getBossbarColor() {
        return bossbarColor;
    }

    public BossBar.Style getBossbarStyle() {
        return bossbarStyle;
    }

    public boolean isBossbarEnabled() {
        return bossbarEnabled;
    }

    public Section getStarter() {
        return starter;
    }

    public ItemStack getIcon() {
        return icon.clone();
    }

    public List<String> getServerBoosterStart() {
        return new ArrayList<>(serverBoosterStart);
    }

    public List<String> getServerBoosterEnd() {
        return new ArrayList<>(serverBoosterEnd);
    }

    public List<String> getPlayerBoosterStart() {
        return new ArrayList<>(playerBoosterStart);
    }

    public List<String> getPlayerBoosterEnd() {
        return new ArrayList<>(playerBoosterEnd);
    }
}
