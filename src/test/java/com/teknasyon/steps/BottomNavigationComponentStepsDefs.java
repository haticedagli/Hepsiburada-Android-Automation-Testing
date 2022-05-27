package com.teknasyon.steps;

import com.teknasyon.base.TestBase;
import com.teknasyon.pages.ButtomNavigationComponent;
import io.cucumber.java.en.And;

public class BottomNavigationComponentStepsDefs extends TestBase {

    ButtomNavigationComponent buttomNavigationComponent = new ButtomNavigationComponent(driver);

    @And("Ana sayfaya gidildiği kontrol edilir")
    public void anaSayfayaGidildiğiKontrolEdilir() {
        buttomNavigationComponent.assertMainPageIsChecked();
    }

    @And("Tab bar alanında Listelerim tab'ine tıklanır.")
    public void tabBarAlanındaListelerimTabIneTıklanır() {
        buttomNavigationComponent.clickMyListIcon();
    }
}
