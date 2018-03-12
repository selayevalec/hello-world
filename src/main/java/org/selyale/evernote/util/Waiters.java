package org.selyale.evernote.util;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public final class Waiters {

    public static void waitUntilPresenceOfWebEleKent(WebDriver driver, WebElement element, int sec) {
        (new WebDriverWait(driver, sec))
                .until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitUntilPresenceOfBy(WebDriver driver, By locator, int sec) {
        (new WebDriverWait(driver, sec))
                .until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public static void waitUntilDisplayedBy(WebDriver driver, By locator, int sec) {
        (new WebDriverWait(driver, sec))
                .until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void implicitlyWait(WebDriver driver, int sec) {
        driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
    }

    public static void pageLoadTimeout(WebDriver driver, int sec) {
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    }

    public static void waitALittle() {

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException ie) {
            Logger.getLogger(Waiters.class).error("Exception while the timout");
        }
    }
}
