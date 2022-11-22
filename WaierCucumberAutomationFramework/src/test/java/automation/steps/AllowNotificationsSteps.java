package automation.steps;

import automation.pages.AllowNotificationsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AllowNotificationsSteps {

    AllowNotificationsPage allowNotificationsPage = new AllowNotificationsPage();

    @Then("verify user is on allow notifications page")
    public void verifyUserIsOnAllowNotificationsPage() {
        allowNotificationsPage.verifyPage();
    }

    @When("user is select sms notification radio button")
    public void userIsSelectSmsNotificationRadioButton() {
        allowNotificationsPage.selectSmsNotificationRdoBtn();
    }

    @And("user is select email notification radio button")
    public void userIsSelectEmailNotificationRadioButton() {
        allowNotificationsPage.selectEmailNotificationRdoBtn();
    }


    @And("user click on accept and continue btn")
    public void userClickOnAcceptAndContinueBtn() {
        allowNotificationsPage.clickOnAcceptAndContinueBtn();
    }
}
