package com.brite.step_definitions.ReceiptsMyCompanyChicago;

import com.brite.pages.ReceiptsMyCompanyChicagoPage;
import com.brite.utilities.BrowserUtils;
import com.brite.utilities.DBUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.List;

public class ApplicationDatabaseAndUiDataVerificationStepDefinitions {

     ReceiptsMyCompanyChicagoPage myCompanyChicago1 = new ReceiptsMyCompanyChicagoPage();

    @Given("manager is on Receipts - My Company Chicago page")
    public void manager_is_on_Receipts_My_Company_Chicago_page() {

        Assert.assertTrue(myCompanyChicago1.createBtn.isDisplayed());

    }

    @When("manager filters receipts by status {string} and get how many results appeared")
    public void manager_filters_receipts_by_status_and_get_how_many_results_appeared(String status) {

        myCompanyChicago1.advancedSearchBtn.click();
        myCompanyChicago1.filterBtn.click();
        BrowserUtils.waitForClickablility(myCompanyChicago1.doneFilter, 5);
        myCompanyChicago1.doneFilter.click();
    }


    @Then("the same number of results {string} status receipts are displayed in database")
    public void the_same_number_of_results_status_receipts_are_displayed(String status) throws Exception {

       String query = "SELECT * FROM stock_picking WHERE  state = (select state WHERE state ='done' and name LIKE 'My Co%');";

       List<Object> statusDate = DBUtils.getColumnData(query, "state");
       List<String> actualStatus = BrowserUtils.getElementsText(myCompanyChicago1.statusSearchList);

        System.out.println(statusDate.toString());
        System.out.println(actualStatus.toString());

        //make sure all names appears, converting from Object to string
//        for (Object a: statusDate) {
//            Assert.assertTrue(actualStatus.contains(statusDate.toString()));
//        }

        int rowsCount = statusDate.size();
        int actualUiResult = Integer.parseInt(myCompanyChicago1.resultSearchDone.getText());
        Assert.assertEquals(rowsCount, actualUiResult);
    }
}
