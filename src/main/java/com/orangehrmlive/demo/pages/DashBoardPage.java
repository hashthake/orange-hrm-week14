package com.orangehrmlive.demo.pages;

import com.aventstack.extentreports.Status;
import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage extends Utility {
    public DashBoardPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//h1[contains(text(),'Dashboard')]")
    WebElement dashBoradText;
    public String getDashBoradText() {
        CustomListeners.test.log(Status.PASS, "Select location: " + dashBoradText);
        return getTextFromElement(dashBoradText);
    }

}
