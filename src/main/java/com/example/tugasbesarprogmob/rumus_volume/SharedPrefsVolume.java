package com.example.tugasbesarprogmob.rumus_volume;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class SharedPrefsVolume {
    public static SharedPreferences pref;
    public static SharedPreferences.Editor editor;

    public static void setVolume1(Context context, String hitungVolume, int index) {
        pref = PreferenceManager.getDefaultSharedPreferences(context);
        editor = pref.edit();
        editor.putString("volume_symbol_1", hitungVolume);
        editor.putInt("volume_index_1", index);
        editor.apply();
    }

    public static void setVolume2(Context context, String hitungVolume, int index) {
        pref = PreferenceManager.getDefaultSharedPreferences(context);
        editor = pref.edit();
        editor.putString("volume_symbol_2", hitungVolume);
        editor.putInt("volume_index_2", index);
        editor.apply();
    }

    //get volume symbol  1
    public static String getVolumeSymbol1(Context context) {
        pref = PreferenceManager.getDefaultSharedPreferences(context);
        return pref.getString("volume_symbol_1", "");
    }

    //get volume symbol  2
    public static String getVolumeSymbol2(Context context) {
        pref = PreferenceManager.getDefaultSharedPreferences(context);
        return pref.getString("volume_symbol_2", "");
    }

    //get volume (1) index
    public static int getVolumeIndex1(Context context) {
        pref = PreferenceManager.getDefaultSharedPreferences(context);
        return pref.getInt("volume_index_1", 0);
    }

    public static int getVolumeIndex2(Context context) {
        pref = PreferenceManager.getDefaultSharedPreferences(context);
        return pref.getInt("volume_index_2", 0);
    }
}
