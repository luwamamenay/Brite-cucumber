Feature: User should have Chicago Warehouse Receipts module under Inventory functionality

  Background:Steps to open Receipts Module page.
    Given the user goes to url
    When the user clicks on BritErpDemo button
    When the "user" enters valid email and password and going to inventory page
    And user should click the Receipts Module

  @Brite1155
  Scenario: Verify Chicago Warehouse Receipts is visible in Inventory page
    Then User verifies if Receipts for chicago warehouse is displayed


