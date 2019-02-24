@regression
Feature: ImportAndLoad functionality

  Background: user  should go to home page
    Given the user goes to url
    When the user clicks on BritErpDemo button
    Then the title should be "Login | Website localhost"
    When the "user" enters valid email and password and going to inventory page
    Then user is on delivery order your company dashboard


      #3
  Scenario: user is able to import and load file
    When user clicks on import button
    Then user clicks on loadfile
    And user select file and load file
