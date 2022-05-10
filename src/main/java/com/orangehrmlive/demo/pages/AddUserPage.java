package com.orangehrmlive.demo.pages;

import com.aventstack.extentreports.Status;
import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class AddUserPage extends Utility {
    public AddUserPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//select[@id='systemUser_userType']")
    WebElement userRoleDropDown;
    @FindBy(xpath = "//input[@id='systemUser_employeeName_empName']")
    WebElement employeeName;
    @FindBy(xpath = "//input[@id='systemUser_userName']")
    WebElement userName;
    @FindBy(xpath = "//input[@id='systemUser_password']")
    WebElement password;
    @FindBy(xpath = "//input[@id='systemUser_confirmPassword']")
    WebElement confirmPassword;
    @FindBy(xpath = "//select[@id='systemUser_status']")
    WebElement statusDropDown;
    @FindBy(xpath = "//input[@id='btnSave']")
    WebElement saveButton;
    @FindBy(xpath = "//input[@id='btnCancel']")
    WebElement cancelButton;
    @FindBy(xpath = "//h1[@id='UserHeading']")
    WebElement addUserHeader;
    @FindBy(xpath = "//*[contains(text(),'Successfully Saved')]")
    WebElement conFirmMessage;

    public String getPageHeader() {
        CustomListeners.test.log(Status.PASS, "GetPageHeader: " + addUserHeader);
        return getTextFromElement(addUserHeader);
    }

    public void setUserRoleDropDown(String text) {
        CustomListeners.test.log(Status.PASS, "Enter User Role: " + userRoleDropDown);
        selectByVisibleTextFromDropDown(userRoleDropDown, text);
    }

    public void setEmployeeName(String text) {
        CustomListeners.test.log(Status.PASS, "Enter Employee Name: " + employeeName);
        sendTextToElement(employeeName, text);
    }

    public void setUserName(String text) {
        CustomListeners.test.log(Status.PASS, "Enter User Name: " + userName);
        sendTextToElement(userName, text + (int) (Math.random() * 10000));
    }

    public void setStatusDropDown(String text) {
        CustomListeners.test.log(Status.PASS, "Select Status: " + statusDropDown);
        selectByVisibleTextFromDropDown(statusDropDown, text);
    }

    public void setPassword(String text) {
        CustomListeners.test.log(Status.PASS, "Enter Password: " + password);
        sendTextToElement(password, text);
    }

    public void setConfirmPassword(String text) {
        CustomListeners.test.log(Status.PASS, "Enter confirm Password: " + confirmPassword);
        sendTextToElement(confirmPassword, text);
    }

    public void setSaveButton() {
        CustomListeners.test.log(Status.PASS, "Click On Save Button: " + saveButton);
        clickOnElement(saveButton);
    }

    public void setCancelButton() {
        CustomListeners.test.log(Status.PASS, "Click On cancel Button: " + cancelButton);
        clickOnElement(cancelButton);
    }

    public String getConfirmMessage() {
        CustomListeners.test.log(Status.PASS, "Get ConFirm Message: " + conFirmMessage);
        return getTextFromElement(conFirmMessage);
    }
}
