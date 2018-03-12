package org.selyale.evernote.pageobjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.selyale.evernote.util.Waiters;

public class LoginPage {
    private final Logger logger = Logger.getLogger(LoginPage.class);
    private final WebDriver driver;

    @FindBy(how = How.ID, using = "username")
    private WebElement usernameLocator;
    //private final By usernameLocator = By.id("username");

    @FindBy(how = How.ID, using = "password")
    private WebElement passwordLocator;
    //private final By passwordLocator = By.id("password");

    @FindBy(how = How.ID, using = "loginButton")
    private WebElement loginButtonLocator;
    //private final By loginButtonLocator = By.id("loginButton");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public LoginPage typeUsername(String username) {
        //driver.findElement(usernameLocator).sendKeys(username);
        usernameLocator.sendKeys(username);
        logger.info("username:" + username);
        return this;
    }

    public HomePage submitLogin() {
        loginButtonLocator.submit();
        logger.info("Login is submitted");
        return new HomePage(driver);
    }

    public LoginPage clickSubmitIfPasswordNotShowed() {
        if (!passwordLocator.isDisplayed()) {
            passwordLocator.submit();
            Waiters.waitUntilPresenceOfWebElement(driver, passwordLocator, 3);
            logger.info("Password should be shown now");
        } else {
            logger.info("Password was shown already");
        }

        return new LoginPage(driver);
    }

    public LoginPage typePassword(String password) {
        logger.info("Password is shown:" + passwordLocator.isDisplayed());
        passwordLocator.sendKeys(password);
        logger.info("password:xxxxx");
        return this;
    }

    public HomePage login(String username, String password) {
        new LoginPage(driver)
                .typeUsername(username)
                .clickSubmitIfPasswordNotShowed()
                .typePassword(password)
                .submitLogin();

        return new HomePage(driver);
    }

    public WebElement getUsernameLocator() {
        return usernameLocator;
    }
}
