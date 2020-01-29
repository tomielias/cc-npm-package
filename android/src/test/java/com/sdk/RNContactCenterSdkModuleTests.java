package com.sdk;

import org.junit.Assert;
import org.junit.Test;

public class RNContactCenterSdkModuleTests {

    @Test
    public void nameTest() {
        RNContactCenterSdkModule module = new RNContactCenterSdkModule(null);
        Assert.assertEquals("RNContactCenterSdk", module.getName());
    }

}
