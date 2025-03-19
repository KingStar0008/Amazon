package org.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class Product {
    private WebDriver driver;
    private WebDriverWait wait;

    public Product(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public  void selectProduct()  {
        WebElement refrigeratorElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='a-color-state a-text-bold' and text()='\"Refrigerator\"']")));
        Assert.assertTrue(refrigeratorElement.isDisplayed(), "Refrigerator text is not displayed on the page!");
        List<WebElement> productList = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@role='listitem']")));
        if(productList.size() > 1){
            WebElement secondProduct = productList.get(1);
            WebElement addToCartButton = wait.until(ExpectedConditions.elementToBeClickable(secondProduct.findElement(By.xpath(".//button[@name='submit.addToCart']"))));
            addToCartButton.click();
            WebElement cartButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("nav-cart")));
            cartButton.click();
        }else{
            System.out.println("Not much Item found on the page!");
        }
    }

}
