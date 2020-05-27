package com.example.tugasbesarprogmob.rumus_panjang;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class SharedPrefsPanjang {
    public static SharedPreferences pref;
    public static SharedPreferences.Editor editor;

    public static void setPanjang1(Context context, String hitungPanjang, int index) {
        pref = PreferenceManager.getDefaultSharedPreferences(context);
        editor = pref.edit();
        editor.putString("panjang_symbol_1", hitungPanjang);
        editor.putInt("panjang_index_1", index);
        editor.apply();
    }

    public static void setPanjang2(Context context, String hitungPanjang, int index) {
        pref = PreferenceManager.getDefaultSharedPreferences(context);
        editor = pref.edit();
        editor.putString("panjang_symbol_2", hitungPanjang);
        editor.putInt("panjang_index_2", index);
        editor.apply();
    }

    //get panjang symbol  1
    public static String getPanjangSymbol1(Context context) {
        pref = PreferenceManager.getDefaultSharedPreferences(context);
        return pref.getString("panjang_symbol_1", "");
    }

    //get Panjang symbol  2
    public static String getPanjangSymbol2(Context context) {
        pref = PreferenceManager.getDefaultSharedPreferences(context);
        return pref.getString("panjang_symbol_2", "");
    }

    //get Panjang (1) index
    public static int getPanjangIndex1(Context context) {
        pref = PreferenceManager.getDefaultSharedPreferences(context);
        return pref.getInt("panjang_index_1", 0);
    }

    public static int getPanjangIndex2(Context context) {
        pref = PreferenceManager.getDefaultSharedPreferences(context);
        return pref.getInt("panjang_index_2", 0);
    }
}
