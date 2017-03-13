package com.learn.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Google_search {
    private static WebElement element = null;

    public static WebElement findElQ(WebDriver driver){
        element  = driver.findElement(By.name("q"));
        return element;
    }



}
