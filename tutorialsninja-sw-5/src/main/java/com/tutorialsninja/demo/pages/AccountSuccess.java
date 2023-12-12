package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AccountSuccess extends Utility {

    //h1[text()='Your Account Has Been Created!']
    @CacheLookup
    @FindBy(xpath = "//h1[text()='Your Account Has Been Created!']")
    WebElement verifyTheTextYourAccountHasBeenCreated;

    public String verifyTheTextYourAccountHasBeenCreated(){
        return getTextFromElement(verifyTheTextYourAccountHasBeenCreated);
    }

    //linktext - Continue
    @CacheLookup
    @FindBy(linkText = "Continue")
    WebElement clickOnContinueButton;

    public String clickOnContinueButton(){
        return getTextFromElement(clickOnContinueButton);
    }

    //a[text()='Logout']
    @CacheLookup
    @FindBy(xpath = "//a[text()='Logout']")
    WebElement clickOnLogoutButton;

    public String clickOnLogoutButton(){
        return getTextFromElement(clickOnLogoutButton);
    }


    @CacheLookup
    @FindBy(xpath = "//h1[text()='Account Logout']")
    WebElement verifyTheTextAccountLogout;

    public String verifyTheTextAccountLogout(){
        return getTextFromElement(verifyTheTextAccountLogout);
    }

    //h1[text()='Account Logout']

}
