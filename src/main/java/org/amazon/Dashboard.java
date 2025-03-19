package org.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Dashboard {
    private WebDriver driver;

    public Dashboard(WebDriver driver){
        this.driver = driver;
    }

    public void DashboardAssert(){
        WebElement openDashboard = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
        String amazonText = openDashboard.getAttribute("aria-label");
        Assert.assertTrue(openDashboard.isDisplayed(), "You are on amazon.com. You can also shop on Amazon India for millions of products with fast local delivery.");
    }

    public void searchBox(String item){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(item);
        driver.findElement(By.id("nav-search-submit-button")).click();
    }


}