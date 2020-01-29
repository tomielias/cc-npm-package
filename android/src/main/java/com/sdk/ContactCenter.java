package com.sdk;

import android.util.Log;

public class ContactCenter {

    public static final String LOG_TAG = "ContactCenter";

    public void platformLogin(String username, String password) {
        Log.d(LOG_TAG, String.format("platform login with %s / %s%n", username, password));
    }

}
