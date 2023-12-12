package com.tutorialsninja.demo.testsuit;

import com.tutorialsninja.demo.pages.DesktopsPage;
import com.tutorialsninja.demo.pages.HomePage;
import com.tutorialsninja.demo.testbase.TestBase;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopsTest extends TestBase {

    HomePage homePage;
    DesktopsPage desktopsPage;


    @BeforeMethod(alwaysRun = true)
    public void inIt(){

        homePage = new HomePage();
        desktopsPage = new DesktopsPage();
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyProductArrangeInAlphaBaticalOrder(){

//        1.1 Mouse hover on Desktops Tab. and click
            homePage.mouseHoverAndClickOnDesktops();

//        1.2 Click on “Show All Desktops”
            homePage.clickOnShowAllDesktops();

//        1.3 Select Sort By position "Name: Z to A"

        List<WebElement> beforeSorting = homePage.sotByZtoA();
        ArrayList<String> beforeFilter = new ArrayList<>();
        for ( WebElement i : beforeSorting){
            beforeFilter.add(i.getText());
        }
        Collections.sort(beforeFilter);
        Collections.reverse(beforeFilter);

        homePage.sotByZtoA("Name: Z to A");

        //after sorting
        List<WebElement> afterSorting = homePage.sotByZtoA();
        ArrayList<String> afterFilter = new ArrayList<>();
        for ( WebElement i : afterSorting){
            afterFilter.add(i.getText());
        }

//        1.4 Verify the Product will arrange in Descending order.
        Assert.assertEquals(beforeFilter, afterFilter);

    }

    @Test(groups = {"regression"})
    public void verifyProductAddedToShoppingCartSuccessFully(String product, String qty,String successMessage, String productName, String model, String total){

//        2.1 Mouse hover on Currency Dropdown and click
            homePage.mouseHoverOnCurrencyDropdownAndClick();

//        2.2 Mouse hover on £Pound Sterling and click
            homePage.clickOnSterlingPoundDropDown();

//        2.3 Mouse hover on Desktops Tab.
            homePage.mouseHoverOnDesktopsTab();

//        2.4 Click on “Show All Desktops”
            homePage.clickOnShowAllDesktops();

//        2.5 Select Sort By position "Name: A to Z"
            desktopsPage.selectSortByPositionNameAToZ();

//        2.6 Select product <product>


//        2.7 Enter Qty <qty> using Select class.

//        2.8 Click on “Add to Cart” button

//        2.9 Verify the Message <successMessage>

//        2.10 Click on link “shopping cart” display into success message

//        2.11 Verify the text "Shopping Cart"

//        2.12 Verify the Product name <productName>

//        2.13 Verify the Model <model>

//        2.14 Verify the Total <total>
//               DATA SET
//      | product | qty | successMessage | productName | model | total |
//      | HTC Touch HD | 1 | Success: You have added HTC Touch HD to your shopping cart! | HTC Touch HD | Product 1 | £74.73 |
//      | iPhone | 2 | Success: You have added iPhone to your shopping cart! | iPhone | product 11 | £150.92 |
//      | Palm Treo Pro | 3 | Success: You have added Palm Treo Pro to your shopping cart! | Palm Treo Pro | Product 2 | £1,242.11 |


    }




}
