package automation.steps;

import automation.pages.ConfirmationPage;
import io.cucumber.java.en.Then;

public class ConfirmationSteps {

    ConfirmationPage confirmationPage = new ConfirmationPage();
    @Then("verify user is on confirmation page")
    public void verifyUserIsOnConfirmationPage() {

        confirmationPage.verifyPage();
    }
}
