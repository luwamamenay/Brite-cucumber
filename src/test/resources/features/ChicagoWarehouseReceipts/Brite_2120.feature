Feature: "User should have Chicago Warehouse Receipts  module under Inventory functionality"

  Background:Steps to open Receipts Module page.
    Given the user goes to url
    When the user clicks on BritErpDemo button
    When the "user" enters valid email and password and going to inventory page
    And user should click the Receipts Module


  @Brite2120
  Scenario: Verify by clicking Chicago Warehouse Receipts user lands on Inventory / Chicago Warehouse: Receipts page
    Then the title should contain "Chicago Warehouse: Receipts"
    
    