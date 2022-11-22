Feature: This feature to test google search functionality

  Scenario: Validate google search is working
    Given Open the browser
    When Enter the URL "https://google.com"
    And user enters a text in search box
    And hits enter
    Then user is navigated to search results