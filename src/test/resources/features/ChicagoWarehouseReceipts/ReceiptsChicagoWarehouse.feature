Feature: User should have Chicago Warehouse Receipts module under Inventory functionality

  Background:Steps to open Receipts Module page.
    Given the user goes to url
    When the user clicks on BritErpDemo button
    When the "user" enters valid email and password and going to inventory page
    And user should click the Receipts Module

  @Brite1155
  Scenario: Verify Chicago Warehouse Receipts is visible in Inventory page
    Then User verifies if Receipts for chicago warehouse is displayed


  @Brite2120
  Scenario: Verify by clicking Chicago Warehouse Receipts user lands on Inventory / Chicago Warehouse: Receipts page
    Then the title should contain "Chicago Warehouse: Receipts"


  @Brite2124
  Scenario: Create a partner and enter notes then save
    Given User clicks on Create
    And User goes to notes section
    And User enters some notes "Internal notes about this query."
    Then User clicks on save


  @Brite2126
  Scenario: Create an empty partner and verify odoo server error Please add some lines to move
    Given User clicks on Create
    Then User clicks on Validate
    And User verifies the error message "Please add some lines to move"


  @Brite2130
  Scenario: Verify Print and Action drop down list displays when a product is selected
    When User selects a random reference checkbox
    Then print and action dropdown list should enable


  @Brite2133
  Scenario: Verify Load File is displayed on import page
    Given user clicks on import
    Then user verifies Load File is displayed


  @Brite2134
  Scenario: Edit the first order and enter notes.
    Given User clicks on first product
    And User clicks on edit
    And User goes to notes section
    Then User enters some notes notes
    And User clicks on save