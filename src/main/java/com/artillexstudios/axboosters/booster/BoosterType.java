package com.artillexstudios.axboosters.booster;

import com.artillexstudios.axapi.libs.boostedyaml.boostedyaml.block.implementation.Section;
import com.artillexstudios.axapi.utils.ItemBuilder;
import com.artillexstudios.axapi.utils.StringUtils;
import net.kyori.adventure.bossbar.BossBar;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class BoosterType {
    private final String type;
    private final String bossbarName;
    private final BossBar.Color bossbarColor;
    private final BossBar.Overlay bossbarStyle;
    private final String chatStart;
    private final String chatEnd;
    private final ItemStack item;

    public BoosterType(@NotNull Section section) {
        this.type = section.getString("type");
        this.bossbarName = section.getString("bossbar.name");
        this.bossbarColor = BossBar.Color.valueOf(section.getString("bossbar.color").toUpperCase());
        this.bossbarStyle = BossBar.Overlay.valueOf(section.getString("bossbar.style").toUpperCase());
        this.chatStart = StringUtils.formatToString(section.getString("chat.start"));
        this.chatEnd = StringUtils.formatToString(section.getString("chat.end"));
        this.item = new ItemBuilder(section.getSection("item")).get();
    }

    public BossBar.Color getBossbarColor() {
        return bossbarColor;
    }

    public String getType() {
        return type;
    }

    public BossBar.Overlay getBossbarStyle() {
        return bossbarStyle;
    }

    public String getBossbarName() {
        return bossbarName;
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
}
