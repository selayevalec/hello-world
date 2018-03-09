package org.selyale.evernote;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.selyale.evernote.pageobjects.LoginPage;
import org.apache.log4j.Logger;
import org.selyale.evernote.util.Waiters;

import java.util.concurrent.TimeUnit;

public class EvernoteRunner {
    final static Logger logger = Logger.getLogger(EvernoteRunner.class);

    public static void waitALittle() {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException ie) {
            logger.info("Exception while the timout");
        }
    }

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\User\\IdeaProjects\\hello-world\\src\\main\\resources\\chrome\\chromedriver.exe"
        );

        logger.info("START");

        WebDriver driver = new ChromeDriver();
        Waiters.implicitlyWait(driver,3);
        Waiters.pageLoadTimeout(driver, 5);
        driver.manage().window().maximize();
        driver.get("https://www.evernote.com/Login.action");

        logger.info("Login page is created");

        new LoginPage(driver)
                .typeUsername("selyaev.alec@gmail.com")
                .clickSubmitIfPasswordNotShowed()
                .typePassword("13evernote32")
                .submitLogin();

        driver.close();
        driver.quit();

        logger.info("FINISH");
    }

}
