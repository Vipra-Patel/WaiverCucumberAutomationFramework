package com.automation.pages;

import com.automation.utils.PropertyReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class EmailVerificationPage extends BasePage {

    @FindBy(id = "email-input")
    WebElement emailAddressField;

    @FindBy(xpath = "//span[@class='mat-button-wrapper']")
    WebElement continueBtn;



    public void fillEmailAddressField() {
        emailAddressField.sendKeys(PropertyReader.getProperty("emailVerification.emailAddress"));
    }
    public void clickOnContinueBtn() {
        continueBtn.click();
    }


    public void verifyPage() {

        Assert.assertTrue(emailAddressField.isDisplayed(),"email address field is missing from email verification page");
        Assert.assertTrue(continueBtn.isDisplayed(), "continue button is missing from email verification page");

    }



}
