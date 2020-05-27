package com.example.tugasbesarprogmob.rumus_massa;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class SharedPrefsMassa {
    public static SharedPreferences pref;
    public static SharedPreferences.Editor editor;

    public static void setMassa1(Context context, String hitungMassa, int index) {
        pref = PreferenceManager.getDefaultSharedPreferences(context);
        editor = pref.edit();
        editor.putString("massa_symbol_1", hitungMassa);
        editor.putInt("massa_index_1", index);
        editor.apply();
    }

    public static void setMassa2(Context context, String hitungMassa, int index) {
        pref = PreferenceManager.getDefaultSharedPreferences(context);
        editor = pref.edit();
        editor.putString("massa_symbol_2", hitungMassa);
        editor.putInt("massa_index_2", index);
        editor.apply();
    }

    //get massa symbol  1
    public static String getMassaSymbol1(Context context) {
        pref = PreferenceManager.getDefaultSharedPreferences(context);
        return pref.getString("massa_symbol_1", "");
    }

    //get massa symbol  2
    public static String getMassaSymbol2(Context context) {
        pref = PreferenceManager.getDefaultSharedPreferences(context);
        return pref.getString("massa_symbol_2", "");
    }

    //get massa (1) index
    public static int getMassaIndex1(Context context) {
        pref = PreferenceManager.getDefaultSharedPreferences(context);
        return pref.getInt("massa_index_1", 0);
    }

    public static int getMassaIndex2(Context context) {
        pref = PreferenceManager.getDefaultSharedPreferences(context);
        return pref.getInt("massa_index_2", 0);
    }
}
