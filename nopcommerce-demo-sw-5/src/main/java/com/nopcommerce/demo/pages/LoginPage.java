package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * 1.LoginPage - Email, password, Login Button and "Welcome, Please Sign In!" text Locators and
 * create appropriate methods for it.
 */

public class LoginPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[text()='Welcome, Please Sign In!']")
    WebElement WelcomeMessage;

    public String getWelcomeMsgText(){
        return getTextFromElement(WelcomeMessage);
    }

    @CacheLookup
    @FindBy(id = "Email")
    WebElement enterEmail;

    public void enterEmail(String text){
       sendTextToElement(enterEmail, text);
    }

    @CacheLookup
    @FindBy(id = "Password")
    WebElement enterPassword;

    public void enterPassword(String text){
        sendTextToElement(enterPassword, text);
    }

    @CacheLookup
    @FindBy(className = "button-1 login-button")
    WebElement clickOnLoginButton;

    public void clickOnLoginButton(){
        clickOnElement(clickOnLoginButton);
    }

    @CacheLookup
    @FindBy(className = "message-error validation-summary-errors")
    WebElement LoginWasUnsuccessful;

    public String getLoginWasUnsuccessful(){
        return getTextFromElement(LoginWasUnsuccessful);
    }

    @CacheLookup
    @FindBy(className = "ico-logout")
    WebElement LogOutLink;

    public String getLogOutLink(){
        return getTextFromElement(LogOutLink);
    }

    @CacheLookup
    @FindBy(className = "ico-logout")
    WebElement logout;

    public void clickOnLogOutLink (){
        clickOnElement(logout);
    }

    @CacheLookup
    @FindBy(className = "ico-login")
    WebElement LogInLink;

    public String getLogInLink(){
        return getTextFromElement(LogInLink);
    }

}
