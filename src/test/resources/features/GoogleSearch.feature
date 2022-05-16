Feature: Google Search
  Need to search word "gaurav" on Google

  @smoke
  Scenario: Simple Search
    Given Open Google Home Page
    When Text "gaurav" is entered
    Then results for "gaurav" is shown