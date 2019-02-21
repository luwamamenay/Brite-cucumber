package com.brite.step_definitions;

import com.brite.pages.ChicagoDeliveryPage;
import com.brite.utilities.BrowserUtils;
import com.brite.utilities.Driver;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class ChicagoDeliveryStepDefinitions {
    @When("the user opens ChicagoDelivery page")
    public void the_opens_ChicagoDelivery_page() {
        ChicagoDeliveryPage chicagoDeliveryPage= new ChicagoDeliveryPage();
        BrowserUtils.waitUntilVisible(chicagoDeliveryPage.ChicagoWareHouseDelivery);
        chicagoDeliveryPage.ChicagoWareHouseDelivery.click();
    }

    @Then("user should be able to see Reference")
    public void user_should_be_able_to_see_Reference() {
        ChicagoDeliveryPage chicagoDeliveryPage= new ChicagoDeliveryPage();
        BrowserUtils.waitUntilVisible(chicagoDeliveryPage.Reference);
        Assert.assertTrue(chicagoDeliveryPage.Reference.isDisplayed());
    }

    @Then("user should be able to create new order")
    public void user_should_be_able_to_create_new_order() {
        ChicagoDeliveryPage chicagoDeliveryPage= new ChicagoDeliveryPage();
        BrowserUtils.waitUntilVisible(chicagoDeliveryPage.Create);
        Assert.assertTrue(chicagoDeliveryPage.Create.isDisplayed());
    }

    @Then("user should be able to see Back Order of")
    public void user_should_be_able_to_see_Back_Order_of() {
        ChicagoDeliveryPage chicagoDeliveryPage= new ChicagoDeliveryPage();
        BrowserUtils.waitUntilVisible(chicagoDeliveryPage.BackOrderof);
        Assert.assertTrue(chicagoDeliveryPage.BackOrderof.isDisplayed());
    }

    @Then("user should be able to see Import")
    public void user_should_be_able_to_see_Import() {
        ChicagoDeliveryPage chicagoDeliveryPage= new ChicagoDeliveryPage();
        BrowserUtils.waitUntilVisible(chicagoDeliveryPage.Import);
        Assert.assertTrue(chicagoDeliveryPage.Import.isDisplayed());
    }

    @Then("user should be able to see Partner")
    public void user_should_be_able_to_see_Partner() {
        ChicagoDeliveryPage chicagoDeliveryPage= new ChicagoDeliveryPage();
        BrowserUtils.waitUntilVisible(chicagoDeliveryPage.Partner);
        Assert.assertTrue(chicagoDeliveryPage.Partner.isDisplayed());
    }

    @Then("user should be able to see Scheduled Date")
    public void user_should_be_able_to_see_Scheduled_Date() {
        ChicagoDeliveryPage chicagoDeliveryPage= new ChicagoDeliveryPage();
        BrowserUtils.waitUntilVisible(chicagoDeliveryPage.ScheduledDate);
        Assert.assertTrue(chicagoDeliveryPage.ScheduledDate.isDisplayed());
    }

    @Then("user should be able to see Source Document")
    public void user_should_be_able_to_see_Source_Document() {
        ChicagoDeliveryPage chicagoDeliveryPage= new ChicagoDeliveryPage();
        BrowserUtils.waitUntilVisible(chicagoDeliveryPage.SourceDocument);
        Assert.assertTrue(chicagoDeliveryPage.SourceDocument.isDisplayed());
    }

    @Then("user should be able to see Status")
    public void user_should_be_able_to_see_Status() {
        ChicagoDeliveryPage chicagoDeliveryPage= new ChicagoDeliveryPage();
        BrowserUtils.waitUntilVisible(chicagoDeliveryPage.Status);
        Assert.assertTrue(chicagoDeliveryPage.Status.isDisplayed());
    }

    @Then("Title should be Chicago Warehouse: Delivery Orders - Odoo")
    public void title_should_be_Chicago_Warehouse_Delivery_Orders_Odoo() {
        ChicagoDeliveryPage chicagoDeliveryPage= new ChicagoDeliveryPage();
        BrowserUtils.waitUntilVisible(chicagoDeliveryPage.ChicagoWareHouseDelivery);
        chicagoDeliveryPage.ChicagoWareHouseDelivery.click();
        BrowserUtils.wait(5);
        Assert.assertEquals(Driver.getDriver().getTitle(),"Chicago Warehouse: Delivery Orders - Odoo");
    }


}
