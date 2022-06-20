Feature: Login Scenarios

  @login
  Scenario: As a registered user, I should be able to login

    Given I am on the login page
    And  Using credentials
    When Submitting credentials
    Then I am on the Products page

  @login2
  Scenario Outline: Verify login flow with various credentials

    Given I am on the login page
    And  Using credentials "<username>" and "<password>"
    When Submitting credentials
    Then I am on the Products page
    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |