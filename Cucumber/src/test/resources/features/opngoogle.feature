@loginsample
Feature: open google Test functionality

  Scenario: Open google search scenario
    Given user is on google page
    When user enter the search term raina
    And user enter the search button
    Then user should see the search results
