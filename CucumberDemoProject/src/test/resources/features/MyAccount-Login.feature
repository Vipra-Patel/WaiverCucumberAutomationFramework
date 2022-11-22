Feature: This feature will test a login functionality

#   Simple login without parameters
#  Scenario: Log-in with valid username and password
#  Given Open the browser
#  And Enter the url "http://practice.automationtesting.in/"
#  And  click on My Account Menu
#  And Enter registered username and password
#  And click on Login button
#  Then User must successfully login to the web page


  # Simple login with parameters
#  Scenario: Log-in with valid username and password
#    Given Open the browser
#    And Enter the url "http://practice.automationtesting.in/"
#    And  click on My Account Menu
#    And Enter registered username "pavanoltraining" and password "Test@selenium123"
#    And click on Login button
#    Then User must successfully login to the web page


  #Simple login with Scenario Outline & Examples keyword
#  Scenario Outline: Log-in with valid username and password
#    Given Open the browser
#    And Enter the url "http://practice.automationtesting.in/"
#    And click on My Account Menu
#    And Enter registered username "<username>" and password "<password>"
#    And click on Login button
#    Then verify login
#
#    Examples:
#      | username        | password         |
#      | pavanoltraining | Test@selenium123 |
#      | pavanol         | Test@selenium    |
#      | pavanol         | Test@selenium    |


   #Simple login with Data table with single params
#  Scenario: Log-in with valid username and password
#    Given Open the browser
#    When Enter the url "http://practice.automationtesting.in/"
#    And click on My Account Menu
#    And Enter registered username and password
#      | pavanoltainning | Test@selenium123 |
#    And click on Login button
#    Then User must successfully login to the web page


   #Simple login with Data table params with header
   Scenario: Log-in with valid username and password
     Given Open the browser
     When Enter the url "http://practice.automationtesting.in/"
     And click on My Account Menu
     And Enter registered username and password
      | user | password |
      | pavanoltainning | Test@selenium123 |
     And click on Login button
     Then User must successfully login to the web page