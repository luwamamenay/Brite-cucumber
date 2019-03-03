package com.brite.step_definitions.ReceiptsMyCompanyChicago;

import com.brite.pages.HomePage;
import com.brite.pages.LoginPage;
import com.brite.pages.ReceiptsMyCompanyChicagoPage;
import com.brite.utilities.ExcelUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class DataDrivenTestDemoStepDefinitions {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    ReceiptsMyCompanyChicagoPage myCompanyChicago = new ReceiptsMyCompanyChicagoPage();

    @Given("manager clicks on Create new transfer")
    public void manager_clicks_on_Create_new_transfer() {
        myCompanyChicago.createButton.click();
    }

    @When("manager can add <partner>, <product>, <price>")
    public void manager_can_add_partner_product_price() {

        String file = "./src/test/resources/test_data/Receipts_Chicago_TestDemo.xlsx";
        String sheet = "TestDemo";
        ExcelUtils testDemoData = new ExcelUtils(file, sheet);

        List<Map<String, String>> testDemoDataDataList = testDemoData.getDataList();

        for (Map<String, String> testData : testDemoDataDataList) {

            String expectedPartner = testData.get("partner");
            //sendKeys

            String expectedProduct = testData.get("product");
            //sendKeys

            String expectedPrice = testData.get("price");
            //sendKeys
            }
        }

    @When("schedule activity for testDemo with <notes>")
    public void schedule_activity_for_testDemo_with_notes() {

        String file = "./src/test/resources/test_data/Receipts_Chicago_TestDemo.xlsx";
        String sheet = "TestDemo";
        ExcelUtils testDemoData = new ExcelUtils(file, sheet);

        List<Map<String, String>> testDemoDataDataList = testDemoData.getDataList();

        for (Map<String, String> testData : testDemoDataDataList) {

            String expectedPartner = testData.get("notes");
            //sendKeys

        }
    }

    @Then("correct information should be displayed in planned activities")
    public void correct_information_should_be_displayed_in_planned_activities() {

    }
}
