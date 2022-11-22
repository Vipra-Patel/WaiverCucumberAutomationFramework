package com.automation.pages;

import com.automation.utils.PropertyReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class BasicInformationPage extends BasePage {

    @FindBy(id = "firstName")
    WebElement firstName;

    @FindBy(id = "lastName")
    WebElement lastName;

    @FindBy(id = "birthMonth")
    WebElement birthMonth;

    @FindBy(id = "birthDay")
    WebElement birthDay;

    @FindBy(id = "birthYear")
    WebElement birthYear;

    @FindBy(id = "phoneNumber")
    WebElement phoneNumber;

    @FindBy(xpath = "//div[@class='gender-select']//div[2]//label[1]")
    WebElement genderRdoBtn;

    @FindBy(id = "address1")
    WebElement streetAddress;

    @FindBy(id = "stateinput")
    WebElement state;

    @FindBy(id = "city")
    WebElement city;

    @FindBy(id = "postalCode")
    WebElement postalCode;

    @FindBy(id = "firstNameRead0")
    WebElement child_firstName;

    @FindBy(id = "security-code")
    WebElement child_lastName;

    @FindBy(id = "month")
    WebElement childDob_month;

    @FindBy(id = "date")
    WebElement childDob_date;

    @FindBy(id = "year")
    WebElement childDob_year;

    @FindBy(xpath = "//div[@class='gender-select-child']//div[1]//label[1]")
    WebElement child_genderRdoBtn;

    @FindBy(xpath = "//span[normalize-space()='Add More Children']")
    WebElement addMoreChildrenBtn;

  /*  @FindBy(xpath = "//span[normalize-space()='Remove Child']")
    WebElement removeChildBtn;*/

    @FindBy(id = "firstNameRead1")
    WebElement addChild_firstName;

    @FindBy(name = "lastName1")
    WebElement addChild_lastName;

    @FindBy(name = "childdobmm1")
    WebElement addChildDob_month;

    @FindBy(name = "childdobdd1")
    WebElement addChildDob_day;

    @FindBy(name = "childdobyyyy1")
    WebElement addChildDob_year;

    @FindBy(xpath = "//label[@for='female-child1']")
    WebElement addChild_genderRdoBtn;

    @FindBy(xpath = "//button[@class='continue']")
    WebElement continueBtn;


    public void fillBasicInformationDetails() {
        firstName.sendKeys(PropertyReader.getProperty("basicInformation.firstName"));
        lastName.sendKeys(PropertyReader.getProperty("basicInformation.lastName"));
        birthMonth.sendKeys(PropertyReader.getProperty("basicInformation.birthMonth"));
        birthDay.sendKeys(PropertyReader.getProperty("basicInformation.birthDay"));
        birthYear.sendKeys(PropertyReader.getProperty("basicInformation.birthYear"));
        phoneNumber.sendKeys(PropertyReader.getProperty("basicInformation.phoneNumber"));
        genderRdoBtn.click();
        streetAddress.sendKeys(PropertyReader.getProperty("basicInformation.streetAddress"));

        Select dropdown = new Select(state);
        dropdown.selectByVisibleText("Missouri");

        city.sendKeys(PropertyReader.getProperty("basicInformation.city"));
        postalCode.sendKeys(PropertyReader.getProperty("basicInformation.postalCode"));
        child_firstName.sendKeys(PropertyReader.getProperty("basicInformation.child_firstName"));
        child_lastName.sendKeys(PropertyReader.getProperty("basicInformation.child_lastName"));
        childDob_month.sendKeys(PropertyReader.getProperty("basicInformation.childDob_month"));
        childDob_date.sendKeys(PropertyReader.getProperty("basicInformation.childDob_day"));
        childDob_year.sendKeys(PropertyReader.getProperty("basicInformation.childDob_year"));
        child_genderRdoBtn.click();


    }
    public void clickOnAddMoreChildrenBtn() {

        addMoreChildrenBtn.click();
    }
    public void fillAddMoreChildrenDetails() {
        addChild_firstName.sendKeys(PropertyReader.getProperty("basicInformation.addChild_firstName"));
        addChild_lastName.sendKeys(PropertyReader.getProperty("basicInformation.addChild_lastName"));
        addChildDob_month.sendKeys(PropertyReader.getProperty("basicInformation.addChildDob_month"));
        addChildDob_day.sendKeys(PropertyReader.getProperty("basicInformation.addChildDob_day"));
        addChildDob_year.sendKeys(PropertyReader.getProperty("basicInformation.addChildDob_year"));
        addChild_genderRdoBtn.click();
    }

 /*  public void clickOnRemoveChildBtn() {
        removeChildBtn.click();
    }*/
    public void clickOnContinueBtn(){

        continueBtn.click();
    }


    public void verifyPage() {

        Assert.assertTrue(firstName.isDisplayed(),"first name field is missing from basic information page");
        Assert.assertTrue(lastName.isDisplayed(),"last ame field is missing from basic information page");
        Assert.assertTrue(birthMonth.isDisplayed(),"birth month field is missing from basic information page");
        Assert.assertTrue(birthDay.isDisplayed(),"birth day field is missing from basic information page");
        Assert.assertTrue(birthYear.isDisplayed(),"birth year field is missing from basic information page");
        Assert.assertTrue(phoneNumber.isDisplayed(),"phone number field is missing from basic information page");
        Assert.assertTrue(genderRdoBtn.isDisplayed(),"gender radio Buttons are missing from basic information page");
        Assert.assertTrue(streetAddress.isDisplayed(),"street address field is missing from basic information page");
        Assert.assertTrue(state.isDisplayed(),"state field is missing from basic information page");
        Assert.assertTrue(city.isDisplayed(),"city field is missing from basic information page");
        Assert.assertEquals(postalCode.isDisplayed(), true,"postal code field is missing from basic information page");

        Assert.assertTrue(child_firstName.isDisplayed(),"child first name field is missing from basic information page");
        Assert.assertTrue(child_lastName.isDisplayed(),"child last name field is missing from basic information page");
        Assert.assertTrue(childDob_month.isDisplayed(),"child date of birth month field is missing from basing information page");
        Assert.assertTrue(childDob_date.isDisplayed(),"child date of birth day field is missing from basic information page");
        Assert.assertTrue(childDob_year.isDisplayed(),"child date of birth year field is missing from basic information page");
        Assert.assertTrue(child_genderRdoBtn.isDisplayed(),"child gender radio buttons are missing from basic information page");

       Assert.assertTrue(addMoreChildrenBtn.isDisplayed(),"add more children button is missing from basic information page");
     //   Assert.assertTrue(removeChildBtn.isDisplayed(),"remove child button is missing from basic information page");
        Assert.assertTrue(continueBtn.isDisplayed(),"continue button is missing from basic information page");

    }


}
