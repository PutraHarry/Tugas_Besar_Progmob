package com.example.tugasbesarprogmob.rumus_luas;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class SharedPrefsLuas {
    public static SharedPreferences pref;
    public static SharedPreferences.Editor editor;

    public static void setLuas1(Context context, String hitungLuas, int index) {
        pref = PreferenceManager.getDefaultSharedPreferences(context);
        editor = pref.edit();
        editor.putString("luas_symbol_1", hitungLuas);
        editor.putInt("luas_index_1", index);
        editor.apply();
    }

    public static void setLuas2(Context context, String hitungLuas, int index) {
        pref = PreferenceManager.getDefaultSharedPreferences(context);
        editor = pref.edit();
        editor.putString("luas_symbol_2", hitungLuas);
        editor.putInt("luas_index_2", index);
        editor.apply();
    }

    //get luas symbol  1
    public static String getLuasSymbol1(Context context) {
        pref = PreferenceManager.getDefaultSharedPreferences(context);
        return pref.getString("luas_symbol_1", "");
    }

    //get luas symbol  2
    public static String getLuasSymbol2(Context context) {
        pref = PreferenceManager.getDefaultSharedPreferences(context);
        return pref.getString("luas_symbol_2", "");
    }

    //get luas (1) index
    public static int getLuasIndex1(Context context) {
        pref = PreferenceManager.getDefaultSharedPreferences(context);
        return pref.getInt("luas_index_1", 0);
    }

    public static int getLuasIndex2(Context context) {
        pref = PreferenceManager.getDefaultSharedPreferences(context);
        return pref.getInt("luas_index_2", 0);
    }
}
