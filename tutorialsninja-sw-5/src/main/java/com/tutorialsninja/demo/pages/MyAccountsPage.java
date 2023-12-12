package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MyAccountsPage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//h1[text()='Register Account']")
    WebElement VerifyTheTextRegisterAccount;

    public String VerifyTheTextRegisterAccount(){
        return getTextFromElement(VerifyTheTextRegisterAccount);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[text()='Register Account']")
    WebElement VerifyTheTextReturningCustomer;

    public String VerifyTheTextReturningCustomer(){
        return getTextFromElement(VerifyTheTextRegisterAccount);
    }


    @CacheLookup
    @FindBy(className = "hidden-xs hidden-sm hidden-md")
    WebElement clickOnMyAccountButton;

    public void clickOnMyAccountButton(){
        clickOnElement(clickOnMyAccountButton);
    }





}
