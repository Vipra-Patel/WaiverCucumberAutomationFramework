package automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ParentalConsentPage extends BasePage {

 /*   @FindBy(xpath = "//button[@class='consent-option myself']//button[@class='option-select'][normalize-space()='SELECT']")
    WebElement selectMyselfBtn;

    @FindBy(xpath = "//button[@class='consent-option children']//button[@class='option-select'][normalize-space()='SELECT']")
    WebElement selectChildBtn; */

    @FindBy(xpath = "//button[@class='consent-option myself-and-children']//button[@class='option-select']")
    WebElement selectMyselfAndChildBtn;


    /*  public void clickOnSelectMyselfBtn() {
      selectMyselfBtn.click();
    }

    public void clickOnSelectChildBtn() {
      selectChildBtn.click();
    } */

    public void clickOnSelectMyselfAndChildBtn() {

        selectMyselfAndChildBtn.click();
    }


    public void verifyPage() {

  // Assert.assertTrue(selectMyselfBtn.isDisplayed(),"myself select button is missing from parental consent page");
  // Assert.assertTrue(selectChildBtn.isDisplayed(),"child(ren) select button is missing from parental consent page");
     Assert.assertTrue("select Myself and child(ren) button is missing from parental consent page", selectMyselfAndChildBtn.isDisplayed());


   }

}
