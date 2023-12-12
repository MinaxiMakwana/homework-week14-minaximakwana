package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class HomePage extends Utility {

    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement desktops;

    public void mouseHoverAndClickOnDesktops(){
        mouseHoverToElementAndClick(desktops);
    }

    @CacheLookup
    @FindBy(linkText = "Show AllDesktops")
    WebElement showAllDesktops;

    public void clickOnShowAllDesktops(){
        clickOnElement(showAllDesktops);
    }

    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement sortByZtoA;

    public List<WebElement> sotByZtoA(){
        clickOnElement(sortByZtoA);
        return null;
    }

    public List<WebElement> sotByZtoA(String s) {
        return null;
    }

    @CacheLookup
    @FindAll({@FindBy(xpath = "//a[@class='see-all']")})
    List<WebElement> showAllOptions;

    public List<WebElement> showAllOptionsFromTopNav() {
        return showAllOptions;
    }

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Desktops']")
    WebElement mouseHoverOnDesktopsTabAndClick;

    public void mouseHoverOnDesktopsTabAndClick(){
        mouseHoverToElementAndClick(mouseHoverOnDesktopsTabAndClick);
    }

    @CacheLookup
    @FindBy(linkText = "Show AllDesktops")
    WebElement showAllDeskTops;

    public void showAllDeskTops(){
        mouseHoverToElementAndClick(showAllDeskTops);
    }

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Desktops']")
    WebElement desktopsText;

    public String desktopsText(){
        return getTextFromElement(desktopsText);
    }

    @CacheLookup
    @FindBy(className = "dropdown-toggle")
    WebElement mouseHoverOnLaptopsAndNotebooksTabAndClick;

    public void mouseHoverOnLaptopsAndNotebooksTabAndClick(){
        mouseHoverToElementAndClick(mouseHoverOnLaptopsAndNotebooksTabAndClick);
    }

    @CacheLookup
    @FindBy(linkText = "Laptops & Notebooks")
    WebElement showAllLaptopsAndNotebooks;

    public void showAllLaptopsAndNotebooks(){
        mouseHoverToElementAndClick(showAllLaptopsAndNotebooks);
    }


    @CacheLookup
    @FindBy(xpath = "//a[text()='Show AllLaptops & Notebooks']")
    WebElement laptopsAndNotebooksText;

    public String laptopsAndNotebooksText(){
        return getTextFromElement(laptopsAndNotebooksText);
    }

    @CacheLookup
    @FindBy(xpath = "(//a[@class='dropdown-toggle'])[4]")
    WebElement MouseHoverOnComponentsTabAndClick;

    public void MouseHoverOnComponentsTabAndClick(){
        mouseHoverToElementAndClick(MouseHoverOnComponentsTabAndClick);
    }

    @CacheLookup
    @FindBy(xpath = "//a[text()='Show AllComponents']")
    WebElement showAllComponents;

    public void showAllComponents(){
        mouseHoverToElementAndClick(showAllComponents);
    }

    @CacheLookup
    @FindBy(xpath = "//h2[text()='Components']")
    WebElement verifyTheTextComponents;

    public String verifyTheTextComponents(){
        return getTextFromElement(verifyTheTextComponents);
    }


    @CacheLookup
    @FindBy(xpath = "//i [@class = 'fa fa-caret-down']")
    WebElement mouseHoverOnCurrencyDropdownAndClick;

    public void mouseHoverOnCurrencyDropdownAndClick(){
        mouseHoverToElementAndClick(mouseHoverOnCurrencyDropdownAndClick);
    }

    @CacheLookup
    @FindBy(xpath = "(//button[@class='currency-select btn btn-link btn-block'])[2]")
    WebElement clickOnSterlingPound;

    public void clickOnSterlingPoundDropDown(){
        mouseHoverToElementAndClick(clickOnSterlingPound);
    }

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Desktops']")
    WebElement mouseHoverOnDesktopsTab;

    public void mouseHoverOnDesktopsTab(){
        mouseHoverToElementAndClick(mouseHoverOnDesktopsTab);
    }

    @CacheLookup
    @FindBy(xpath = "//span[text()='My Account']")
    WebElement myAccountLink;

    public void clickOnMyAccountLink(){
        clickOnElement(myAccountLink);
    }
}
