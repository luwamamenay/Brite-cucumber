@regression
Feature: delivery order your company functionality(total number)

  Background: user  should go to home page
    Given the user goes to url
    When the user clicks on BritErpDemo button
    Then the title should be "Login | Website localhost"
    When the "user" enters valid email and password and going to inventory page
    Then user is on delivery order your company dashboard


  Scenario: total number of delivery orders is displayed
    Given user is on delivery order your company dashboard
    Then  system should display total number of orders
