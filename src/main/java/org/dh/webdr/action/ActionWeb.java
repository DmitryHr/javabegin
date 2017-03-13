package org.dh.webdr.action;

import org.dh.webdr.webDriver.RunWebdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by Alcom on 13.03.2017.
 */
public class ActionWeb{
    public WebElement element = new By();
    public void myFindElement(String xpath){
       element.findElement(By.xpath(xpath));
    }

    public void myClickElement(String xpath){
        element.findElement(By.xpath(xpath)).click();
    }

    public void myPrintText(String xpath, String textForPrint){
        element.findElement(By.xpath(xpath)).sendKeys(textForPrint);
    }

}
