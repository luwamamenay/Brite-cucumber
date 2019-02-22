package com.brite.step_definitions.ReceiptsChicagoWarehouseStepDefs;

import com.brite.pages.ReceiptsChicagoWarehousePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Brite_2124_StepDef {
    ReceiptsChicagoWarehousePage chicagoWarehouse = new ReceiptsChicagoWarehousePage();

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

}
