package com.v3home.myapplication.Preferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

/**
 * Created by J.James on 30/09/2014.
 */
public class PreferencesManager {
    //Shared en modo privado
    private final static int PRIVATE_MODE = 0;

    //Sharedpref nombre del archivo
    private final static String PREF_NAME = "preferences";

    // Datos a guardar en SharedPreferences
    private final static String KEY_USER = "_user";
    private final static String KEY_PASS = "_pass";
    private final static String KEY_LOGIN = "_islogin";

    //Shared Preferences
    private SharedPreferences pref;

    //Editor para SharedPreferences
    private Editor mEditor;

    public PreferencesManager(Context ctx){
        this.pref = ctx.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        this.mEditor = pref.edit();
    }

    public boolean isLogin(){
        return pref.getBoolean(KEY_LOGIN, false);
    }

    public void putUser(String user, String pass){
        mEditor.putString(KEY_USER, user);
        mEditor.putString(KEY_PASS, pass);
        mEditor.putBoolean(KEY_LOGIN, true);
        mEditor.commit();
    }

    public String getUser(){
        return pref.getString(KEY_USER, "");
    }
}
