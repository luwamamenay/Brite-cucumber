Feature: "User should have Chicago Warehouse Receipts  module under Inventory functionality"

  @navigateToChicagoWarehouse
  Background: User should navigate to Receipts Chicago Warehouse Module
    Given the user goes to url
    When the "user" enters valid email and password and going to inventory page
    Then the user should be able to view "Receipts Chicago Warehouse"


  @Brite2120
  Scenario: Verify by clicking Chicago Warehouse Receipts user lands on Inventory / Chicago Warehouse: Receipts page
    When user clicks on "Receipts" for Chicago Warehouse
    Then the title should be "Inventory / Chicago Warehouse: Receipts"
    
    