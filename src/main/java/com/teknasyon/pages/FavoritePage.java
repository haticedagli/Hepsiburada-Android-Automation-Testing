package com.teknasyon.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebElement;

public class FavoritePage extends PageBase{
    public FavoritePage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    public void assertGivenProductExist(String productName, String productPrice) throws InterruptedException {
        Thread.sleep(30000);
        MobileElement productNameElementMobile = (MobileElement) driver.findElementByXPath("//*[@text='" + productName + "']");
        MobileElement productPriceElementMobile = (MobileElement) driver.findElementByXPath("//*[@text='" + productPrice + "']");
        assertEqual(String.valueOf(productNameElementMobile.isDisplayed()), String.valueOf(true));
        assertEqual(String.valueOf(productPriceElementMobile.isDisplayed()), String.valueOf(true));
    }
}
