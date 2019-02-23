@user
Feature: createButton functionality

  Background: user  should go to home page
    Given the user goes to url
    When the user clicks on BritErpDemo button
    Then the title should be "Login | Website localhost"
    When the "user" enters valid email and password and going to inventory page
    Then user is on delivery order your company dashboard


     #2
  Scenario: create button should be clickable
    Given create button is  visible and clickable
    Then verify create  button is clickable
