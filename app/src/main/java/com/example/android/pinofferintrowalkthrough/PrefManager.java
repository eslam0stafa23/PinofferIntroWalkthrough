package com.example.android.pinofferintrowalkthrough;

import android.content.Context;
import android.content.SharedPreferences;


class PrefManager {
    private SharedPreferences pref;
    private SharedPreferences.Editor editor;

    // Shared preferences file name
    private static final String PREF_NAME = "Pinoffer Intro Walkthrough";

    private static final String IS_FIRST_TIME_LAUNCH = "IsFirstTimeLaunch";

    public PrefManager(Context context) {
        Context context1 = context;
        // shared pref mode
        int PRIVATE_MODE = 0;
        pref = context1.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }

    public void setFirstTimeLaunch(boolean isFirstTime) {
        editor.putBoolean(IS_FIRST_TIME_LAUNCH, isFirstTime);
        editor.commit();
    }

    public boolean isFirstTimeLaunch() {
        return pref.getBoolean(IS_FIRST_TIME_LAUNCH, true);
    }

}
