package com.brite.step_definitions.ReceiptsChicagoWarehouseStepDefs;

import com.brite.pages.ReceiptsChicagoWarehousePage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class Brite_1155_StepDef {
    ReceiptsChicagoWarehousePage chicagoWarehouse = new ReceiptsChicagoWarehousePage();

    @When("user should click the Receipts Module")
    public void user_should_click_the_Receipts_Module() {
        chicagoWarehouse.receiptsModule.click();

    }

    @Then("User verifies if Receipts for chicago warehouse is displayed")
    public void user_verifies_if_Receipts_for_chicago_warehouse_is_displayed() {
        WebElement chicagoWHTitle = chicagoWarehouse.chicagoWarehouseTitle;
        Assert.assertTrue(chicagoWHTitle.isDisplayed());
    }
}
