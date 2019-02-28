@regression
Feature: delivery order delete functionality

  Background: user  should go to home page
    Given the user goes to url
#    When the user clicks on BritErpDemo button
    Then the title should be "Login | Website localhost"
    When the "user" enters valid email and password and going to inventory page
    Then user is on delivery order your company dashboard


    #4
  Scenario: user is not able to delete delivery items from the list
    When user  select one of the orders from the list
    Then user clicks on action dropdown
    And user  clicks on delete
