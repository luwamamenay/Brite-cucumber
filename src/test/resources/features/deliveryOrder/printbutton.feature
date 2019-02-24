@regression
Feature: printButton functionality

  Background: user  should go to home page
    Given the user goes to url
    When the user clicks on BritErpDemo button
    Then the title should be "Login | Website localhost"
    When the "user" enters valid email and password and going to inventory page
    Then user is on delivery order your company dashboard



  Scenario: user is able to see delivery slip  and print button is clickable

    When user selects any of the orders listed
    And user  clicks on print dropDown and selctes deliveryslip
    Then user should see the deliveryslip and click on print button
