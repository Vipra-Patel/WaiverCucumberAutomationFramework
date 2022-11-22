package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class TermsAndConditionPage extends BasePage {

    @FindBy(xpath = "//div[@class='round-terms']//label[@for='ToCChkBx-0']")
    WebElement iAgreeRdoBtn;

    @FindBy(xpath = "//div[@class='round-terms']//label[@for='ToCChkBx-1']")
    WebElement iAgreeRdoBtn1;

    @FindBy(xpath = "//button[@id='accept-button']")
    WebElement acceptAndContinueBtn;



    public void clickOnIAgreeBtn() {

        iAgreeRdoBtn.click();
    }

    public void clickOnIAgreeBtn1() {

        iAgreeRdoBtn1.click();
    }
    public void clickOnAcceptAndContinueBtn() {

        acceptAndContinueBtn.click();
    }



    public void verifyPage() {

        Assert.assertTrue(iAgreeRdoBtn.isDisplayed(),"first I agree radio button is missing from Terms and condition page");
        Assert.assertTrue(iAgreeRdoBtn1.isDisplayed(),"second I agree radio button is missing from Terms and condition page");
        Assert.assertTrue(acceptAndContinueBtn.isDisplayed(),"Accept and continue button is missing from Terms and condition page");
    }

}

