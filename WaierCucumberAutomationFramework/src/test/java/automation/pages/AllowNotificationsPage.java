package automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


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

        Assert.assertTrue("SMS notification radio button is missing from allow notifications page", smsNotificationRdoBtn.isDisplayed());
        Assert.assertTrue("Email notification radio button is missing from allow notification page", emailNotificationRdoBtn.isDisplayed());
        Assert.assertTrue("Accept and continue button is missing from allow notifications page", acceptAndContinueBtn.isDisplayed());

    }

}
