@regression
Feature: OrganizeDelivery functionality

  Background: user  should go to home page
    Given the user goes to url
    When the user clicks on BritErpDemo button
    Then the title should be "Login | Website localhost"
    When the "user" enters valid email and password and going to inventory page
    Then user is on delivery order your company dashboard


  Scenario Outline: user is abel to  organized  delivery layout in ascending order

    When user clicks on "<button>"
    Then system should organize orders in ascendong order accordingly
    Examples:
      | button          |
      | Partner         |
      | Scheduled Date  |
      | Source Document |