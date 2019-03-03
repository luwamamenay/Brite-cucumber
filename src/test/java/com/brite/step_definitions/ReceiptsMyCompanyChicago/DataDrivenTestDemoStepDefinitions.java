package com.brite.step_definitions.ReceiptsMyCompanyChicago;

import com.brite.pages.HomePage;
import com.brite.pages.LoginPage;
import com.brite.pages.ReceiptsMyCompanyChicagoPage;
import com.brite.utilities.ExcelUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

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

    @When("manager can add <partner>, <product>, <price>, <notes")
    public void manager_can_add_partner_product_price_notes() {

        String file = "./src/test/resources/test_data/Receipts_Chicago_TestDemo.xlsx";
        String sheet = "TestDemo";
        ExcelUtils testDemoData = new ExcelUtils(file, sheet);

        List<Map<String, String>> testDemoDataDataList = testDemoData.getDataList();

        for (Map<String, String> testData : testDemoDataDataList) {

            myCompanyChicago.partnerButton.click();

            String expectedPartner = testData.get("Partner");
            myCompanyChicago.searchPartner.sendKeys(expectedPartner, Keys.ENTER);
            if (myCompanyChicago.searchPartnerResult.getText().equalsIgnoreCase(testData.get("Partner"))){
                myCompanyChicago.searchPartnerResult.click();
            }

            String expectedProduct = testData.get("Product");
            myCompanyChicago.addItem.click();
            myCompanyChicago.itemLink.contains(testData.get("Product"));
            //dropdown


            String expectedPrice = testData.get("Price");
            myCompanyChicago.price.sendKeys(expectedPrice, Keys.ENTER);
            myCompanyChicago.saveButtonReceipt.click();

            myCompanyChicago.scheduleActivity.click();
            myCompanyChicago.activity.contains(testData.get("Activity"));

            String expectedNotes = testData.get("Notes");
            myCompanyChicago.notes.sendKeys(expectedNotes);
            myCompanyChicago.scheduleActivityBtn.click();
            }
        }



    @Then("correct information should be displayed in planned activities")
    public void correct_information_should_be_displayed_in_planned_activities() {

    }
}
