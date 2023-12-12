package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * 1.LoginPage - Store username, password, Login Button and LOGIN Panel text Locators
 *  and create appropriate methods for it.
 */

public class LoginPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//input[@name='username']")
    WebElement enterUsernameName;

    public void enterUsernameName(String text){
        sendTextToElement(enterUsernameName, text);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@name='username']")
    WebElement enterPassword;

    public void enterPassword(String text){
        sendTextToElement(enterPassword, text);
    }

    @CacheLookup
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
    WebElement clickOnLoginButton;

    public void clickOnLoginButton(){
        clickOnElement(clickOnLoginButton);
    }

    @CacheLookup
    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
    WebElement homePageInvalidCredentials
    ;

    public void homePageInvalidCredentials(){
        clickOnElement(homePageInvalidCredentials);
    }

}
