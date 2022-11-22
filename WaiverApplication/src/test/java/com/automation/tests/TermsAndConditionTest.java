package com.automation.tests;

import org.testng.annotations.Test;

public class TermsAndConditionTest extends BaseTest {

    @Test

    public void verifyUserCanSelectIAgreeOption() {

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

        termsAndConditionPage.clickOnIAgreeBtn();

        termsAndConditionPage.clickOnIAgreeBtn1();

        termsAndConditionPage.clickOnAcceptAndContinueBtn();

        allowNotificationsPage.verifyPage();
    }
}
