package com.nopcommerce.demo.testsuit;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class ComputerPageTest extends TestBase {

    ComputerPage computerPage;
    BuildYourOwnComputerPage buildYourOwnComputerPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){

        computerPage = new ComputerPage();
        buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    }


    @Test(groups = {"smoke", "regression"})
    public void verifyUserShouldNavigateToComputerPageSuccessfully(){

//        Click on Computer tab
        computerPage.clickOnComputerTab();

//        Verify "Computer" text
        computerPage.verifyComputersText();

    }


    @Test(groups = {"regression"})
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){

//        Click on Computer tab
        computerPage.clickOnComputerTab();

//        Click on Desktops link
        computerPage.clickOnDesktops();

//        Verify "Desktops" text
        computerPage.verifyDesktops();

    }

    @Test(dataProvider = "productName", dataProviderClass = TestData.class)
    public void verifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(String processor, String ram, String hdd, String os, String software){

//        Click on Computer tab
        computerPage.clickOnComputerTab();

//        Click on Desktops link
        computerPage.clickOnDesktops();

//        Click on product name "Build your own computer"
        buildYourOwnComputerPage.clickOnBuildYourOwnComputer();

//        Select processor "processor"
        buildYourOwnComputerPage.selectprocessorFromDropDown();

//        Select RAM "ram"
        buildYourOwnComputerPage.selectRamFromDropDown();

//        Select HDD "hdd"
        buildYourOwnComputerPage.selectHddFromDropDown();

//        Select OS "os"
        buildYourOwnComputerPage.selectOsFromDropDown();

//        Select Software "software"
        buildYourOwnComputerPage.selectSoftwareFromDropDown();

//        Click on "ADD TO CART" Button
        buildYourOwnComputerPage.clickOnAddToCartButton();

//        Verify message "The product has been added to your shopping cart"
        buildYourOwnComputerPage.verifyProductAddedToCart();


    }
}
