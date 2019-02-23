@user
Feature: GroupBy functionality

  Background: user  should go to home page
    Given the user goes to url
    When the user clicks on BritErpDemo button
    Then the title should be "Login | Website localhost"
    When the "user" enters valid email and password and going to inventory page
    Then user is on delivery order your company dashboard



  Scenario Outline: user is able to group by Delivery order
    Given user is on delivery order your company dashboard
    When user clicks on Group By drop down list
    And user should be able to see "<buttons>"
    And user is able group by delivery orders accordingly
    Examples:
      | buttons           |
      | Status            |
      | Order Date        |
      | Expected Date     |
      | Origin            |
      | Operation Type    |
      | ProCurement Group |
