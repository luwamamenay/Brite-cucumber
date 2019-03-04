@smoke @BRIT-3998 @regression @wip
Feature: Verify title and  buttons on Receipts Page

  Background:Steps to open Receipts Module page.
    Given the user goes to url
#    When the user clicks on BritErpDemo button
    When the "user" enters valid email and password and going to inventory page
    And user should click the Receipts Module

  Scenario: Verify title after click Receipts Module
    And the title should be "My Company, Chicago: Receipts - Odoo"


  Scenario: Verify 'AddAnItem' and 'Save' button are clickable
    When user clicks Create button
    And verify AddAnItem button is clickable
    And verify Save button is clickable
		