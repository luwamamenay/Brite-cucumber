#@regression @login @smoke
Feature: login functionality

  Background: user / manager should go to home page
    Given the user goes to url
    When the user clicks on BritErpDemo button
    Then the title should be "Login | Website localhost"

  @user
  Scenario: user login
    When the "user" enters valid email and password and going to inventory page



  @manager
  Scenario: user login
    When the "manager" enters valid email and password and going to inventory page





