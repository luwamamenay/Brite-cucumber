@BRIT-4153 @regression
Feature:User should able to select and sort the options

	Background:Steps to open Receipts Module page.
		Given the user goes to url
#		When the user clicks on BritErpDemo button
		When the "user" enters valid email and password and going to inventory page
		And user should click the Receipts Module


	Scenario: Verify that checkboxes is selected
		When user click check boxes randomly
		Then user should verify that check box is selected

	Scenario: Verify that when clicking header options list is sorted
		When user click one of the header
		Then user should verify that column is sorted.