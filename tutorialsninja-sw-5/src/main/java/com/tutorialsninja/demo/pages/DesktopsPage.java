package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DesktopsPage extends Utility {

    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement selectNameAToZ;

    public void selectSortByPositionNameAToZ(String text){

        selectByVisibleTextFromDropDown(selectNameAToZ,text);
    }

    public void selectSortByPositionNameAToZ() {
    }




}
