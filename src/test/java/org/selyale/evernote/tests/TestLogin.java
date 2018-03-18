package org.selyale.evernote.tests;


import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.selyale.evernote.pageobjects.login.LoginPage;
import org.selyale.evernote.util.WebDriverSingleton;


// Samples for selenium+junit-parameterized
// Used: https://www.petrikainulainen.net/programming/testing/junit-5-tutorial-writing-parameterized-tests/
@DisplayName("Pass the method parameters provided by the @ValueSource annotation")
public class TestLogin {
    private final Logger logger = Logger.getLogger(LoginPage.class);

    private String username;
    private String password;
    private String loginButton;

    @BeforeClass
    public void Init(){
        LoginPage login = new LoginPage(WebDriverSingleton.getChromeWebDriver());
    }

    @Test
    public void TestLoginSuccess(){
    }

    @Test
    public void TestLoginFailure(){
    }

    @AfterClass
    public static void Finish(){

    }
}
