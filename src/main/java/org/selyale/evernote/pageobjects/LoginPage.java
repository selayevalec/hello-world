package org.selyale.evernote.pageobjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.selyale.evernote.EvernoteRunner;
import org.selyale.evernote.util.Waiters;

public class LoginPage {
    final Logger logger = Logger.getLogger(LoginPage.class);
    private final WebDriver driver;

    By usernameLocator = By.id("username");
    By passwordLocator = By.id("password");
    By loginButtonLocator = By.id("loginButton");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage typeUsername(String username) {
        driver.findElement(usernameLocator).sendKeys(username);
        logger.info("username:" + username);
        return this;
    }

    public HomePage submitLogin() {
        driver.findElement(loginButtonLocator).submit();
        logger.info("Login is submitted");
        EvernoteRunner.waitALittle();
        return new HomePage(driver);
    }

    public LoginPage clickSubmitIfPasswordNotShowed() {
        logger.info("click entered");
        if (!driver.findElement(passwordLocator).isDisplayed()) {
            driver.findElement(loginButtonLocator).submit();
            logger.info("Password should be shown");
        } else {
            logger.info("Password was shown already");
        }

        return new LoginPage(driver);
    }

    public LoginPage typePassword(String password) {
        logger.info("Password is shown:"+driver.findElement(passwordLocator).isDisplayed());
        driver.findElement(passwordLocator).sendKeys(password);
        logger.info("password:" + password);
        return this;
    }

    public boolean passwordIsVisible() {
        return driver.findElement(passwordLocator).isDisplayed();
    }

}
