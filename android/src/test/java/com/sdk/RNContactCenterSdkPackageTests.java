package com.sdk;

import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.uimanager.ViewManager;

import junit.framework.Assert;

import org.junit.Test;

import java.util.List;

public class RNContactCenterSdkPackageTests {

    @Test
    public void createNativeModulesTest() {
        RNContactCenterSdkPackage sdkPackage = new RNContactCenterSdkPackage();
        List<NativeModule> actual = sdkPackage.createNativeModules(null);
        Assert.assertEquals(1, actual.size());
    }

    @Test
    public void createJSModulesTest() {
        RNContactCenterSdkPackage sdkPackage = new RNContactCenterSdkPackage();
        List<Class<? extends JavaScriptModule>> actual = sdkPackage.createJSModules();
        Assert.assertEquals(0, actual.size());
    }

    @Test
    public void createViewManagersTest() {
        RNContactCenterSdkPackage sdkPackage = new RNContactCenterSdkPackage();
        List<ViewManager> actual = sdkPackage.createViewManagers(null);
        Assert.assertEquals(0, actual.size());
    }
}
