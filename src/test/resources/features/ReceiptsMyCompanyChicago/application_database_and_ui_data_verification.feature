# new feature
# Tags: optional


#FRONT END --- DATABASE

#1)compare front end and database data matching
#1) read data from front end
#2) connect to database and run sql that matches the front end data, and verify
#2)make change in front end and goto database and verify/validate
#1) make changes(add.update/delete) in front end
#2) connect to database and verify that changes are made in
#database tables as well
#3)make changes in database and verify in front end

#1) connect to db run sql that update/delete/insert
#2) goto front end app module where data is being displayed and verify

@wip
Feature: Application Database and UI data verification (manager prospective)

  Background:
    Given the user goes to url
    When the "manager" enters valid email and password and going to inventory page
    Then manager clicks on Receipts - My Company Chicago

  Scenario: Receipts filter of status "Done" data UI and Database verification
    Given manager is on Receipts - My Company Chicago page
     When manager filters receipts by status "Done" and get how many results appeared
      And I query database with sql "SELECT * FROM stock_picking WHERE  state = (select state WHERE state ='done' and name LIKE 'My Co%');"
     Then the same number of results "Done" status receipts are displayed in database