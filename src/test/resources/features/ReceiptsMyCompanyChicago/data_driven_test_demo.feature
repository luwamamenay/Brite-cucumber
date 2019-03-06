
Feature: I should be able to create 20 transfers for certain partner from excel (Manager prospective)

  Background:
    Given the user goes to url
    When the "manager" enters valid email and password and going to inventory page
    Then manager clicks on Receipts - My Company Chicago


  Scenario:I should be able to create 20 transfers for certain partner with product, source document number from excel file sheet "<TestDemo>"
    Given manager clicks on Create new transfer
    When manager can add "<partner>", "<product>", "<source_document_number>"
    Then transfer number is displayed

