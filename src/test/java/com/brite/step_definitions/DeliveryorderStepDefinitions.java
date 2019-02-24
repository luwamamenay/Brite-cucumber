package com.brite.step_definitions;

import com.brite.pages.DeliveryOrderYourCompanyPages;
import com.brite.utilities.BrowserUtils;
import com.brite.utilities.Driver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.nio.file.Files;
import java.nio.file.Paths;

import static com.brite.utilities.BrowserUtils.waitForVisibility;

public class DeliveryorderStepDefinitions {
  static  String actual;


    DeliveryOrderYourCompanyPages deliveryOrder = new DeliveryOrderYourCompanyPages();

    @Given("Delivery Order your company is visible and clicable")
    public void delivery_Order_your_company_is_visible_and_clicable() {

        Assert.assertTrue(BrowserUtils.isClickable(deliveryOrder.deliveryOrderDB));

    }

    @When("user clicks on delivery order your company dashbord")
    public void user_clicks_on_delivery_order_your_company_dashbord() {

        deliveryOrder.deliveryOrderDB.click();
    }

    @Then("user is brought to the delivery list page")
    public void user_is_brought_to_the_delivery_list_page() {

        Assert.assertTrue(deliveryOrder.title.getText().
                contains("YourCompany: Delivery Orders"));


    }

    @Given("user is on delivery order your company dashboard")
    public void user_is_on_delivery_order_your_company_dashboard() {
        BrowserUtils.waitUntilVisible(deliveryOrder.deliveryOrderDB);
        deliveryOrder.deliveryOrderDB.click();
    }


    @Given("create button is  visible and clickable")
    public void create_button_is_visible_and_clickable() {
        deliveryOrder.createButton.isDisplayed();
        deliveryOrder.createButton.click();
    }

    @Then("verify create  button is clickable")
    public void verify_create_button_is_clickable() {
        Assert.assertTrue(BrowserUtils.isClickable(deliveryOrder.createButton));
    }

    @When("user clicks on import button")
    public void user_clicks_on_import_button() {
        deliveryOrder.importButton.click();
    }

    @Then("user clicks on loadfile")
    public void user_clicks_on_loadfile() {
        String user = System.getProperty("user.dir");
        String path = "/src/File/EmployeesTestData.xlsx";

        String fullpath = user + path;
        deliveryOrder.loadFileButton.sendKeys(fullpath);


        // deliveryOrder.loadFileButton.click();
    }

    @Then("user select file and load file")
    public void user_select_file_and_load_file() {
        String user = System.getProperty("user.dir");
        String path = "/src/File/EmployeesTestData.xlsx";

        String fullpath = user + path;
        deliveryOrder.loadFileButton.sendKeys(fullpath);


        Assert.assertTrue(Files.exists(Paths.get(fullpath)));

    }

    @When("user  select one of the orders from the list")
    public void user_select_one_of_the_orders_from_the_list() {
        deliveryOrder.checkbox.click();
    }

    @Then("user clicks on action dropdown")
    public void user_clicks_on_action_dropdown() {

        deliveryOrder.actiondropdown.click();


    }


    @Then("user  clicks on delete")
    public void user_clicks_on_delete() {
        deliveryOrder.delete.click();
        deliveryOrder.clickingConfrmationOK.click();
        waitForVisibility(deliveryOrder.accesErrorMessage, 15);
        Assert.assertTrue(deliveryOrder.accesErrorMessage.isDisplayed());
    }


    @Then("system should display total number of orders")
    public void system_should_display_total_number_of_orders() {

        deliveryOrder.previousNumber.click();
        Assert.assertTrue(BrowserUtils.isClickable(deliveryOrder.previousNumber));

        deliveryOrder.nextNumber.click();
        Assert.assertTrue(BrowserUtils.isClickable(deliveryOrder.nextNumber));

        Assert.assertTrue(deliveryOrder.totalnumberDisplyed.isDisplayed());

    }


    @When("user clicks on Group By drop down list")
    public void userClicksOnGroupByDropDownList() {

        deliveryOrder.glassSearch.click();
        deliveryOrder.groupBy.click();
    }

    @And("user should be able to see {string}")
    public void userShouldBeAbleToSee(String group) {

        switch (group){
            case "status":
                deliveryOrder.status.click();
                break;
            case "orderDate" :
                deliveryOrder.orderDate.click();
                break;
            case "expectedDate" :
                deliveryOrder.expectedDate.click();
                break;
            case "orgin" :
                deliveryOrder.orgin.click();
                break;
            case "operationType":
              deliveryOrder.operationType.click();
              break;

            case "procurmentGroup":
                deliveryOrder.procurmentGroup.click();
                break;


        }



    }



    @And("user is able group by delivery orders accordingly")
    public void userIsAbleGroupByDeliveryOrdersAccordingly() {
        deliveryOrder.status.click();

        String gropbydropdown = deliveryOrder.status.getText();
        System.out.println(gropbydropdown);

        String message= deliveryOrder.messages.getText();
        System.out.println(message);
        Assert.assertEquals(gropbydropdown,message);

    }

    @When("user clicks on create button")
    public void user_clicks_on_create_button() {
        deliveryOrder.createButton.click();
    }

    @When("user  enters  <partner> and  <Source Document>")
    public void user_enters_partner_and_Source_Document() {

        deliveryOrder.partnerBox.click();
        deliveryOrder.partnerBox.sendKeys("12th co ");

        deliveryOrder.sourceDocument.sendKeys("WH001307");

        Assert.assertTrue(BrowserUtils.isClickable(deliveryOrder.saveButton));

    }

    @Then("user  saves the order")
    public void user_saves_the_order() {
       // deliveryOrder.saveButton.click();
        Driver.getDriver().navigate().back();

        Assert.assertFalse(deliveryOrder.isExists());

    }

    @When("user selects any of the orders listed")
    public void user_selects_any_of_the_orders_listed() {
        deliveryOrder.checkbox.click();
    }

    @When("user  clicks on print dropDown and selctes deliveryslip")
    public void user_clicks_on_print_dropDown_and_selctes_deliveryslip() {
        deliveryOrder.printDropdown.click();
        deliveryOrder.deliverySlip.click();
    }


    @Then("user should see the deliveryslip and click on print button")
    public void user_should_see_the_deliveryslip_and_click_on_print_button() {
        deliveryOrder.deliverySlip.isDisplayed();
        deliveryOrder.printButton.click();
        Assert.assertTrue(BrowserUtils.isClickable(deliveryOrder.printButton));

    }


    @When("user clicks filter drop down list")
    public void userClicksFilterDropDownList() {
        deliveryOrder.glassSearch.click();
        deliveryOrder.filter.click();

    }


   @Then("the user should see {string}")
   public void the_user_should_see(String filter) {

       switch (filter){
           case "Draft":
                deliveryOrder.draft.click();
                actual = deliveryOrder.draft.getText();
               break;
           case "Ready":
                deliveryOrder.ready.click();
                actual = deliveryOrder.ready.getText();
                break;
           case "Waiting Availability":
                deliveryOrder.waitingforVailabilty.click();
                actual = deliveryOrder.waitingforVailabilty.getText();
                break;

        }
   }


    @And("user filters order accordingly")
   public void userFiltersOrderAccordingly() {

        String expected = deliveryOrder.messages.getText();
        Assert.assertEquals(actual,expected);


   }


    @When("user clicks on {string}")
    public void userClicksOn(String organize) {

        deliveryOrder.organizingIcons.get(2).click();


    }

    @Then("system should organize orders in ascendong order accordingly")
    public void systemShouldOrganizeOrdersInAscendongOrderAccordingly() {

        Assert.assertTrue(deliveryOrder.isInOrder());
    }
}
