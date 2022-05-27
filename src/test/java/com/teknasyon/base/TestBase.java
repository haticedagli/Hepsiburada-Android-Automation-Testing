package com.teknasyon.base;

import com.teknasyon.Context;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.cucumber.java.Scenario;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
public class TestBase {
    public static AppiumDriver driver;
    public static Context context;

    public static void androidSetUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformVersion", "11");
        caps.setCapability("deviceName", "pixel_5");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("noReset", false);
        caps.setCapability("fullReset", true);
        caps.setCapability("app", System.getProperty("user.dir") + "/apps/hepsiburada.apk");
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
    }

    public static void browserStackAndroid(Scenario scenario) throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browserstack.user", "mahmutbel_Lpol86");
        caps.setCapability("browserstack.key", "B844imn5xGxNPRsHMevV");
        caps.setCapability("app", "bs://466dd85268367164abf2a003392e3d7da612561a");
        caps.setCapability("device", "Samsung Galaxy S22 Ultra");
        caps.setCapability("os_version", "12.0");
        caps.setCapability("project", "Android Hepsiburada Testing");
        caps.setCapability("build", "Hepsiburada Android Test");
        caps.setCapability("name", scenario.getName());
        caps.setCapability("browserstack.debug", true);
        driver = new AndroidDriver(new URL("http://hub.browserstack.com/wd/hub"), caps);
    }

    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
