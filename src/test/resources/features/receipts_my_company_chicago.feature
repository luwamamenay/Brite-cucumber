
Feature: I should be able successfully to use main functionalities of module
         'Receipts - My Company Chicago' (Manager prospective)

  Background:
    When the "manager" enters valid email and password and going to inventory page
    And manager clicks on Receipts - My Company Chicago

  @wip
  Scenario: Verify if as a manager can open 'Receipts - My Company Chicago' module
    Then the title should be "Inventory - Odoo"

  Scenario Outline: Verify if all categories are available and clickable on the same page
    When the "manager" enters valid email and password and going to inventory page
    And manager clicks on Receipts - My Company Chicago
    Then Receipts - My Company Chicago module table has "<headings>"

        Examples:
      | headings        |
      | Partner         |
      | Schedule date   |
      | Source document |
      | Back Order of   |
      | Status          |

  Scenario: Verify if on top of Receipts table heading Status is available and clickable
    When the "manager" enters valid email and password and going to inventory page
    And manager clicks on Receipts - My Company Chicago
    And manager clicks on Status
    Then status of the first receipts is "Ready"

  Scenario: Verify if on top of navigation bar Calendar is available and clickable
    When the "manager" enters valid email and password and going to inventory page
    And manager clicks on Receipts - My Company Chicago
    And manager clicks on Calendar
    Then button Today is clickable

  Scenario: Verify if on top of navigation bar Kanban is available and clickable
    When the "manager" enters valid email and password and going to inventory page
    And manager clicks on Receipts - My Company Chicago
    And manager clicks on Kanban
    Then the url should be "http://52.39.162.23/web?#view_type=kanban&model=stock.picking&action=491&active_id=6"

  Scenario Outline: Verify if on top of navigation bar Advanced search is available and clickable
    When the "manager" enters valid email  and password and going to inventory page
    And manager clicks on Receipts - My Company Chicago
    And manager clicks on Advanced search
    Then the "<search type>" should be displayed on the main panel

      Examples:
    | search type  |
    | Filters      |
    | Group By     |
    | Favorites    |

 #passed
  Scenario:  Verify if manager can edit Receipt with valid information
    When the "manager" enters valid email and password and going to inventory page
    And manager clicks on Receipts - My Company Chicago
    And choose partner 'PO4567' from dropdown list
    And click on edit button
    And click button Open Partner
    And add mobile phone number '245-967-9078'
    And click Save on left down corner of window
    And click Save on right top of the main panel
    Then receipt should be saved and "number" displayed on top of the window


  Scenario: Verify if as manager can't create new Receipt with invalid information
    When the "manager" enters valid email and password and going to inventory page
    And manager clicks on Receipts - My Company Chicago
    And choose partner 'PO4567' from dropdown list
    And click on edit button
    And click button Open Partner
    And add mobile phone number 'abc-defg-jklm'
    And click Save on left down corner of window
    And click Save on right top of the main panel
    Then receipt should not be saved and "number" should not be displayed on top of the window


  Scenario: Verify if Delete option is available and clickable
    When the "manager" enters valid email and password and going to inventory page
    And manager clicks on first Reference from the list
    And manager clicks on Action
    And manager clicks on Delete from dropdown list
    Then confirmation text "Are you sure you want to delete this record ?" is displayed