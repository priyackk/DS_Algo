@dsalgo
Feature: Test Login Page
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Check login is successful with valid credentials
    Given browser is open
    When User enters <username> and <password>
    And user clicks on login
    Then User navigates to home page

    Examples: 
      | username | password   |
      | Abcdef   | Abcdef@123 |
      | John     | John@1234  |
