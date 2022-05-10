package com.orangehrmlive.demo.pages;

import com.aventstack.extentreports.Status;
import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage extends Utility {
    public AdminPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@id='menu_admin_UserManagement']")
    WebElement adminUserManagement;
    @FindBy(xpath = "//a[@id='menu_admin_Job']")
    WebElement adminJob;
    @FindBy(xpath = "//a[@id='menu_admin_Organization']")
    WebElement adminOrganizationTabs;

    @FindBy(xpath = "//input[@id='btnAdd']")
    WebElement addButton;

    @FindBy(xpath = "//div[@class='head']/h1")
    WebElement userManagementHeader;

    public String getAdminHeader() {
        CustomListeners.test.log(Status.PASS, "GetAdminHeader: " + userManagementHeader);
        return getTextFromElement(userManagementHeader);

    }

    public void clickAddButton() {
        CustomListeners.test.log(Status.PASS, "Click On AddButton: " + addButton);
        clickOnElement(addButton);
    }

    public void clickOnAdminUserManagement() {
        CustomListeners.test.log(Status.PASS, "Click On AdminUserManagement: " + adminUserManagement);
        clickOnElement(adminUserManagement);
    }

    public void clickOnAdminJob() {
        CustomListeners.test.log(Status.PASS, "Click On AdminJob: " + adminJob);
        clickOnElement(adminJob);
    }

    public void clickOnAdminOrganizationTabs() {
        CustomListeners.test.log(Status.PASS, "Click On AdminOrganizationTabs: " + adminOrganizationTabs);
        clickOnElement(adminOrganizationTabs);

    }
}
