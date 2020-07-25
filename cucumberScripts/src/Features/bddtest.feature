Feature: User registration feature

  Scenario: user should be able to create an account through the signup module
    Given user is on the registration page
    When user enters the firstname
    And user enters the lastname
    And user selects a birthday
    And user creates an username
    And user creates a password
    And user clicks on the signup button
    And user should be navigated to a new account
    Then user should have a new account

  Scenario: user should be able to see new dashboard
    Given user is on the registration page
    When user clicks the login
    Then user should see the new dashboard
