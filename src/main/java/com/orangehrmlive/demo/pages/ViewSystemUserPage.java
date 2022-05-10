package com.orangehrmlive.demo.pages;

import com.aventstack.extentreports.Status;
import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ViewSystemUserPage extends Utility {
    public ViewSystemUserPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='head']/h1")
    WebElement userManagementHeader;

    @FindBy(xpath = "//input[@id='searchSystemUser_userName']")
    WebElement userName;

    @FindBy(xpath = "//select[@id='searchSystemUser_userType']")
    WebElement userRoleDropDown;

    @FindBy(xpath = "//input[@id='searchSystemUser_employeeName_empName']")
    WebElement employeeName;

    @FindBy(xpath = "//select[@id='searchSystemUser_status']")
    WebElement status;

    @FindBy(xpath = "//input[@id='searchBtn']")
    WebElement searchButton;

    @FindBy(xpath = "//div[@id='tableWrapper']//tbody[1]/tr/td[2]/a")
    WebElement searchResult;

    @FindBy(xpath = "//input[@id='ohrmList_chkSelectAll']")
    WebElement searchResultCheckbox;

    @FindBy(xpath = "//input[@id='btnDelete']")
    WebElement deleteButton;

    @FindBy(xpath = "//td[contains(text(),'No Records Found')]")
    WebElement noRecordFound;

    @FindBy(xpath = "//input[@id='resetBtn']")
    WebElement resetButton;

    @FindBy(xpath = "//input[@id='btnAdd']")
    WebElement addButton;

    @FindBy(xpath = "//input[@id='dialogDeleteBtn']")
    WebElement deleteRecordDialogueBoxOK;

    @FindBy(xpath = "//*[contains(text(),'Successfully')]")
    WebElement successConfirmMessage;

    public String getPageHeader() {
        CustomListeners.test.log(Status.PASS, "Select location: " + userManagementHeader);
        return getTextFromElement(userManagementHeader);
    }

    public void setDeleteRecordDialogueBoxOK() {
        CustomListeners.test.log(Status.PASS, "Clicking on OK to delete Dialogue box: " + deleteRecordDialogueBoxOK);
        clickOnElement(deleteRecordDialogueBoxOK);
    }

    public void setResetButton() {
        CustomListeners.test.log(Status.PASS, "Clicking on reset Button : " + resetButton);
        clickOnElement(resetButton);
    }

    public void setAddButton() {
        CustomListeners.test.log(Status.PASS, "Clicking on Add Button : " + addButton);
        clickOnElement(addButton);
    }

    public String getNoRecordFound() {
        CustomListeners.test.log(Status.PASS, "Get Search Record : " + noRecordFound);
        return getTextFromElement(noRecordFound);
    }

    public String getSearchResult() {
        CustomListeners.test.log(Status.PASS, "Get Search Result : " + searchResult);
        return getTextFromElement(searchResult);
    }

    public void setUserName(String text) {
        CustomListeners.test.log(Status.PASS, "Enter UserName : " + userName);
        sendTextToElement(userName, text);
    }

    public void setUserRoleDropDown(String text) {
        CustomListeners.test.log(Status.PASS, "Select User Role : " + userRoleDropDown);
        selectByVisibleTextFromDropDown(userRoleDropDown, text);
    }

    public void setEmployeeName(String text) {
        CustomListeners.test.log(Status.PASS, "Enter Employee Name : " + employeeName);
        sendTextToElement(employeeName, text);
    }

    public void setStatus(String text) {
        CustomListeners.test.log(Status.PASS, "Select User Status : " + status);
        selectByVisibleTextFromDropDown(status, text);
    }

    public void setSearchButton() {
        CustomListeners.test.log(Status.PASS, "Click On Search Button: " + searchButton);
        clickOnElement(searchButton);
    }

    public void setSearchResultCheckbox() {
        CustomListeners.test.log(Status.PASS, "Click on Search username checkbox: " + searchResultCheckbox);
        clickOnElement(searchResultCheckbox);
    }

    public void setDeleteButton() {
        CustomListeners.test.log(Status.PASS, "Click on Delete Button: " + deleteButton);
        clickOnElement(deleteButton);
    }

    public String getDeletionConfirmation() {
        CustomListeners.test.log(Status.PASS, "Delete Confirmation: " + successConfirmMessage);
        return getTextFromElement(successConfirmMessage);
    }


}
