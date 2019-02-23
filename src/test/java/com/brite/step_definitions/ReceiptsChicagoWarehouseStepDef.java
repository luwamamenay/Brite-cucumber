package com.brite.step_definitions;

import com.brite.pages.ReceiptsChicagoWarehousePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class ReceiptsChicagoWarehouseStepDef {
    ReceiptsChicagoWarehousePage chicagoWarehouse = new ReceiptsChicagoWarehousePage();

    //Brite-1155
    @When("user should click the Receipts Module")
    public void user_should_click_the_Receipts_Module() {
        chicagoWarehouse.receiptsModule.click();

    }

    @Then("User verifies if Receipts for chicago warehouse is displayed")
    public void user_verifies_if_Receipts_for_chicago_warehouse_is_displayed() {
        WebElement chicagoWHTitle = chicagoWarehouse.chicagoWarehouseTitle;
        Assert.assertTrue(chicagoWHTitle.isDisplayed());
    }


    //Brite-2120
    @Then("the title should contain {string}")
    public void the_title_should_contain(String string) {
        String expectedTitle = "Inventory";
        String containsTitle = chicagoWarehouse.chicagoWarehouseTitle.getText();
        System.out.println(containsTitle);
        Assert.assertTrue(containsTitle.contains(expectedTitle));
    }


    //Brite-2124
    @Given("User clicks on Create")
    public void user_clicks_on_Create() {
        chicagoWarehouse.createButton.click();
    }

    @Given("User goes to notes section")
    public void user_goes_to_notes_section() {
        chicagoWarehouse.notesTab.click();
    }

    @Given("User enters some notes {string}")
    public void user_enters_some_notes(String notes) {
        notes = "Internal notes about this query.";
        chicagoWarehouse.notesBox.sendKeys(notes);
    }

    @Then("User clicks on save")
    public void user_clicks_on_save() {
        chicagoWarehouse.saveButton.click();
    }


    //Brite-2126
    @Then("User clicks on Validate")
    public void user_clicks_on_Validate() {

    }

    @Then("User verifies the error message {string}")
    public void user_verifies_the_error_message(String string) {

    }


    //Brite-2130
    @When("User selects a random reference checkbox")
    public void user_selects_a_random_reference_checkbox() {

    }

    @Then("print and action dropdown list should enable")
    public void print_and_action_dropdown_list_should_enable() {

    }


    //Brite-2133
    @Given("user clicks on import")
    public void user_clicks_on_import() {

    }

    @Then("user verifies Load File is displayed")
    public void user_verifies_Load_File_is_displayed() {

    }


    //Brite-2134
    @Given("User clicks on first product")
    public void user_clicks_on_first_product() {

    }

    @Given("User clicks on edit")
    public void user_clicks_on_edit() {

    }

    @Then("User enters some notes notes")
    public void user_enters_some_notes_notes() {

    }




}
