package automation.pages;

import automation.utils.PropertyReader;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


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

        Assert.assertTrue("email address field is missing from email verification page", emailAddressField.isDisplayed());
        Assert.assertTrue("continue button is missing from email verification page", continueBtn.isDisplayed());

    }

    public void openWebsite() {
        driver.get(PropertyReader.getProperty("app.url"));

    }
}
