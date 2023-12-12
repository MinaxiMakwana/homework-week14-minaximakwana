package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * 6.AddUserPage - User Role Drop Down, Employee Name, Username, Status Drop Down,
 * Password, Confirm Password,
 *  Save and Cancle Button Locators and it's actions
 */

public class AddUserPage extends Utility {


    //h6[text()='Add User']
    @CacheLookup
    @FindBy(xpath = "//h6[text()='Add User']")
    WebElement VerifyAddUserText;

    public String VerifyAddUserText() {
        getTextFromElement(VerifyAddUserText);
        return null;
    }

    //div[contains(text(),'Admin')]
    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Admin')]")
    WebElement clickUserRoleOnAdminLink;

    public void clickUserRoleOnAdminLink(){
        clickOnElement(clickUserRoleOnAdminLink);
    }


    public void clickOnSaveButton() {
    }

    public byte[] getSuccessToasterMessageText() {
        byte[] bytes = new byte[0];
        return bytes;
    }
}
