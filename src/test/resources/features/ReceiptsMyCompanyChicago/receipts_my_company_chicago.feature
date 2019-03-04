@wip
Feature: I should be able successfully to use main functionalities of module
         'Receipts - My Company Chicago' (Manager prospective)

  Background:
    Given the user goes to url
    When the "manager" enters valid email and password and going to inventory page
    Then manager clicks on Receipts - My Company Chicago

  @smoke
  Scenario: Verify if as a manager can open 'Receipts - My Company Chicago' module
    Then the title should be "My Company, Chicago: Receipts - Odoo"

   @smoke
  Scenario Outline: Verify if all categories are available and clickable on the same page
    When manager clicks on table "<headings>"
    Then the title should be "My Company, Chicago: Receipts - Odoo"

        Examples:
      | headings        |
      | Partner         |
      | Schedule date   |
      | Source document |
      | Back Order of   |
      | Status          |

  @regression
  Scenario: Verify if on top of Receipts table heading Status is available and clickable
    And manager clicks on Status
    Then status of the first receipts is "Ready"
  @regression
  Scenario: Verify if on top of navigation bar Calendar is available and clickable
    And manager clicks on Calendar
    Then button Today is clickable
  @regression
  Scenario: Verify if on top of navigation bar Kanban is available and clickable
    And manager clicks on Kanban
    Then button Import is displayed

  @regression
  Scenario Outline: Verify if on top of navigation bar Advanced search is available and clickable
    When manager clicks on Advanced search
    Then the "<search type>" should be displayed on the main panel

      Examples:
    | search type  |
    | Filters      |
    | Group By     |
    | Favorites    |

  @smoke
  Scenario:  Verify if manager can edit Receipt with valid information
    And choose partner 'PO4567' from dropdown list
    And click on edit button
    And click button Open Partner
    And add mobile phone number '245-967-9078'
    And click Save on left down corner of window
    And click Save on right top of the main panel
    Then receipt should be saved and "number" displayed on top of the window

  @regression
  Scenario: Verify if as manager can't create new Receipt with invalid information
    And choose partner 'PO4567' from dropdown list
    And click on edit button
    And click button Open Partner
    And add mobile phone number 'abc-defg-jklm'
    And click Save on left down corner of window
    Then receipt should not be saved and "number" should not be displayed on top of the window

  @regression
  Scenario: Verify if Delete option is available and clickable
    And manager clicks on first Reference from the list
    And manager clicks on Action
    And manager clicks on Delete from dropdown list
    Then confirmation text "Are you sure you want to delete this record ?" is displayed