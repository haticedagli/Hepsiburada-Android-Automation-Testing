package com.teknasyon.steps;

import com.teknasyon.base.TestBase;
import com.teknasyon.pages.FavoritePage;
import io.cucumber.java.en.Then;

public class FavoritePageStepsDefs extends TestBase {

    FavoritePage favoritePage = new FavoritePage(driver);

    @Then("Favoriye eklenen ürünün geldiği ve ürün fiyatının doğru geldiği kontrol edilir.")
    public void favoriyeEklenenÜrününGeldiğiVeÜrünFiyatınınDoğruGeldiğiKontrolEdilir() throws InterruptedException {
        favoritePage.assertGivenProductExist(context.productName, context.productPrice);
    }
}
