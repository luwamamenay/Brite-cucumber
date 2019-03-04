@regression @BRIT-4230 @wip
Feature: Verify that Create page functionality works


  Background:Steps to open Receipts Module page.
    Given the user goes to url
#    When the user clicks on BritErpDemo button
    When the "user" enters valid email and password and going to inventory page
    And user should click the Receipts Module


  Scenario Outline: Verify that source box accepts data.
    When user clicks Create button
    And user send any type randomly "<data>"
    Then user should verify that source box accept all kind of data.

    Examples:
      | data   |
      | test   |
      | 123454 |
      | &*^%$  |


  Scenario: Verify that user can select option from partner dropdown list
    When user clicks Create button
    And user select option from dropdown list
    Then user should verify that option is selected


  Scenario Outline:
    When user clicks Create button
    And user select one of the option from Add an item dropdown list with index '<index>'
    Then user should verify that option is selected from AddItem dropdown

    Examples:
      | index |
      | 2     |
      | 4     |


