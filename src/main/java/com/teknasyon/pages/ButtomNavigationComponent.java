package com.teknasyon.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ButtomNavigationComponent extends PageBase{
    public ButtomNavigationComponent(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(id = "com.pozitron.hepsiburada:id/nav_graph_home")
    MobileElement mainpageIcon;

    @AndroidFindBy(id = "com.pozitron.hepsiburada:id/nav_graph_my_list")
    MobileElement myListIcon;

    public void assertMainPageIsChecked(){
        waitForVisibility(mainpageIcon);
        assertEqual(String.valueOf(mainpageIcon.isSelected()), String.valueOf(true));
    }

    public void clickMyListIcon(){
        click(myListIcon);
    }
}
