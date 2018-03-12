package org.selyale.evernote.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSingleton {

    private static WebDriver driver;

    public static WebDriver getChromeWebDriver() {
        if (driver == null) {
            driver = new ChromeDriver();
            Waiters.implicitlyWait(driver, 3);
            Waiters.pageLoadTimeout(driver, 5);
            driver.manage().window().maximize();
        }

        return driver;
    }

    public static WebDriver getIEWebDriver() throws Exception{
        throw new Exception("The method getIEWebDriver should be written before usage");
    }

    public static WebDriver getFirefoxWebDriver() throws Exception{
        throw new Exception("The method getFirefoxWebDriver should be written before usage");
    }

}
