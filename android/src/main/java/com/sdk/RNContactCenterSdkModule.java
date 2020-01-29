
package com.sdk;

import android.widget.Toast;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import java.util.HashMap;
import java.util.Map;

public class RNContactCenterSdkModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private ContactCenter contactCenter;

    private static final String DURATION_SHORT_KEY = "SHORT";
    private static final String DURATION_LONG_KEY = "LONG";

    public RNContactCenterSdkModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
        this.contactCenter = new ContactCenter();
    }

    @Override
    public String getName() {
        return "RNContactCenterSdk";
    }

    @Override
    public Map<String, Object> getConstants() {
        final Map<String, Object> constants = new HashMap<>();
        constants.put(DURATION_SHORT_KEY, Toast.LENGTH_SHORT);
        constants.put(DURATION_LONG_KEY, Toast.LENGTH_LONG);
        return constants;
    }

    @ReactMethod
    public void platformLogin(String username, String password) {
        this.contactCenter.platformLogin(username, password);
    }

}