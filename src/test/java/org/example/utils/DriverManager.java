package org.example.utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class DriverManager {
    private static AndroidDriver driver;

    public static AndroidDriver getDriver() {
        if (driver == null) {
            try {
                File app = new File("/Users/lucaspierotti/Documents/main/propio/testing-personal/appium/ChallengeLucas/src/test/resources/apps/ZINIO_4.64.0_apkcombo.app.apk");

                DesiredCapabilities caps = new DesiredCapabilities();
                caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
                caps.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
                caps.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
                caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

                driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
