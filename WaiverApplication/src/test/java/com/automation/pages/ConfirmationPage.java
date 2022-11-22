package com.automation.pages;

import com.automation.utils.PropertyReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ConfirmationPage extends BasePage {


    @FindBy(xpath = "//span[@id='waiver-head-title-thankyou']")
    WebElement confirmationTitle;

    @FindBy(xpath = "//button[@class='continue']")
    WebElement goBackToHomePageBtn;


    public void clickOnGoBackToHomePageBtn() {

        goBackToHomePageBtn.click();
    }

    public void verifyPage() {
        Assert.assertTrue(confirmationTitle.isDisplayed(),"confirmation title is missing from confirmation page");
        String actText = confirmationTitle.getText();
        String expText = PropertyReader.getProperty("confirmation.title");
        Assert.assertTrue(actText.equals(expText),"Expected confirmation text is "+expText+" :Actual "+actText);

        Assert.assertTrue(goBackToHomePageBtn.isDisplayed(),"Go back to home page button is missing from confirmation page");

    }
}
