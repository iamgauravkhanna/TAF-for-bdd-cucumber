Feature: A description

  Scenario: As a registered user, I should be able to login

    Given I am on the login page
    And  Using credentials
    When Submitting credentials
    Then I am on the Products page

  Scenario: As a logged user, I can sort items
    Given I am logged in
    And I am on the Products page
    When I select the sorting dropdown by lowest to highest price