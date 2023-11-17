package com.artillexstudios.axboosters.utils;

import org.jetbrains.annotations.NotNull;

public class TimeUtils {

    public static long timeFromString(@NotNull String time) {
        final String[] tm = time.split("");
        long dateEnd = 0;
        
        String ch = "";
        for (String txt : tm) {
            switch (txt) {
                case "s" -> {
                    dateEnd += getInSeconds(Long.parseLong(ch));
                    ch = "";
                }
                case "m" -> {
                    dateEnd += getInMinutes(Long.parseLong(ch));
                    ch = "";
                }
                case "h" -> {
                    dateEnd += getInHours(Long.parseLong(ch));
                    ch = "";
                }
                case "d" -> {
                    dateEnd += getInDays(Long.parseLong(ch));
                    ch = "";
                }
                case "w" -> {
                    dateEnd += getInDays(Long.parseLong(ch) * 7L);
                    ch = "";
                }
                case "y" -> {
                    dateEnd += getInDays(Long.parseLong(ch) * 365L);
                    ch = "";
                }
                default -> ch += txt;
            }
        }

        return dateEnd;
    }

    private static long getInDays(long time) {
        return time * 86_400_000L;
    }

    private static long getInHours(long time) {
        return time * 3_600_000L;
    }

    private static long getInMinutes(long time) {
        return time * 60_000L;
    }

    private static long getInSeconds(long time) {
        return time * 1_000L;
    }
}
