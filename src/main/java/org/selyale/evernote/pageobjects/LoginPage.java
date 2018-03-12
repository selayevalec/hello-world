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

    @FindBy(how = How.ID, using="username") WebElement usernameLocator;
    //private final By usernameLocator = By.id("username");

    private final By passwordLocator = By.id("password");

    private final By loginButtonLocator = By.id("loginButton");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public LoginPage typeUsername(String username) {
        //driver.findElement(usernameLocator).sendKeys(username);
        logger.info("username:" + getUsernameLocator().toString());
        usernameLocator.sendKeys(username);
        logger.info("username:" + username);
        return this;
    }

    public HomePage submitLogin() {
        driver.findElement(loginButtonLocator).submit();
        logger.info("Login is submitted");
        return new HomePage(driver);
    }

    public LoginPage clickSubmitIfPasswordNotShowed() {
        if (!driver.findElement(passwordLocator).isDisplayed()) {
            driver.findElement(loginButtonLocator).submit();
            Waiters.waitUntilDisplayedBy(driver,passwordLocator,3);
            logger.info("Password should be shown now");
        } else {
            logger.info("Password was shown already");
        }

        return new LoginPage(driver);
    }

    public LoginPage typePassword(String password) {
        logger.info("Password is shown:"+driver.findElement(passwordLocator).isDisplayed());
        driver.findElement(passwordLocator).sendKeys(password);
        logger.info("password:xxxxx");
        return this;
    }

    public HomePage login(String username, String password){
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
