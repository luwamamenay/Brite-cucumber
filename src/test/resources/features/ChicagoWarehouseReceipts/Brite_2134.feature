Feature: User should have Chicago Warehouse Receipts module under Inventory functionality

  Background:Steps to open Receipts Module page.
    Given the user goes to url
    When the user clicks on BritErpDemo button
    When the "user" enters valid email and password and going to inventory page
    And user should click the Receipts Module


  @Brite2134
  Scenario: Edit the first order and enter notes.
    Given User clicks on first product
    And User clicks on edit
    And User goes to notes section
    Then User enters some notes notes
    And User clicks on save


