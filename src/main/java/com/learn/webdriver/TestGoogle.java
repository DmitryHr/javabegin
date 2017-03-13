package com.learn.webdriver;

/**
 * Created by Alcom on 16.01.2017.
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.learn.pageObject.Google_search;

public class TestGoogle {

    private static WebDriver driver = null;
    public static void main(String [] args){

        driver = new FirefoxDriver();
        driver.navigate().to("http://www.google.ru");

        Google_search.findElQ(driver).click();
        Google_search.findElQ(driver).sendKeys("Selenium");
        Google_search.findElQ(driver).submit();

        System.out.println("Page title is: " + driver.getTitle());

        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>(){
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith("selenium");
            }
        });

        System.out.println("Page title is: " + driver.getTitle());

        driver.quit();
    }
}
