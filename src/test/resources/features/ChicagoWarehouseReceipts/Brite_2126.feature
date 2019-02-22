Feature: User should have Chicago Warehouse Receipts module under Inventory functionality

  Background:Steps to open Receipts Module page.
    Given the user goes to url
    When the user clicks on BritErpDemo button
    When the "user" enters valid email and password and going to inventory page
    And user should click the Receipts Module


  @Brite2126
  Scenario: Create an empty partner and verify odoo server error Please add some lines to move
    Given User clicks on Create
    Then User clicks on Validate
    And User verifies the error message "Please add some lines to move"
