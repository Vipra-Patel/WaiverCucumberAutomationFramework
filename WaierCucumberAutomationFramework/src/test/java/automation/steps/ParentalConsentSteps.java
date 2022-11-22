package automation.steps;

import automation.pages.ParentalConsentPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ParentalConsentSteps {

    ParentalConsentPage parentalConsentPage = new ParentalConsentPage();
    @Then("verify user is on parental consent page")
    public void verifyUserIsOnParentalConsentPage() {
        parentalConsentPage.verifyPage();
    }

    @When("user click on Myself and Child\\(ren) button")
    public void userClickOnMyselfAndChildRenButton() {
        parentalConsentPage.clickOnSelectMyselfAndChildBtn();
    }


}
