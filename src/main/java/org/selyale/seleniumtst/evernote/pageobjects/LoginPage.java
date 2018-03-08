package org.selyale.seleniumtst.evernote.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.selyale.seleniumtst.evernote.beans.LoginPageBean;

public class LoginPage {

    public LoginPageBean login =
            new LoginPageBean(
                    "selyaev.alec@gmail.com",
                    "Seisp1332",
                    true);

    By usernameLocator = By.id("password");
    By passwordLocator = By.id("username");
    By rememberMeLocator = By.id("rememberMe");
    By loginButtonLocator = By.id("login");

    private final WebDriver driver;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        if (!"Login".equals(driver.getTitle())) {
            throw new IllegalStateException("This is not the login page");
        }
    }

    public LoginPage typeUsername(String username) {
        driver.findElement(usernameLocator).sendKeys(username);
        return this;
    }

    public HomePage submitLogin() {
        driver.findElement(loginButtonLocator).submit();
        return new HomePage(driver);
    }


    public LoginPage typePassword(String password) {
        driver.findElement(passwordLocator).sendKeys(password);
        return this;
    }

    public LoginPage submitLoginExpectingFailure() {
        driver.findElement(loginButtonLocator).submit();
        return new LoginPage(driver);
    }

    public HomePage loginAs(String username, String password) {
        typeUsername(username);
        typePassword(password);
        return submitLogin();
    }

}
