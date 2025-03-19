package com.amazonTest;


import org.amazon.Dashboard;
import org.amazon.Product;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ProductTest extends Base{
    @Test
    public void selectProductItem() throws InterruptedException {
        Product product = new Product(getDriver());
        product.selectProduct();


    }
}
