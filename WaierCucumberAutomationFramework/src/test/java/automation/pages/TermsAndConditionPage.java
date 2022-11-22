package automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class TermsAndConditionPage extends BasePage {

    @FindBy(xpath = "//div[@class='round-terms']//label[@for='ToCChkBx-0']")
    WebElement IAgreeRdoBtn;

    @FindBy(xpath = "//div[@class='round-terms']//label[@for='ToCChkBx-1']")
    WebElement IAgreeRdoBtn1;

    @FindBy(xpath = "//button[@id='accept-button']")
    WebElement acceptAndContinueBtn;


    public void clickOnIAgreeBtn() {

        IAgreeRdoBtn.click();
    }

    public void clickOnIAgreeBtn1() {

        IAgreeRdoBtn1.click();
    }

    public void clickOnAcceptAndContinueBtn() {

        acceptAndContinueBtn.click();
    }

    public void verifyPage() {

        Assert.assertTrue("first I agree radio button is missing from Terms and condition page", IAgreeRdoBtn.isDisplayed());
        Assert.assertTrue("second I agree radio button is missing from Terms and condition page", IAgreeRdoBtn1.isDisplayed());
        Assert.assertTrue("Accept and continue button is missing from Terms and condition page", acceptAndContinueBtn.isDisplayed());

    }

}

