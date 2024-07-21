package com.artillexstudios.axboosters.boosters;

import com.artillexstudios.axboosters.boosters.types.activated.ActiveBooster;
import com.artillexstudios.axboosters.boosters.types.activated.Booster;
import com.artillexstudios.axboosters.hooks.booster.BoosterHook;
import org.bukkit.entity.Player;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;

public class BoosterManager {
    private static final ConcurrentLinkedQueue<ActiveBooster> cachedBoosters = new ConcurrentLinkedQueue<>();

    public static double multiply(float multiplier, double originalValue) {
        return originalValue * multiplier;
    }

    public static float multiply(float multiplier, float originalValue) {
        return originalValue * multiplier;
    }

    public static long multiply(float multiplier, long originalValue) {
        return Math.round(originalValue * multiplier);
    }

    public static int multiply(float multiplier, int originalValue) {
        return Math.round(originalValue * multiplier);
    }

    public static BigDecimal multiply(float multiplier, BigDecimal originalValue) {
        return originalValue.multiply(BigDecimal.valueOf(multiplier));
    }

    public static BigInteger multiply(float multiplier, BigInteger originalValue) {
        return BigInteger.valueOf(Math.round(originalValue.doubleValue() * multiplier));
    }

    public static float getMultiplierPercent(Player player, BoosterHook hook) {
        return 0;
    }

    public static float getMultiplier(Player player, BoosterHook hook) {
        return getDecimalFormat(getMultiplierPercent(player, hook));
    }

    public static float getDecimalFormat(float percentage) {
        return 1f + (percentage / 100f);
    }

    public static float stack(float original, float add) {
        return 0;
    }

    public static ConcurrentLinkedQueue<ActiveBooster> getCachedBoosters() {
        return cachedBoosters;
    }

    public static void activateBooster(ActiveBooster booster) {
        activateBooster(booster, false, true);
    }

    public static void activateBooster(ActiveBooster booster, boolean silent) {
        activateBooster(booster, silent, true);
    }

    public static void activateBooster(ActiveBooster booster, boolean silent, boolean local) {
    }

    public static void stopBooster(ActiveBooster booster) {
    }

    public static ArrayList<ActiveBooster> getAllBoosters(Player player, BoosterHook hook) {
        return new ArrayList<>();
    }

    public static ArrayList<ActiveBooster> getAllBoosters(Player player) {
        return new ArrayList<>();
    }

    public static void sendThankYou(String from, Player to) {
    }

    public static boolean canActivate(Player player, Booster booster) {
        return true;
    }
}
