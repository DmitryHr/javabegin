package org.dh.webdr.run;

import org.dh.webdr.action.ActionWeb;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Alcom on 13.03.2017.
 */
public class Main {


    public static void main (String [] args){
        ActionWeb actW = new ActionWeb();
        WebDriver driver = new FirefoxDriver();

        driver.navigate().to("http://www.google.ru");

        actW.myFindElement("//input[@id='gs_htif0']");
        actW.myPrintText("//input[@id='gs_htif0']", "Jazzteam");

        driver.close();

    }


}
