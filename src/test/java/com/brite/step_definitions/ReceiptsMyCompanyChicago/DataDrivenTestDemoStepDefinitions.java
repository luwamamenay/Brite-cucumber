package com.brite.step_definitions.ReceiptsMyCompanyChicago;

import com.brite.pages.ReceiptsMyCompanyChicagoPage;
import com.brite.utilities.BrowserUtils;
import com.brite.utilities.Driver;
import com.brite.utilities.ExcelUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Instant;
import java.util.*;


public class DataDrivenTestDemoStepDefinitions {

    ReceiptsMyCompanyChicagoPage myCompanyChicago2 = new ReceiptsMyCompanyChicagoPage();

    @Given("manager clicks on Create new transfer")
    public void manager_clicks_on_Create_new_transfer() {
        BrowserUtils.waitForClickablility(myCompanyChicago2.createButton, 5);
        myCompanyChicago2.createButton.click();
    }

    @When("manager can add {string}, {string}, {string}")
    public void manager_can_add(String partner, String product, String source_document_number) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);
        String file = "./src/test/resources/test_data/Receipts_Chicago_TestDemo.xlsx";
        String sheet = "TestDemo";
        ExcelUtils testDemoData = new ExcelUtils(file, sheet);

        List<Map<String, String>> testDemoDataDataList = testDemoData.getDataList();
        for (Map<String, String> testData : testDemoDataDataList) {

            //myCompanyChicago2.partnerButton.click();
            myCompanyChicago2.partnerDropDown.click();
            wait.until(ExpectedConditions.visibilityOf(myCompanyChicago2.searchMore));
            myCompanyChicago2.searchMore.click();
            String expectedPartner = testData.get("Partner");
            myCompanyChicago2.searchPartner.sendKeys(expectedPartner, Keys.ENTER);


            wait.until(ExpectedConditions.textToBePresentInElement(myCompanyChicago2.searchPartnerResult, expectedPartner));
            System.out.println(myCompanyChicago2.searchPartnerResult.getText());

            if (myCompanyChicago2.searchPartnerResult.getText().equalsIgnoreCase(testData.get("Partner"))) {
                myCompanyChicago2.searchPartnerResult.click();
            }


            String expectedSourceDocument = testData.get("Source Document");
            myCompanyChicago2.sourceDocument.sendKeys(expectedSourceDocument);

            myCompanyChicago2.additioanlInfo.click();

//            myCompanyChicago2.addItem.click();
//
//            String expectedProduct = testData.get("Product");
//            BrowserUtils.waitForClickablility(myCompanyChicago2.addItem, 5);
//
//            wait.until(ExpectedConditions.elementToBeClickable(myCompanyChicago2.itemLink));
//            myCompanyChicago2.itemLink.click();
//
//
//            List<WebElement> s = myCompanyChicago2.listOfProducts();
//            wait.until(ExpectedConditions.visibilityOfAllElements(myCompanyChicago2.listOfProducts()));
//
//            System.out.println(product);
//            for (WebElement each : s) {
//                System.out.println(each.getText());
//                if (each.getText().contains(product)) {
//                    System.out.println(each.getText());
//                    each.click();
//
//                }
//            }

            //myCompanyChicago2.statusButtonDoneTop.click();



        }
        myCompanyChicago2.saveButtonReceipt.click();

    }


    @Then("transfer number is displayed")
    public void transfer_number_is_displayed() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);
        wait.until(ExpectedConditions.visibilityOf(myCompanyChicago2.transferNumber));
        //BrowserUtils.waitForVisibility(myCompanyChicago.transferNumber, 10);
        Assert.assertTrue(myCompanyChicago2.transferNumber.isDisplayed());

        //Assert.assertTrue(myCompanyChicago.scheduleActivity.isDisplayed());
    }



}
