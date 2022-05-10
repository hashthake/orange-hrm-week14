package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.*;
import com.orangehrmlive.demo.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest extends TestBase {
    Homepage homePage;
    LoginPage loginPage;
    AdminPage adminPage;
    AddUserPage addUserPage;
    ViewSystemUserPage viewSystemUserPage;

    @BeforeMethod(alwaysRun = true)
    public void init() {
        homePage = new Homepage();
        loginPage = new LoginPage();
        adminPage = new AdminPage();
        addUserPage = new AddUserPage();
        viewSystemUserPage = new ViewSystemUserPage();
    }

    @Test(groups = {"sanity","regression"})
    public void verifyUserShouldLoginSuccessFully(){
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.loginBtn();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(homePage.getWelcomeText(), "Welcome Paul", "Failed to login");
        softAssert.assertAll();
    }

    @Test(groups = {"sanity","smoke","regression"})
    public void verifyThatTheLogoDisplayOnHomePage(){
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.loginBtn();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(homePage.getTextStoreOrangeHrmLogo(), true, "logo not Displayed");
        softAssert.assertAll();
    }

    @Test(groups = {"regression"})
    public void verifyUserShouldLogOutSuccessFully(){
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.loginBtn();
        homePage.getWelcomeText();
        loginPage.getTextLogInPanel();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(loginPage.getTextLogInPanel(), "LOGIN Panel", "Failed to logout");
        softAssert.assertAll();
    }



}




