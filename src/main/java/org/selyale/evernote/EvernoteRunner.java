package org.selyale.evernote;

import org.openqa.selenium.WebDriver;
import org.selyale.evernote.pageobjects.LoginPage;
import org.apache.log4j.Logger;
import org.selyale.evernote.util.SetProperties;
import org.selyale.evernote.util.WebDriverSingleton;

public class EvernoteRunner {
    private final static Logger logger = Logger.getLogger(EvernoteRunner.class);

    public static void main(String[] args) throws Exception {
        SetProperties.setProperties();
        logger.info("START");

        WebDriver driver = null;

        try {

            driver = WebDriverSingleton.getChromeWebDriver();
            driver.get("https://www.evernote.com/Login.action");

            logger.info("Login page is created");

            new LoginPage(driver)
                    .login("a.autotest@yandex.ru", "13a.autotest");

        } catch (Exception e) {
            logger.fatal(e.getStackTrace());
            logger.fatal(e.getMessage());
            throw e;
        } finally {
            if(driver != null) {
                driver.close();
                driver.quit();
            }
        }
        logger.info("FINISH");
    }


}

