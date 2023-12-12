package com.tutorialsninja.demo.testsuit;

import com.tutorialsninja.demo.pages.AccountSuccess;
import com.tutorialsninja.demo.pages.HomePage;
import com.tutorialsninja.demo.pages.MyAccountsPage;
import com.tutorialsninja.demo.pages.RegisterPage;
import com.tutorialsninja.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyAccountsTest extends TestBase {

    HomePage homePage;
    MyAccountsPage myAccountsPage;
    RegisterPage registerPage;
    AccountSuccess accountSuccess;


    @BeforeMethod(alwaysRun = true)
    public void inIt() {

        homePage = new HomePage();
        myAccountsPage = new MyAccountsPage();
        registerPage = new RegisterPage();
        accountSuccess = new AccountSuccess();
    }

//    public void selectMenu(String menu) {
//
//        List<WebElement> selectMyAccountOptions = homePage.showAllOptionsFromTopNav();
//        try {
//            for (WebElement e : selectMyAccountOptions) {
//                if (e.getText().equals(menu)) {
//                    e.click();
//                }
//            }
//        } catch (StaleElementReferenceException e) {
//            selectMyAccountOptions = homePage.showAllOptionsFromTopNav();
//        }


//    1.1 create method with name "selectMyAccountOptions" it has one parameter name "option" of type string

//    1.2 This method should click on the options whatever name is passed as parameter. (Hint: Handle List of Element and Select options)

        @Test(groups = {"sanity", "smoke", "regression"})
        public void verifyUserShouldNavigateToRegisterPageSuccessfully() {

//        1.1 Click on My Account Link.
            homePage.clickOnMyAccountLink();

//        1.2 Call the method “selectMyAccountOptions” method and pass the parameter “Register”

//        1.3 Verify the text “Register Account”.
            Assert.assertEquals(myAccountsPage.VerifyTheTextRegisterAccount(), "Register Account", "Register Account did not show");

        }

        @Test(groups = {"sanity", "smoke", "regression"})
        public void verifyUserShouldNavigateToLoginPageSuccessfully() {

//        2.1 Click on My Account Link.
            homePage.clickOnMyAccountLink();

//        2.2 Call the method “selectMyAccountOptions” method and pass the parameter “Login”
            registerPage.clickOnContinueButton();

//        2.3 Verify the text “Returning Customer”.
            Assert.assertEquals(myAccountsPage.VerifyTheTextReturningCustomer(), "Returning Customer", "Returning Customer does not show");
        }

        @Test(groups = {"smoke", "regression"})
        public void verifyThatUserRegisterAccountSuccessfully() {

//        3.1 Click on My Account Link.
            myAccountsPage.clickOnMyAccountButton();

//        3.2 Call the method “selectMyAccountOptions” method and pass the parameter “Register”

//        3.3 Enter First Name
            registerPage.enterFirstName("abc");

//        3.4 Enter Last Name
            registerPage.enterLastName("xyz");

//        3.5 Enter Email
            registerPage.enterEmail("abcd1234abcd@gmail.com");

//        3.6 Enter Telephone
            registerPage.enterTelephone("07123852630");

//        3.7 Enter Password
            registerPage.enterPassword("abcd_1234");

//        3.8 Enter Password Confirm
            registerPage.enterPassword("abcd_1234");

//        3.9 Select Subscribe Yes radio button
            registerPage.clickOnYesRadioButton();

//        3.10 Click on Privacy Policy check box
            registerPage.clickOnPrivacyPolicyCheckBox();

//        3.11 Click on Continue button
            registerPage.clickOnContinueButton();

//        3.12 Verify the message “Your Account Has Been Created!”
            Assert.assertEquals(accountSuccess.verifyTheTextYourAccountHasBeenCreated(), "Your Account Has Been Created!", "Your Account Has not Been Created!");

//        3.13 Click on Continue button
            accountSuccess.clickOnContinueButton();

//        3.14 Click on My Account Link.
            myAccountsPage.clickOnMyAccountButton();

//        3.15 Call the method “selectMyAccountOptions” method and pass the parameter “Logout”
            accountSuccess.clickOnLogoutButton();

//        3.16 Verify the text “Account Logout”
            accountSuccess.verifyTheTextAccountLogout();

//        3.17 Click on Continue button
            accountSuccess.clickOnContinueButton();
        }

        @Test(groups = {"smoke", "regression"})
        public void verifyThatUserShouldLoginAndLogoutSuccessfully() {

//        4.1 Click on My Account Link.
            myAccountsPage.clickOnMyAccountButton();

//        4.2 Call the method “selectMyAccountOptions” method and pass the parameter “Login”


//        4.3 Enter Email address
            registerPage.enterEmail("abc@gmail.com");

//        4.4 Enter Last Name
            registerPage.enterLastName("xyz");

//        4.5 Enter Password
            registerPage.enterPassword("abcd_1234");

//        4.6 Click on Login button
            accountSuccess.clickOnLogoutButton();

//        4.7 Verify text “My Account”
            accountSuccess.verifyTheTextAccountLogout();

//        4.8 Click on My Account Link.
            myAccountsPage.clickOnMyAccountButton();

//        4.9 Call the method “selectMyAccountOptions” method and pass the parameter “Logout”
            accountSuccess.verifyTheTextAccountLogout();

//        4.10 Verify the text “Account Logout”
            accountSuccess.verifyTheTextAccountLogout();

//        4.11 Click on Continue button
            accountSuccess.clickOnContinueButton();

        }

    }
