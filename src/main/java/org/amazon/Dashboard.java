package org.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dashboard {
    private WebDriver driver;

    public Dashboard(WebDriver driver){
        this.driver = driver;
    }

    public void searchBox(String item){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(item);
        driver.findElement(By.id("nav-search-submit-button")).click();
    }
}