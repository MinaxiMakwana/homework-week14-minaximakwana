package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * 3.ComputerPage - Computers text, DesktopsLink, NotebooksLink, SoftwareLink Locators and
 * create appropriate methods for it.
 */

public class ComputerPage extends Utility {

    @CacheLookup
    @FindBy(linkText = "Computers")
    WebElement clickOnComputerTab;

    public void clickOnComputerTab(){
        clickOnElement(clickOnComputerTab);
    }


    @CacheLookup
    @FindBy(xpath = "//h1[text()='Computers']")
    WebElement Computers;

    public String verifyComputersText(){
        return getTextFromElement(Computers);
    }

    //Desktops linktext
    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement clickOnDesktops;

    public void clickOnDesktops(){
        clickOnElement(clickOnDesktops);
    }

    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement Desktops;

    public String verifyDesktops(){
        return getTextFromElement(Desktops);
    }

}
