package org.selyale.evernote;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.selyale.evernote.pageobjects.LoginPage;
import org.apache.log4j.Logger;
import org.selyale.evernote.util.WebDriverSingleton;

public class EvernoteRunner {
    private final static Logger logger = Logger.getLogger(EvernoteRunner.class);

    public static void setProperties() {
        System.setProperty("org.selyale.resources.root",
                "C:\\Users\\User\\IdeaProjects\\hello-world\\resources");

        System.setProperty("webdriver.chrome.driver",
                System.getProperty("org.selyale.resources.root") + "\\chrome\\chromedriver.exe");

        PropertyConfigurator.configure(System.getProperty("org.selyale.resources.root") + "\\log4j.properties");
    }

    public static void main(String[] args) {
        setProperties();
        logger.info("START");

        final WebDriver driver;

        try {
            driver = WebDriverSingleton.getChromeWebDriver();
            driver.manage().window().maximize();
            driver.get("https://www.evernote.com/Login.action");

            logger.info("Login page is created");

            new LoginPage(driver)
                    .login("selyaev.alec@gmail.com", "13evernote32");

            driver.close();
            driver.quit();
        } catch (Exception e) {
            logger.fatal(e.getStackTrace());
        } finally {
            }

        logger.info("FINISH");
        }
    }

