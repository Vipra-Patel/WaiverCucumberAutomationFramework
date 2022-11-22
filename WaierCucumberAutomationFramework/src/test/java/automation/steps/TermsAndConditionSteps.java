package automation.steps;

import automation.pages.TermsAndConditionPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TermsAndConditionSteps {

    TermsAndConditionPage termsAndConditionPage = new TermsAndConditionPage();

    @Then("verify user is on terms and condition page")
    public void verifyUserIsOnTermsAndConditionPage() {

        termsAndConditionPage.verifyPage();
    }

    @When("user click on I agree radio button")
    public void userClickOnIAgreeRadioButton() {

        termsAndConditionPage.clickOnIAgreeBtn();
    }

    @And("user click on I agree{int} radio button")
    public void userClickOnIAgreeRadioButton(int arg0) {

        termsAndConditionPage.clickOnIAgreeBtn1();
    }

    @And("user click on accept and continue button")
    public void userClickOnAcceptAndContinueButton() {

        termsAndConditionPage.clickOnAcceptAndContinueBtn();
    }
}
