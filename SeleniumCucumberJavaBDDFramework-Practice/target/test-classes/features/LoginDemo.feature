Feature: Test login functionality

#  Scenario: Log-in with valid username and password
#    Given open the browser
#    And  Enter the url "https://example.testproject.io/web/"
#    When User enters username and password
#    And click on login button
#    Then User is navigated to the home page
#    And user selects country from dropdown menu
#    And user enter address
#    And user enter email
#    And user enter phone number
#    Then clicks on logout button

  Scenario Outline: Log-in with valid username and password
    Given open the browser
    And  Enter the url "https://example.testproject.io/web/"
    When User enters <username> and <password>
    And click on login button
    Then User is navigated to the home page
    And user selects country from dropdown menu
    And user enter address
    And user enter email
    And user enter phone number
    Then clicks on logout button

    Examples:
    | username | password|
    | Vipra | 12345      |
    | Chirag | 12345 |
    | Arth   | 12345 |