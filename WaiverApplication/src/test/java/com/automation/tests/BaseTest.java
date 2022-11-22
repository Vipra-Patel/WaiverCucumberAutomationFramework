package com.automation.tests;

import com.automation.pages.*;
import com.automation.utils.DriverUtils;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {

    EmailVerificationPage emailVerificationPage;
    ParentalConsentPage parentalConsentPage;
    BasicInformationPage basicInformationPage;
    TermsAndConditionPage termsAndConditionPage;
    AllowNotificationsPage allowNotificationsPage;
    ConfirmationPage confirmationPage;


    @BeforeMethod
    public void setUp() {

        DriverUtils.createDriver();
        emailVerificationPage = new EmailVerificationPage();
        parentalConsentPage = new ParentalConsentPage();
        basicInformationPage = new BasicInformationPage();
        termsAndConditionPage = new TermsAndConditionPage();
        allowNotificationsPage = new AllowNotificationsPage();
        confirmationPage = new ConfirmationPage();

  }

    @AfterMethod
    public void cleanUp() {
        DriverUtils.getDriver().quit();

    }


}
