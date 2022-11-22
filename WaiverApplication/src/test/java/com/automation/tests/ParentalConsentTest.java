package com.automation.tests;

import org.testng.annotations.Test;

public class ParentalConsentTest extends BaseTest {

    @Test
    public void verifyUserCanSelectMyselfAndChildOption() {

        emailVerificationPage.fillEmailAddressField();

        emailVerificationPage.clickOnContinueBtn();

        parentalConsentPage.verifyPage();

        parentalConsentPage.clickOnSelectMyselfAndChildBtn();

        basicInformationPage.verifyPage();
    }

}
