@orangehrm
Feature: Test the login functionality of orangehrm

  Scenario: Check the login with valid username and password
    Given user is on the orangehrm login page
    When user enter username and password
    And user click login button
    Then user navigate to orangehrm home page
