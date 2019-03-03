# new feature
# Tags: optional

Feature: I should be able to schedule successfully testDemos, meetings, calls, todo (Manager Prospective)

  Background:
    Given the user goes to url
    When the "manager" enters valid email and password and going to inventory page
    Then manager clicks on Receipts - My Company Chicago
  @wip
  Scenario: I should be able to schedule successfully testDemos
    Given manager clicks on Create new transfer
     When manager can add <partner>, <product>, <price>
     And schedule activity for testDemo with <notes>
    Then correct information should be displayed in planned activities
