package automation.steps;

import automation.pages.BasicInformationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BasicInformationSteps {

    BasicInformationPage basicInformationPage = new BasicInformationPage();

    @Then("verify user is on basic information page")
    public void verifyUserIsOnBasicInformationPage() {
        basicInformationPage.verifyPage();
    }
    @When("user fill all details on basic information page")
    public void userFillAllDetailsOnBasicInformationPage() {
        basicInformationPage.fillBasicInformationDetails();
    }

    @And("click on add more children button")
    public void clickOnAddMoreChildrenButton() {
        basicInformationPage.clickOnAddMoreChildrenBtn();
    }

    @When("user fill add more children details")
    public void userFillAddMoreChildrenDetails() {
        basicInformationPage.fillAddMoreChildrenDetails();
    }

    @And("click on continue Btn")
    public void clickOnContinueBtn() {
        basicInformationPage.clickOnContinueBtn();
    }
}

