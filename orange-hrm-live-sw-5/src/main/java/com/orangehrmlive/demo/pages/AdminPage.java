package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * 4.AdminPage - UserManagement, Job, Organization Tabs Locators and it's actions
 */

public class AdminPage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//h5[text()='System Users']")
    WebElement VerifySystemUsersText;

    public String VerifySystemUsersText() {
        getTextFromElement(VerifySystemUsersText);
        return null;
    }

    @CacheLookup
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
    WebElement clickOnAddButton;

    public void clickOnAddButton(){
        clickOnElement(clickOnAddButton);
    }


}
