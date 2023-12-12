package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * 6.RegisterPage - Register Text, male female radio, Firstname, lastname, Date of Birth drop
 * down, email, Password, Confirm Password, Register Button, "First name is required.","Last name
 * is required.", "Email is required.","Password is required.", "Password is required." error message,
 * "Your registration completed" message, "CONTINUE" button
 * Locators and it's actions
 */

public class RegisterPage extends Utility {

    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement clickOnRegisterLink;

    public void clickOnRegisterLink(){
        clickOnElement(clickOnRegisterLink);
    }


    @CacheLookup
    @FindBy(xpath = "//h1[text()='Register']")
    WebElement Register;

    public String verifyRegisterText(){
        return getTextFromElement(Register);
    }

    @CacheLookup
    @FindBy(id = "register-button")
    WebElement clickOnRegisterButton;

    public void clickOnRegisterButton(){
        clickOnElement(clickOnRegisterButton);
    }

    @CacheLookup
    @FindBy(id = "FirstName-error")
    WebElement verifyFirstName;

    public String verifyFirstName(){
        return getTextFromElement(verifyFirstName);
    }

    //LastName-error
    @CacheLookup
    @FindBy(id = "LastName-error")
    WebElement verifyLastName;

    public String verifyLastName(){
        return getTextFromElement(verifyLastName);
    }

    @CacheLookup
    @FindBy(id = "Email-error")
    WebElement verifyEmail;

    public String verifyEmail(){
        return getTextFromElement(verifyEmail);
    }

    //Password-error
    @CacheLookup
    @FindBy(id = "Password-error")
    WebElement verifyPassword;

    public String verifyPassword(){
        return getTextFromElement(verifyPassword);
    }

    @CacheLookup
    @FindBy(id = "gender-female")
    WebElement clickOnGenderFemaleButton;

    public void clickOnGenderFemaleButton(){
        clickOnElement(clickOnGenderFemaleButton);
    }

    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement enterFirstName;

    public void enterFirstName(String text){
        sendTextToElement(enterFirstName, text);
    }

    @CacheLookup
    @FindBy(id = "LastName")
    WebElement enterLastName;

    public void enterLastName(String text){
        sendTextToElement(enterLastName, text);
    }

    //email
    @CacheLookup
    @FindBy(id = "Email")
    WebElement enterEmail;

    public void enterEmail(String text){
        sendTextToElement(enterEmail, text);
    }

    //Password
    @CacheLookup
    @FindBy(id = "Password")
    WebElement enterPassword;

    public void enterPassword(String text){
        sendTextToElement(enterPassword, text);
    }

    //select day
    @CacheLookup
    @FindBy(name = "DateOfBirthDay")
    WebElement selectDay;

    public void selectDayFromDropDown(String text) {
        selectByVisibleTextFromDropDown(selectDay, text);
    }
    public void selectDay() {
    }

    //select month
    @CacheLookup
    @FindBy(name = "DateOfBirthMonth")
    WebElement selectMonth;

    public void selectMonthFromDropDown(String text) {
        selectByVisibleTextFromDropDown(selectMonth, text);
    }
    public void selectMonth() {
    }

    //select year
    @CacheLookup
    @FindBy(name = "DateOfBirthYear")
    WebElement selectYear;

    public void selectYearFromDropDown(String text) {
        selectByVisibleTextFromDropDown(selectYear, text);
    }
    public void selectYear() {
    }

    //result
    @CacheLookup
    @FindBy(className = "result")
    WebElement verifyMessageYourRegistrationCompleted;

    public String verifyMessageYourRegistrationCompleted(){
        return getTextFromElement(verifyMessageYourRegistrationCompleted);
    }

}
