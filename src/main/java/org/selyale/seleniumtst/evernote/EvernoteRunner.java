package org.selyale.seleniumtst.evernote;

import net.thucydides.core.pages.PageObject;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.selyale.seleniumtst.evernote.pageobjects.LoginPage;

public class EvernoteRunner extends PageObject {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.evernote.com/Login.action");

        new LoginPage(driver)
                .typeUsername("selyaev")
                .enableRememberMe()
                .typePassword("selyaev")
                .submitLogin();

        driver.quit();

    }

}
