package com.automation.tests;

import org.testng.annotations.Test;

public class EmailVerificationTest extends BaseTest {

    @Test
    public void verifyUserCanEnterEmail() {

        emailVerificationPage.fillEmailAddressField();

        emailVerificationPage.clickOnContinueBtn();

        parentalConsentPage.verifyPage();

    }
}
