@smoke @BRIT-3998 @regression
Feature: verify the user should be able to create new pos orders from Inventory Module
Description: The purpose of this feature is to verify that user should create order
Background: User is Logged In
    Given the user goes to url
    When the user clicks on BritErpDemo button
    Given I am on  the login page
    When I submit username and password
    And click on submit button
    Then I should be logged in
@wip
Scenario:Search PosOrders functionality from the Inventory Module
      Given User is on Inventory Module
      When user click on Pos orders link button
      Then User is on PosOrders page
@wip
    Scenario: user create a new order
     Given User navigate InventoryPoS Orders page
     When click on the create button
     Then user is on InventoryPoS OrdersNew page
     Scenario Outline: Teast on adding new partner on the system
         Given user is on the create page
         When I click on create button
         And I fill "<Name>" "<Address>" "<City>" "<State>" "<Zip_Code>"
         And I fill "<Country>" "<TIN>" "<Tags>"  "<Job_Position>" <"Pohne">" "<Mobile>" "<Email>"
         And I hit Save button
         Then I go back to partner page and verify title
         Examples:
     | Name      | Address              | City      | State | Zip_code | Country|    TIN      | Tags      | Job_Position|    Pohne   |    Mobile  |      Email           |
     | Ephrem    | 1818 bruce PL SE     | Washington| DC     | 20020   | USA    | BR097475373 |Distributor|  Programmer |202-706-9806|202-277-0333|Afrodie2000@yahoo.com |
     | Jone      | 2251 Eisenhower Ave  | Virgina   | VA     | 22314   | USA    | BR097475374 | Employee  |   Tester    |202-706-9747|202-379-7100|hewandarmlow@gmail.com|
#Scenario: Open practiceselenium.com website and fill fake data
#    When I open practiceselenium website
#    And I fill the form with fake values
#    And I hit submit button
#    Then I go back to Welcome page and verify title
