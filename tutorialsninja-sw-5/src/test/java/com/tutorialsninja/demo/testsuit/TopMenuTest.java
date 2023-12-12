package com.tutorialsninja.demo.testsuit;

import com.tutorialsninja.demo.pages.HomePage;
import com.tutorialsninja.demo.testbase.TestBase;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TopMenuTest extends TestBase {

    HomePage homepage;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        homepage = new HomePage();
    }

//    1.1 create method with name "selectMenu" it has one parameter name "menu" of type strin
//    1.2 This method should click on the menu whatever name is passed as parameter. Write the following Test:
    public void selectMenu(String menu){

        List<WebElement> showAll = homepage.showAllOptionsFromTopNav();
        try {
            for (WebElement e : showAll) {
                if (e.getText().equals(menu)) {
                    e.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            showAll = homepage.showAllOptionsFromTopNav();
        }
}



    @Test(groups = {"sanity", "smoke", "regression"})
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){

//        1.1 Mouse hover on “Desktops” Tab and click
            homepage.mouseHoverOnDesktopsTabAndClick();

//        1.2 call selectMenu method and pass the menu = “Show All Desktops”
            selectMenu("showAllDeskTops");

//        1.3 Verify the text ‘Desktops’
          Assert.assertEquals(homepage.desktopsText(),"Desktops", "Incorrect text" );

    }

    @Test(groups = {"sanity", "smoke", "regression"})
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully(){

//        2.1 Mouse hover on “Laptops & Notebooks” Tab and click
            homepage.mouseHoverOnLaptopsAndNotebooksTabAndClick();

//        2.2 call selectMenu method and pass the menu = “Show All Laptops & Notebooks”
            selectMenu("showAllLaptopsAndNotebooks");

//        2.3 Verify the text ‘Laptops & Notebooks’
            Assert.assertEquals(homepage.laptopsAndNotebooksText(), "Laptops & Notebooks", "This is incorrect text");
    }

    @Test(groups = {"regression"})
    public void verifyUserShouldNavigateToComponentsPageSuccessfully(){

//        3.1 Mouse hover on “Components” Tab and click
            homepage.MouseHoverOnComponentsTabAndClick();

//        3.2 call selectMenu method and pass the menu = “Show All Components”
            selectMenu("showAllComponents");

//        3.3 Verify the text ‘Components’
            Assert.assertEquals(homepage.verifyTheTextComponents(),"Components", "This is not correct text");
    }
}
