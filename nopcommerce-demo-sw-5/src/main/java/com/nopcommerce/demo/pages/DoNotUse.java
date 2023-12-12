package com.nopcommerce.demo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DoNotUse {

    //this is only for try

    //By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;

    // By emailField = By.id("Email");
    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    //h2[text()='Welcome to our store']

//    By loginLink = By.linkText("Log in");
//    By registerLink = By.linkText("Register");
//
//    public void clickOnLoginLink(){
//        clickOnElement(loginLink);
//    }
//
//    public void clickOnRegisterLink(){
//        clickOnElement(registerLink);
//    }
}
