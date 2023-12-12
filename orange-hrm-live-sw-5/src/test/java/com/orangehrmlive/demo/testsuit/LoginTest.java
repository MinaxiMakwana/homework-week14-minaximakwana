package com.orangehrmlive.demo.testsuit;

import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    LoginPage loginPage;
    HomePage homePage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        loginPage = new LoginPage();
        homePage = new HomePage();
    }

    @Test(groups = {"sanity", "smoke", "regression"})
    public void verifyUserShouldLoginSuccessFully(){

//        Enter username
            loginPage.enterUsernameName("Admin");

//        Enter password
            loginPage.enterPassword("admin123");

//        Click on Login Button
            loginPage.clickOnLoginButton();

//        Verify "WelCome" Message
            String welcomeMessage = homePage.welcomeMessage();
            Assert.assertEquals("Dashboard", "User did not get correct text Dashboard");
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyThatTheLogoDisplayOnHomePage(){

//        Login To The application
            loginPage.enterUsernameName("Admin");
            loginPage.enterPassword("admin123");

//        Verify Logo is Displayed
            Assert.assertEquals("Logo Displayed", "Can not see logo on home page");
    }

    @Test(groups = {"regression"})
    public void verifyUserShouldLogOutSuccessFully(){

//        Login To The application
            loginPage.enterUsernameName("Admin");
            loginPage.enterPassword("admin123");

//        Click on User Profile logo
            homePage.homePageLogo();

//        Mouse hover on "Logout" and click
            homePage.mouseHoverOnLogoutAndClick();

//        Verify the text "Login Panel" is displayed
            Assert.assertEquals("Login", "Login text is not displayed");

    }

    @Test(groups = {"regression"})
    public void  verifyErrorMessageWithInvalidCredentials(){

//        Enter username <username>
            loginPage.enterUsernameName("Admin_1");

//        Enter password <password>
            loginPage.enterPassword("admin12345");

//        Click on Login Button
            loginPage.clickOnLoginButton();

//        Verify Error message <errorMessage>
            Assert.assertEquals("Invalid credentials", "Incorrect text displayed");

    }
}
