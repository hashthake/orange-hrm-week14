package com.orangehrmlive.demo.pages;

import com.aventstack.extentreports.Status;
import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility {
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='txtUsername']")
    WebElement userName;
    @FindBy(xpath = "//input[@id='txtPassword']")
    WebElement passWord;
    @FindBy(xpath = "//input[@id='btnLogin']")
    WebElement loginButton;
    @FindBy(xpath = "//div[@id='logInPanelHeading']")
    WebElement logInPanelText;

    public void enterUserName(String username) {
        CustomListeners.test.log(Status.PASS, "enter username: " + username);
        sendTextToElement(userName, username);
    }
    public void enterPassword(String password) {
        CustomListeners.test.log(Status.PASS, "enter password: " + password);
        sendTextToElement(passWord, password);
    }
    public void loginBtn() {
        CustomListeners.test.log(Status.PASS, "click on login button: " + loginButton);
        clickOnElement(loginButton);
    }
    public String getTextLogInPanel() {
        CustomListeners.test.log(Status.PASS, "Verify the Text Login Panel: " + logInPanelText);
        return getTextFromElement(logInPanelText);
    }

}
