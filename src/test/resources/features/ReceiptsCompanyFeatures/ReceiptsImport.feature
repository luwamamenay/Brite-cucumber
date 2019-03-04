@regression @BRIT-4231 @wip
Feature:As a User I should be able to upload a file

  Background:Steps to open Receipts Module page.
    Given the user goes to url
#    When the user clicks on BritErpDemo button
    When the "user" enters valid email and password and going to inventory page
    And user should click the Receipts Module


    Scenario: Verify that load file button is clickable
      When user clicks Import button
      Then user should verify loadFile button is clickable



      Scenario: Verify that user upload a file successfully
        When user clicks Import button
        And user should be able to upload a file
        Then user should verify the file is uploaded


