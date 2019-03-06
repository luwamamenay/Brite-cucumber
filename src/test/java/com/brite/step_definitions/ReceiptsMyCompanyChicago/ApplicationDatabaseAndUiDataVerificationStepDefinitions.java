package com.brite.step_definitions.ReceiptsMyCompanyChicago;

import com.brite.pages.ReceiptsMyCompanyChicagoPage;
import com.brite.utilities.BrowserUtils;
import com.brite.utilities.DBUtils;
import com.brite.utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import javax.swing.*;

public class ApplicationDatabaseAndUiDataVerificationStepDefinitions {

    ReceiptsMyCompanyChicagoPage myCompanyChicagoPage = new ReceiptsMyCompanyChicagoPage();

    @Given("manager is on Receipts - My Company Chicago page")
    public void manager_is_on_Receipts_My_Company_Chicago_page() {
        Assert.assertTrue(myCompanyChicagoPage.createButton.isDisplayed());
      String expectedUrl = "http://54.148.96.210/web?#view_type=list&model=stock.picking&action=491&active_id=6";
      Assert.assertEquals(expectedUrl, Driver.getDriver().getCurrentUrl());
    }

    @When("manager filters receipts by status {string} and get how many results appeared")
    public void manager_filters_receipts_by_status_and_get_how_many_results_appeared(String status) {
        myCompanyChicagoPage.filterBtn.click();
        BrowserUtils.waitForClickablility(myCompanyChicagoPage.doneFilter, 5);
        myCompanyChicagoPage.doneFilter.click();
    }

    @When("I query database with sql {string}")
    public void i_query_database_with_sql(String query) {


    }

    @Then("the same number of results {string} status receipts are displayed in database")
    public void the_same_number_of_results_status_receipts_are_displayed(String status) {
        String query = "SELECT * FROM stock_picking WHERE  state = (select state WHERE state ='done' and name LIKE 'My Co%');";

        int rowsCount = DBUtils.rowsCount(query);
        int actualUiResult = Integer.parseInt(myCompanyChicagoPage.resultSearchDone.getText());
        Assert.assertEquals(rowsCount, actualUiResult);
    }
}
