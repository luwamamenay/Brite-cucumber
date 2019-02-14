@smoke @BRIT-3998

Feature: Verify the title of receipts page


  Scenario: Verify title after click Receipts Module
    Given the user goes to url
    When the user clicks on BritErpDemo button
    When the "manager" enters valid email and password and going to inventory page
    And user should click the Receipts Module
    And the title should be "My Company, Chicago: Receipts - Odoo"


    #so basically we need use same steps that login has. with this way cucumber knows it needs to login before jump
    #to other steps.
