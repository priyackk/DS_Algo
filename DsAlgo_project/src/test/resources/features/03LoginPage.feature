@dsalgo
Feature: Test Login Page
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Check login is successful with valid credentials
    Given User enters login page
    When User enters <username> and <password>
    Then User successfully logged in

    Examples: 
      | username | password   |
      | Abcdef   | Abcdef@123 |
      | John     | John@1234  |
