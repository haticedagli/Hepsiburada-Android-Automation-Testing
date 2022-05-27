package com.teknasyon.steps;

import com.teknasyon.base.TestBase;
import com.teknasyon.pages.MyListPage;
import io.cucumber.java.en.And;

public class MyListPageStepsDefs extends TestBase {

    MyListPage myListPage = new MyListPage(driver);

    @And("Beğendiklerim kategorisine gidilir.")
    public void beğendiklerimKategorisineGidilir() {
        myListPage.clickFavoritesButton();
    }
}
