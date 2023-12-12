package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * 2. HomePage - Store OrangeHRM logo, Admin, PIM, Leave,Dashboard, Welcome Text locatores
 *  and create appropriate methods for it.
 */
public class HomePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//span/h6[text()='Dashboard']")
    WebElement welcomeMessage;

    public String welcomeMessage() {
        getTextFromElement(welcomeMessage);
        return null;
    }

    @CacheLookup
    @FindBy(xpath = "//img[@alt='OrangeHRM Logo']")
    WebElement homePageOrangeHRMLogo;

    public void homePageLogo(){
    clickOnElement(homePageOrangeHRMLogo);
    }

    @CacheLookup
    @FindBy(xpath = "//a[text()='Logout']")
    WebElement mouseHoverOnLogoutAndClick;

    public void mouseHoverOnLogoutAndClick(){
        mouseHoverToElementAndClick(mouseHoverOnLogoutAndClick);
    }

    @CacheLookup
    @FindBy(xpath = "//h5[text()='Login']")
    WebElement verifyLoginText;

    public String verifyLoginText(WebElement Login) {
        getTextFromElement(Login);
        return null;
    }

    //span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']
    @CacheLookup
    @FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']")
    WebElement clickOnAdminLink;

    public void clickOnAdminLink(){
        clickOnElement(clickOnAdminLink);
    }



    }


