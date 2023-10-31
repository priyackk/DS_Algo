@dsalgo
Feature: Test Array Datastructure
  I want to use this template for my feature file

  Background: 
    Given User opens home page before login to test arrays
    When User logged in from login page to test arrays
    Then User successfully logged in now to test arrays

  @tag1
  Scenario Outline: User tests array with simple python code
    And User tests array page enters <input> in text editor box and it gives <expectedOutput>
    Then Array page completed for correct input

    Examples: 
      | input        | expectedOutput |
      | print"hello" | hello          |

  @tag2
  Scenario Outline: User tests arrays with wrong python code
    When User clicks array button for wrong input and gives <errorInput> and gets <errorMsg>
    But Array page completed for wrong input

    Examples: 
      | errorInput | errorMsg |
      | hello      | error    |
