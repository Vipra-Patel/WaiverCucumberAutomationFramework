package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AllowNotificationsPage extends BasePage {

    @FindBy(xpath = "//div[@class='round-notification']//label[@for='textSub']")
    WebElement smsNotificationRdoBtn;

    @FindBy(xpath = "//div[@class='round-notification']//label[@for='email']")
    WebElement emailNotificationRdoBtn;

    @FindBy(xpath = "//button[@id='accept-button']")
    WebElement acceptAndContinueBtn;


    public void selectSmsNotificationRdoBtn() {

        smsNotificationRdoBtn.click();
    }

    public void selectEmailNotificationRdoBtn() {

        emailNotificationRdoBtn.click();
    }

    public void clickOnAcceptAndContinueBtn() {

        acceptAndContinueBtn.click();
    }


    public void verifyPage() {

        Assert.assertTrue(smsNotificationRdoBtn.isDisplayed(),"SMS notification radio button is missing from allow notifications page");
        Assert.assertTrue(emailNotificationRdoBtn.isDisplayed(),"Email notification radio button is missing from allow notification page");
        Assert.assertTrue(acceptAndContinueBtn.isDisplayed(),"Accept and continue button is missing from allow notifications page");





































































































































































    }

}
