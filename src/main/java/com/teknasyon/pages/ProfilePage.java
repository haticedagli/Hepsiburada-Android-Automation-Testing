package com.teknasyon.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ProfilePage extends PageBase{
    public ProfilePage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"account_menu_button_1\"]/android.view.ViewGroup/android.widget.Button")
    MobileElement loginButton;

    @AndroidFindBy(id = "android:id/message")
    MobileElement loginMessage;

    @AndroidFindBy(id = "android:id/button1")
    MobileElement popupOkeyButton;

    @AndroidFindBy(id = "com.pozitron.hepsiburada:id/ivToolbarBack")
    MobileElement backButton;

    public void clickLoginButton(){
        click(loginButton);
    }

    public void clickPopupOkeyButton(){
        click(popupOkeyButton);
    }

    public void clickBackButton(){
        click(backButton);
    }

    public void assertLoginMessage(String loginUserName){
        waitForVisibility(loginMessage);
        assertEqual(String.format("Hoş geldin %s. Keyifli alışverişler dileriz.", loginUserName), loginMessage.getText());
    }
}
