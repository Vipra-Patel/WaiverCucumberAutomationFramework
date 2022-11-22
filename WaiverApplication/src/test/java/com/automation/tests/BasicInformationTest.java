package com.automation.tests;

import org.testng.annotations.Test;

public class BasicInformationTest extends BaseTest {

    @Test

    public void verifyUserCanEnterBasicInformation() {

        emailVerificationPage.fillEmailAddressField();

        emailVerificationPage.clickOnContinueBtn();

        parentalConsentPage.verifyPage();

        parentalConsentPage.clickOnSelectMyselfAndChildBtn();

        basicInformationPage.verifyPage();

        basicInformationPage.fillBasicInformationDetails();

        basicInformationPage.clickOnAddMoreChildrenBtn();

        basicInformationPage.fillAddMoreChildrenDetails();

        //basicInformationPage.clickOnRemoveChildBtn();

        basicInformationPage.clickOnContinueBtn();

        termsAndConditionPage.verifyPage();
    }
}
