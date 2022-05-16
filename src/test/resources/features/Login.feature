Feature: Login Scenarios

Scenario: As a registered user, I should be able to login

  Given I am on the login page
  And  Using credentials
  When Submitting credentials
  Then I can see the Products page