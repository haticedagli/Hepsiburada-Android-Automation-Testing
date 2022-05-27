package com.teknasyon.steps;

import com.teknasyon.base.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import com.teknasyon.pages.LoginPage;

public class LoginPageStepDefs extends TestBase {

    LoginPage loginPage = new LoginPage(driver);

    @And("Kullanıcı email {string} bilgisi girilir")
    public void kullanıcıEmailBilgisiGirilir(String arg0) {
        loginPage.enterUsername(arg0);
    }

    @And("Kullanıcı password {string} bilgisi girilir")
    public void kullanıcıPasswordBilgisiGirilir(String arg0) {
        loginPage.enterPassword(arg0);
    }

    @Then("Login sayfası kullanıcı ismi için giriş yap butonuna tıklanır")
    public void kullaniciIsmiIcinGirişYapButonunaTıklanır() {
        loginPage.clickUsernameLoginButton();
    }

    @Then("Login sayfası şifre için giriş yap butonuna tıklanır")
    public void sifreIcinGirişYapButonunaTıklanır() {
        loginPage.clickPasswordLoginButton();
    }

    @Then("Başarısız login {string} mesajı kontrol edilir")
    public void başarısızLoginGörülür(String arg0) {
        loginPage.assertWrongMessage(arg0);
    }
}
