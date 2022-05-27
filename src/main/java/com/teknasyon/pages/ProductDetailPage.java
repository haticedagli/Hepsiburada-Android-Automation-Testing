package com.teknasyon.pages;

import com.teknasyon.Context;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ProductDetailPage extends PageBase{

    Context context;

    public ProductDetailPage(AppiumDriver appiumDriver, Context context) {
        super(appiumDriver);
        this.context = context;
    }

    @AndroidFindBy(id = "com.pozitron.hepsiburada:id/product_detail_favourites")
    MobileElement favoriteButton;

    @AndroidFindBy(id = "com.pozitron.hepsiburada:id/productName")
    MobileElement productName;

    @AndroidFindBy(id = "com.pozitron.hepsiburada:id/leftIcon")
    MobileElement backButton;

    @AndroidFindBy(id = "com.pozitron.hepsiburada:id/price")
    MobileElement productPrice;

    public void clickFavoriteButton(){
        click(favoriteButton);
    }

    public void saveProductNameIntoContext(){
        waitForVisibility(productName);
        context.productName = productName.getText();
    }

    public void saveProductPriceIntoContext(){
        waitForVisibility(productPrice);
        context.productPrice = productPrice.getText();
    }

    public void clickBackButton(){
        click(backButton);
    }
}
