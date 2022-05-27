package com.teknasyon.steps;

import com.teknasyon.base.TestBase;
import com.teknasyon.pages.ButtomNavigationComponent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import com.teknasyon.pages.HomePage;

public class HomePageStepsDefs extends TestBase {

    HomePage homePage = new HomePage(driver);

    @Then("Anasayfadaki profil iconuna tıklanır")
    public void anasayfadakiProfilIconunaTıklanır() {
        homePage.clickProfileIcon();
    }

    @And("Arama barından {string} ürünü aranır.")
    public void aramaBarındanÜrünüAranır(String arg0) throws InterruptedException {
        homePage.searchProduct(arg0);
        Thread.sleep(5000);
        homePage.clickFirstSearchedElement();
    }

    @And("Arama barına tıklanır")
    public void aramaBarınaTıklanır() {
        homePage.clickSearchBar();
    }
}
