package com.teknasyon.steps;

import com.teknasyon.base.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import com.teknasyon.pages.ProfilePage;

public class ProfilePageStepDefs extends TestBase {

    ProfilePage profilePage = new ProfilePage(driver);

    @Then("Profil sayfası giriş yap butonuna tıklanır")
    public void girişYapButonunaTıklanır() {
        profilePage.clickLoginButton();
    }

    @Then("Giriş yaptıktan sonra gelen pop-up textinin {string} adına girildiği kontrol edilir")
    public void girişYaptıktanSonraGelenPopUpTextininAdınaGirildiğiKontrolEdilir(String arg0) {
        profilePage.assertLoginMessage(arg0);
    }

    @And("Tamam butonuna basılarak pop-up kapatılır")
    public void tamamButonunaBasılarakPopUpKapatılır() {
        profilePage.clickPopupOkeyButton();
    }

    @And("Çarpı butonuna basarak hesabım sayfası kapatılır")
    public void çarpıButonunaBasarakHesabımSayfasıKapatılır() {
        profilePage.clickBackButton();
    }
}
