Feature: This feature file to test end to end flow of the website

  @Smoke
  Scenario: Verify User Can Sign Waiver
    Given user open website
    When user enter email
    And click on continue button
    Then verify user is on parental consent page
    When user click on Myself and Child(ren) button
    Then verify user is on basic information page
    When user fill all details on basic information page
    And click on add more children button
    When user fill add more children details
    And click on continue Btn
    Then verify user is on terms and condition page
    When user click on I agree radio button
    And user click on I agree1 radio button
    And user click on accept and continue button
    Then verify user is on allow notifications page
    When user is select sms notification radio button
    And  user is select email notification radio button
    And user click on accept and continue btn
    Then verify user is on confirmation page


