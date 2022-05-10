package com.orangehrmlive.demo.pages;

import com.aventstack.extentreports.Status;
import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends Utility {
    public Homepage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//img[@src='/webres_627a00ea7b6888.19673531/themes/default/images/logo.png']")
    WebElement storeOrangeHrmLogo;
    @FindBy(xpath = "//b[contains(text(),'Admin')]")
    WebElement admin;
    @FindBy(xpath = "//a[@id='menu_pim_viewPimModule']")
    WebElement pIm;
    @FindBy(xpath = "//b[contains(text(),'Leave')]")
    WebElement leave;
    @FindBy(xpath = "//b[contains(text(),'Dashboard')]")
    WebElement dashBoard;
    @FindBy(xpath = "//a[@id='welcome']")
    WebElement welcomeText;

    public String getTextStoreOrangeHrmLogo() {
        CustomListeners.test.log(Status.PASS, "Get Store OrangeHrmLogo: " + storeOrangeHrmLogo);
        return getTextFromElement(storeOrangeHrmLogo);
    }
    public void clickAdminLink() {
        CustomListeners.test.log(Status.PASS, "Click On Admin: " + admin);
        clickOnElement(admin);
    }
    public void clickPIMLink() {
        CustomListeners.test.log(Status.PASS, "Click On PIM Link: " + pIm);
        clickOnElement(pIm);
    }
    public void clickLeaveLink() {
        CustomListeners.test.log(Status.PASS, "Click On Leave Link: " + leave);
        clickOnElement(leave);
    }
    public void clickDashBoardLink() {
        CustomListeners.test.log(Status.PASS, "Click On DashBoard Link: " + dashBoard);
        clickOnElement(dashBoard);
    }
    public String getWelcomeText() {
        CustomListeners.test.log(Status.PASS, "Get Welcome Text: " + welcomeText);
        return getTextFromElement(welcomeText);
    }


}
