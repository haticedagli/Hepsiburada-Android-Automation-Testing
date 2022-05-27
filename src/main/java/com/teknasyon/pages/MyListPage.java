package com.teknasyon.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MyListPage extends PageBase {
    public MyListPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(xpath = "//*[@text='Beğendiklerim']")
    MobileElement favoritesButton;

    public void clickFavoritesButton(){
        click(favoritesButton);
    }
}
