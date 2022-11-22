package automation.pages;

import automation.utils.PropertyReader;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ConfirmationPage extends BasePage {


    @FindBy(xpath = "//span[@id='waiver-head-title-thankyou']")
    WebElement confirmationTitle;

 //   @FindBy(xpath = "//button[@class='continue']")
 //   WebElement goBackToHomePageBtn;

 //   @FindBy(xpath = "//button[@class='previous']")
 //   WebElement signAnotherWaiverBtn;



   /* public void clickOnGoBackToHomePageBtn() {
        goBackToHomePageBtn.click();
    }*/

  /*  public void clickOnSignAnotherWaiverBtn() {
        signAnotherWaiverBtn.click();
    }*/

    public void verifyPage() {
        Assert.assertTrue("confirmation title is missing from confirmation page", confirmationTitle.isDisplayed());
        String actText = confirmationTitle.getText();
        String expText = PropertyReader.getProperty("confirmation.title");
        Assert.assertTrue("Expected confirmation text is "+expText+" :Actual "+actText, actText.equals(expText));

      //  Assert.assertTrue(goBackToHomePageBtn.isDisplayed(),"Go back to home page button is missing from confirmation page");

    }
}
