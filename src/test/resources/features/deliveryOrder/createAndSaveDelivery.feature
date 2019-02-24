
@regression
Feature: createAndSafe  functionality

  Background: user  should go to home page
    Given the user goes to url
    When the user clicks on BritErpDemo button
    Then the title should be "Login | Website localhost"
    When the "user" enters valid email and password and going to inventory page
    Then user is on delivery order your company dashboard


  Scenario: user is able to create and save delivery orders

    When user clicks on create button
    And user  enters  <partner> and  <Source Document>
    Then user  saves the order