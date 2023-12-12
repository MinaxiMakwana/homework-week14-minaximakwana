package com.nopcommerce.demo.testsuit;


import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

    HomePage homePage;
    LoginPage loginPage;


    @BeforeMethod(alwaysRun = true)
    public void inIt(){
       homePage = new HomePage();
       loginPage = new LoginPage();
    }



    @Test(groups = {"sanity", "smoke", "regression"})
    public void userShouldNavigateToLoginPageSuccessFully(){

//        Click on login link
        homePage.clickOnLoginLink();

//        verify that "Welcome, Please Sign In!" message display
        Assert.assertEquals(loginPage.getWelcomeMsgText(),"Welcome, Please Sign In!", "User has not navigated to the correct page");

    }

    @Test(groups = {"sanity", "smoke", "regression"})
    public void verifyTheErrorMessageWithInValidCredentials(){

//        Click on login link
        homePage.clickOnLoginLink();

//        Enter EmailId
        loginPage.enterEmail("abc@gmail.com");

//        Enter Password
        loginPage.enterPassword("abc_1234");

//        Click on Login Button
        loginPage.clickOnLoginButton();

//        Verify that the Error message
        Assert.assertEquals(loginPage.getLoginWasUnsuccessful(), "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found", "User could not see the correct message");

    }

    @Test(groups = {"smoke", "regression"})
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials(){

//        Click on login link
        homePage.clickOnLoginLink();

//        Enter EmailId
        loginPage.enterEmail("Test123@gmail.com");

//        Enter Password
        loginPage.enterPassword("abc_1234");

//        Click on Login Button
        loginPage.clickOnLoginButton();

//        Verify that LogOut link is display
        loginPage.getLogOutLink();

    }

    @Test(groups = {"regression"})
    public void verifyThatUserShouldLogOutSuccessFully(){

//        Click on login link
        homePage.clickOnLoginLink();

//        Enter EmailId
        loginPage.enterEmail("Testng@gmail.com");

//        Enter Password
        loginPage.enterPassword("TestNG");

//        Click on Login Button
        loginPage.clickOnLoginButton();

//        Click on LogOut Link
        loginPage.clickOnLogOutLink();

//        Verify that LogIn Link Display
        loginPage.getLogInLink();

    }
}
