package org.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Dashboard {
    private WebDriver driver;
    private WebDriverWait wait;

    public Dashboard(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void DashboardAssert(){
        WebElement openDashboard = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='nav-logo-sprites']")));
        String amazonText = openDashboard.getAttribute("aria-label");
        Assert.assertTrue(openDashboard.isDisplayed(), "You are on amazon.com. You can also shop on Amazon India for millions of products with fast local delivery.");
    }

    public void searchBox(String item){
        WebElement searchBox = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("twotabsearchtextbox")));
        searchBox.sendKeys(item);
        WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("nav-search-submit-button")));
        searchButton.click();
    }


}