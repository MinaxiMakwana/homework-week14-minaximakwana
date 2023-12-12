package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Utility {


    @CacheLookup
    @FindBy(id = "input-firstname")
    WebElement enterFirstName;

    public void enterFirstName(String text){
        sendTextToElement(enterFirstName, text);
    }

    @CacheLookup
    @FindBy(id = "input-lastname")
    WebElement enterLastName;

    public void enterLastName(String text){
        sendTextToElement(enterLastName, text);
    }

    @CacheLookup
    @FindBy(id = "input-email")
    WebElement enterEmail;

    public void enterEmail(String text){
        sendTextToElement(enterEmail, text);
    }

    @CacheLookup
    @FindBy(id = "input-telephone")
    WebElement enterTelephone;

    public void enterTelephone(String text){
        sendTextToElement(enterTelephone, text);
    }

    @CacheLookup
    @FindBy(id = "input-password")
    WebElement enterPassword;

    public void enterPassword(String text){
        sendTextToElement(enterPassword, text);
    }

    //label[text()='Yes']
    @CacheLookup
    @FindBy(xpath = "//label[text()='Yes']")
    WebElement clickOnYesRadioButton;

    public void clickOnYesRadioButton(){
        clickOnElement(clickOnYesRadioButton);
    }

    //input[@name='agree']
    @CacheLookup
    @FindBy(xpath = "//input[@name='agree']")
    WebElement clickOnPrivacyPolicyCheckBox;

    public void clickOnPrivacyPolicyCheckBox(){
        clickOnElement(clickOnPrivacyPolicyCheckBox);
    }

    //input[@value='Continue']
    @CacheLookup
    @FindBy(xpath = "//input[@value='Continue']")
    WebElement clickOnContinueButton;

    public void clickOnContinueButton(){
        clickOnElement(clickOnContinueButton);
    }


}
