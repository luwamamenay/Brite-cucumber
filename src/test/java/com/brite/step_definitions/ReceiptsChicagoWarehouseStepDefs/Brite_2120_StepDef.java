package com.brite.step_definitions.ReceiptsChicagoWarehouseStepDefs;

import com.brite.pages.ReceiptsChicagoWarehousePage;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class Brite_2120_StepDef {
    ReceiptsChicagoWarehousePage chicagoWarehouse = new ReceiptsChicagoWarehousePage();


    @Then("the title should contain {string}")
    public void the_title_should_contain(String string) {
        String expectedTitle = "Inventory";
        String containsTitle = chicagoWarehouse.chicagoWarehouseTitle.getText();
        System.out.println(containsTitle);
        Assert.assertTrue(containsTitle.contains(expectedTitle));
    }
}
