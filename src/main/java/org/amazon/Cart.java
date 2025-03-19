package org.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Cart {
    private WebDriver driver;
    private WebDriverWait wait;

    public Cart(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void checkout(){
        WebElement checkoutButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='proceedToRetailCheckout']")));
        checkoutButton.click();
    }

    public void checkoutAssert(){
        WebElement SignIn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(), 'Sign in')]")));
        Assert.assertTrue(SignIn.isDisplayed(), "SignIn page is not displayed!");
    }
}
