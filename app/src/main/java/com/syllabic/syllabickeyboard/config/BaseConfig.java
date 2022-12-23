package com.syllabic.syllabickeyboard.config;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class BaseConfig {
    public static String CONFIG_SharedPreferences = "CONFIG_SharedPreferences";
    public static String CONFIG_SharedPreferences_check_enable = "CONFIG_SharedPreferences_check_enable";
    public static String CONFIG_SharedPreferences_suggest = "CONFIG_SharedPreferences_check_enable";

    public static void saveListInLocal(ArrayList<String> list,Context context) {
        SharedPreferences prefs = context.getSharedPreferences("AppNameOne", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        Gson gson = new Gson();
        String json = gson.toJson(list);
        editor.putString(CONFIG_SharedPreferences, json);
        editor.apply();
    }

    public static ArrayList<String> getListFromLocal(Context context) {
        SharedPreferences prefs = context.getSharedPreferences("AppNameOne", Context.MODE_PRIVATE);
        Gson gson = new Gson();
        String json = prefs.getString(CONFIG_SharedPreferences, null);
        Type type = new TypeToken<ArrayList<String>>() {}.getType();
        return gson.fromJson(json, type);

    }

    public static void saveListSuggestion(ArrayList<String> list,Context context) {
        SharedPreferences prefs = context.getSharedPreferences("AppNameTwo", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        Gson gson = new Gson();
        String json = gson.toJson(list);
        editor.putString(CONFIG_SharedPreferences_suggest, json);
        editor.apply();
    }

    public static ArrayList<String> getListSuggestion(Context context) {
        SharedPreferences prefs = context.getSharedPreferences("AppNameTwo", Context.MODE_PRIVATE);
        Gson gson = new Gson();
        String json = prefs.getString(CONFIG_SharedPreferences_suggest, null);
        Type type = new TypeToken<ArrayList<String>>() {}.getType();
        return gson.fromJson(json, type);

    }

    public static void saveLastButtonPressed(Boolean enable,Context context) {
        SharedPreferences sharedPref = context.getSharedPreferences("AppNameThree", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putBoolean(CONFIG_SharedPreferences_check_enable, enable);
        editor.apply();
    }

    public static boolean readLastButtonPressed(Context context) {
        SharedPreferences sharedPref = context.getSharedPreferences("AppNameThree", Context.MODE_PRIVATE);
        return sharedPref.getBoolean(CONFIG_SharedPreferences_check_enable, false);
    }

}
