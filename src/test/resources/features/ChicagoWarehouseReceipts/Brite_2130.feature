Feature: User should have Chicago Warehouse Receipts module under Inventory functionality

  Background:Steps to open Receipts Module page.
    Given the user goes to url
    When the user clicks on BritErpDemo button
    When the "user" enters valid email and password and going to inventory page
    And user should click the Receipts Module


  @Brite2130
  Scenario: Verify Print and Action drop down list displays when a product is selected
    When User selects a random reference checkbox
    Then print and action dropdown list should enable
