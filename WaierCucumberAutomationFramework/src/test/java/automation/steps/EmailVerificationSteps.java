package automation.steps;

import automation.pages.EmailVerificationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class EmailVerificationSteps {

    EmailVerificationPage emailVerificationPage = new EmailVerificationPage();

    @Given("user open website")
    public void user_open_website() {
        emailVerificationPage.openWebsite();

    }
    @When("user enter email")
    public void user_enter_email() {
    emailVerificationPage.fillEmailAddressField();

    }
    @And("click on continue button")
    public void click_on_continue_button() {
        emailVerificationPage.clickOnContinueBtn();

    }




}
