package com.example.periodictable;

import android.graphics.Color;

import androidx.core.graphics.ColorUtils;

public class Utils {
    public static String firstUpperCase(String s) {
        return s.substring(0,1).toUpperCase() + s.substring(1);
    }

    public static int getColor(String type) {
        switch (type) {
            case "metall alcalí":
                return Color.parseColor("#ffaa00");
            case "no metàl·lic":
                return Color.parseColor("#00ff00");
            case "gas noble":
                return Color.parseColor("#dd0099");
            case "metall alcalino-terrós":
                return Color.parseColor("#dd8800");
            case "metal·lide":
                return Color.parseColor("#0000ff");
            case "halògen":
                return Color.parseColor("#ff00ff");
            case "actinoide":
                return Color.parseColor("#ff00ff");
            case "metall post-transició":
                return Color.YELLOW;
            case "metal·loide":
                return Color.parseColor("#0000dd");
            case "metall de transició":
                return Color.parseColor("#aaaaaa");
            case "lanthanoide":
                return Color.parseColor("#992200");
            default:
                return Color.WHITE;

        }
    }
}
