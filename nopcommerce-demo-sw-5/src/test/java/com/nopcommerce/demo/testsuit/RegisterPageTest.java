package com.nopcommerce.demo.testsuit;

import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Random;

public class RegisterPageTest extends TestBase {

    RegisterPage registerPage;


    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        registerPage = new RegisterPage();

    }


    @Test(groups = {"smoke", "regression"})
    public void verifyUserShouldNavigateToRegisterPageSuccessfully(){

//        Click on Register Link
        registerPage.clickOnRegisterLink();

//        Verify "Register" text
        Assert.assertEquals(registerPage.verifyRegisterText(), "Register", "User is unable to see correct text");

    }

    @Test(groups = {"smoke", "regression"})
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory(){

//        Click on Register Link
        registerPage.clickOnRegisterLink();

//        Click on "REGISTER" button
        registerPage.clickOnRegisterButton();

//        Verify the error message "First name is required."
        Assert.assertEquals(registerPage.verifyFirstName(), "First name is required.", "Incorrect message");

//        Verify the error message "Last name is required."
        Assert.assertEquals(registerPage.verifyLastName(),"Last name is required.", "Incorrect message");

//        Verify the error message "Email is required."
        Assert.assertEquals(registerPage.verifyEmail(),"Email is required.", "Incorrect message");

//        Verify the error message "Password is required."
        Assert.assertEquals(registerPage.verifyPassword(), "Password is required.", "Incorrect message");

//        Verify the error message "Password is required."
        Assert.assertEquals(registerPage.verifyPassword(), "Password is required." , "Incorrect message");

    }

    @Test(groups = {"regression"})
    public void verifyThatUserShouldCreateAccountSuccessfully(){

//        Click on Register Link
        registerPage.clickOnRegisterLink();

//        Select gender "Female"
        registerPage.clickOnGenderFemaleButton();

//        Enter firstname
        registerPage.enterFirstName("abc");

//        Enter lastname
        registerPage.enterLastName("xyz");

//        Select day
        registerPage.selectDay();

//        Select month
        registerPage.selectMonth();

//        Select year
        registerPage.selectYear();

//      Generate a random email
        Random random = new Random();
        int ranNumber = random.nextInt(1000);
        String ranString = String.format("%03d", ranNumber);
        String randomEmail = ranString + "abc@gmail.com";

//        Enter email
        registerPage.enterEmail("abc@gmail.com");

//        Enter password
        registerPage.enterPassword("abc_123");

//        Enter Confirm Password
        registerPage.enterPassword("abc_123");

//        Click on "REGISTER" button
        registerPage.clickOnRegisterButton();

//        Verify message "Your registration completed"
        Assert.assertEquals(registerPage.verifyMessageYourRegistrationCompleted(), "Your Registration Completed", "Your Registration did not Complete");

    }

}
