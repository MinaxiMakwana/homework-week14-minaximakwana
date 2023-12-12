package com.orangehrmlive.demo.testsuit;

import com.orangehrmlive.demo.pages.AddUserPage;
import com.orangehrmlive.demo.pages.AdminPage;
import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UsersTest extends TestBase {


    LoginPage loginPage;
    HomePage homePage;
    AdminPage adminPage;
    AddUserPage addUserPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        loginPage = new LoginPage();
        homePage = new HomePage();
        adminPage = new AdminPage();
        addUserPage = new AddUserPage();
    }


    @Test(groups = {"sanity", "smoke", "regression"})
    public void adminShouldAddUserSuccessFully(){

//        Login to Application
        loginPage.enterUsernameName("Admin");
        loginPage.enterPassword("admin123");

//        click On "Admin" Tab
        homePage.clickOnAdminLink();

//        Verify "System Users" Text
        Assert.assertEquals("System Users", "User is not receiving correct text");

//        click On "Add" button
        adminPage.clickOnAddButton();

//        Verify "Add User" Text
        addUserPage.VerifyAddUserText();

//        Select User Role "Admin"
        addUserPage.clickUserRoleOnAdminLink();

//        enter Employee Name "Ananya Dash"
        addUserPage.clickOnEmployeeNameTextBox();
        addUserPage.enterHintText("Peter");
        addUserPage.clickOnAutoCompleter();

//        enter Username
        loginPage.enterUsernameName("Admin");

//        Select status "Disable"
        addUserPage.clickOnStatusDropDown();
        addUserPage.selectStatusFromDropDown("Disabled");

//        enter psaaword
        loginPage.enterPassword("admin123");

//        enter Confirm Password
        loginPage.enterPassword("admin123");

//        click On "Save" Button
        addUserPage.clickOnSaveButton();

//        verify message "Successfully Saved"
        Assert.assertEquals(addUserPage.getSuccessToasterMessageText(), "Successfully Saved", "Not saved successfully.");
    }

    @Test(groups = {"sanity", "smoke", "regression"})
    public void searchTheUserCreatedAndVerifyIt(){

//        Login to Application
        loginPage.enterUsernameName("Admin");
        loginPage.enterPassword("admin123");

//        click On "Admin" Tab
        homePage.clickOnAdminLink();

//        Verify "System Users" Text
        Assert.assertEquals("System Users", "User is not receiving correct text");

//        Enter Username
        viewSystemUsersPage.searchUser("Annu.Som", "Admin", "Disabled");

//        Select User Role
        Assert.assertTrue(viewSystemUsersPage.getRecordFoundLabelText().contains("Record Found"), "The search results are not displayed.");

//        Select Satatus

//        Click on "Search" Button


//        Verify the User should be in Result list.
        Assert.assertTrue(viewSystemUsersPage.getRecordFoundLabelText().contains("Record Found"), "The search results are not displayed.");
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyThatAdminShouldDeleteTheUserSuccessFully(){

//        Login to Application
        loginPage.enterUsernameName("Admin");
        loginPage.enterPassword("admin123");

//        click On "Admin" Tab
        homePage.clickOnAdminLink();

//        Verify "System Users" Text
        Assert.assertEquals("System Users", "User is not receiving correct text");

//        Enter Username

//        Select User Role

//        Select Satatus

//        Click on "Search" Button
        viewSystemUsersPage.searchUser("Annu.Som", "Admin", "Disabled");

//        Verify the User should be in Result list.
        Assert.assertTrue(viewSystemUsersPage.getRecordFoundLabelText().contains("Record Found"), "The search results are not displayed.");

//        Click on Check box
        viewSystemUsersPage.clickOnUserNameCheckBox();


//        Click on Delete Button
        viewSystemUsersPage.clickOnDeleteIcon();

//        Popup will display
        viewSystemUsersPage.clickOnConfirmDeleteButton();

//        Click on Ok Button on Popup

//        verify message "Successfully Deleted"
        Assert.assertEquals(addUserPage.getSuccessToasterMessageText(), "Successfully Deleted", "Not deleted successfully.");

    }

    @Test(groups = {"regression"})
    public void searchTheUserAndVerifyTheMessageRecordFound(){

//        Login to Application
        loginPage.enterUsernameName("Admin");
        loginPage.enterPassword("admin123");

//        click On "Admin" Tab
        homePage.clickOnAdminLink();

//        Verify "System Users" Text
        Assert.assertEquals("System Users", "User is not receiving correct text");

//        Enter Username <username>

//        Select User Role <userRole>

//        Enter EmployeeName <employeeName>

//        Select Satatus <status>

//        Click on "Search" Button

//        verify message "(1) Record Found"

//        Verify username <username>

//        Click on Reset Tab

//        Data Set
//        username      userrole    employeeName    Status
//        Admin         Admin       Paul Collings   Enable
//        Cassidy.Hope  ESS         Cassidy Hope    Enable
//        Nina.Patel    ESS         Nina Patel      Enable
//        Odis.Adalwin  Admin       Odis Adalwin    Enable


    }



}
