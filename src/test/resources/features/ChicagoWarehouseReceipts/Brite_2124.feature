Feature: User should have Chicago Warehouse Receipts  module under Inventory functionality

  Background:Steps to open Receipts Module page.
    Given the user goes to url
    When the user clicks on BritErpDemo button
    When the "user" enters valid email and password and going to inventory page
    And user should click the Receipts Module



  @Brite2124
  Scenario: Create a partner and enter notes then save
  Given User clicks on Create
  And User goes to notes section
  And User enters some notes "Internal notes about this query."
  Then User clicks on save
