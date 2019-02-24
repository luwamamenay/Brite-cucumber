@regression
Feature: delivery order dashboard functionality

  Background: user  should go to home page
    Given the user goes to url
    When the user clicks on BritErpDemo button
    Then the title should be "Login | Website localhost"
    When the "user" enters valid email and password and going to inventory page
    Then user is on delivery order your company dashboard


    #1
  Scenario: Delivery order Dashboard
    Given Delivery Order your company is visible and clicable
    When  user clicks on delivery order your company dashbord
    Then  user is brought to the delivery list page


