package com.teknasyon.steps;

import com.teknasyon.base.TestBase;
import io.cucumber.java.en.And;
import com.teknasyon.pages.ProductPage;

public class ProductPageStepsDefs extends TestBase {

    ProductPage productPage = new ProductPage(driver);

    @And("3. satır 5. ürüne tıklanır ve detayına gidilir.")
    public void satırÜrüneTıklanırVeDetayınaGidilir() {
        productPage.swipeDown();
        productPage.clickFifthElement();
    }

}
