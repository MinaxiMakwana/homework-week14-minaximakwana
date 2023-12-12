package com.nopcommerce.demo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * 5.BuildYourOwnComputerPage - Build your own computer Text, Processor Drop Down, Ram
 * drop down, HDD radios, os radio, software check boxes, Add To Card button, "The product has
 * been added to your shopping cart" message locators and it's actions
 */


public class BuildYourOwnComputerPage {


    //Build your own computer
    @CacheLookup
    @FindBy(linkText = "Build your own computer")
    WebElement clickOnBuildYourOwnComputer;

    public void clickOnBuildYourOwnComputer(){
        clickOnElement(clickOnBuildYourOwnComputer);
    }

    private void clickOnElement(WebElement clickOnBuildYourOwnComputer) {
    }

    //processor
    @CacheLookup
    @FindBy(id = "product_attribute_1")
    WebElement processor;

    public void selectprocessorFromDropDown(String text) {
        selectByVisibleTextFromDropDown(processor, text);
    }

    private void selectByVisibleTextFromDropDown(WebElement processor, String text) {
    }

    public void selectprocessorFromDropDown() {
    }

    //product_attribute_2 - Select RAM "ram"
    @CacheLookup
    @FindBy(id = "product_attribute_2")
    WebElement ram;

    public void selectRamFromDropDown(String text) {
        selectByVisibleTextFromDropDown(ram, text);
    }
    public void selectRamFromDropDown() {
    }

    //Select HDD "hdd" - product_attribute_3_6
    @CacheLookup
    @FindBy(id = "product_attribute_3_6")
    WebElement hdd;

    public void selectHddFromDropDown(String text) {
        selectByVisibleTextFromDropDown(hdd, text);
    }
    public void selectHddFromDropDown() {
    }

    //Select OS "os" - product_attribute_4_9
    @CacheLookup
    @FindBy(id = "product_attribute_4_9")
    WebElement os;

    public void selectOsFromDropDown(String text) {
        selectByVisibleTextFromDropDown(os, text);
    }
    public void selectOsFromDropDown() {
    }

    //product_attribute_5_10 - Software
    @CacheLookup
    @FindBy(id = "product_attribute_5_10")
    WebElement software;

    public void selectSoftwareFromDropDown(String text) {
        selectByVisibleTextFromDropDown(software, text);
    }
    public void selectSoftwareFromDropDown() {
    }

    //add-to-cart-button-1
    @CacheLookup
    @FindBy(id = "add-to-cart-button-1")
    WebElement clickOnAddToCartButton;

    public void clickOnAddToCartButton(){
        clickOnElement(clickOnAddToCartButton);
    }

    //Verify message "The product has been added to your shopping cart"
    @CacheLookup
    @FindBy(className = "content")
    WebElement productAddedToCart;

    public String verifyProductAddedToCart(){
        return getTextFromElement(productAddedToCart);
    }

    private String getTextFromElement(WebElement productAddedToCart) {

        return null;
    }

    @CacheLookup
    @FindAll({@FindBy( xpath = "(//ul[@class='option-list'])[3]/li")})
    List<WebElement> softwareCheckBoxOptions;

    public void selectSoftwareCheckBox(String software){
        for(WebElement option:softwareCheckBoxOptions){
            if(option.getText().equals(software)){
                option.click();
                 break;
            }
        }
    }

}
