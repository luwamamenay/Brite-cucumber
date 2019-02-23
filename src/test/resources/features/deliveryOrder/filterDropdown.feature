@user
Feature: filterDropDown  functionality

  Background: user  should go to home page
    Given the user goes to url
    When the user clicks on BritErpDemo button
    Then the title should be "Login | Website localhost"
    When the "user" enters valid email and password and going to inventory page
    Then user is on delivery order your company dashboard


  Scenario Outline: user is able to filter order by filter dropdown list

    When user clicks filter drop down list
    Then the user should see "<options>"
   And user filters order accordingly
    Examples:
      | options             |
      | Draft               |
      | Ready               |
      | Waiting Availability|