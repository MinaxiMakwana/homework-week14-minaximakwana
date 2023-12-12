package com.tutorialsninja.demo.pages;

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
}


//    public void mouseHoverToElementAndClick(WebElement element) {
//        Actions actions;
//        actions = new Actions(driver);
//        actions.moveToElement(element).click().build().perform();
//    }