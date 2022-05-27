package com.teknasyon.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePage extends PageBase{
    public HomePage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(id = "com.pozitron.hepsiburada:id/account_menu_button")
    MobileElement profileIcon;

    @AndroidFindBy(id = "com.pozitron.hepsiburada:id/textViewSearchBox")
    MobileElement searchBar;

    @AndroidFindBy(id = "com.pozitron.hepsiburada:id/etACBSearchBox")
    MobileElement searchBox;


    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]")
    MobileElement firstSearchedElement;

    public void clickProfileIcon(){
        click(profileIcon);
    }

    public void clickSearchBar(){
        click(searchBar);
    }

    public void searchProduct(String product){
        sendText(searchBox, product);
    }

    public void clickFirstSearchedElement(){
        click(firstSearchedElement);
    }


}
