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

import java.util.*;


public class DataDrivenTestDemoStepDefinitions {

    ReceiptsMyCompanyChicagoPage myCompanyChicago = new ReceiptsMyCompanyChicagoPage();

    @Given("manager clicks on Create new transfer")
    public void manager_clicks_on_Create_new_transfer() {
        BrowserUtils.waitForClickablility(myCompanyChicago.createButton, 5);
        myCompanyChicago.createButton.click();
    }


    @When("manager can add {string}, {string}, {string}")
    public void manager_can_add(String partner, String product, String price) {

        myCompanyChicago.partnerButton.click();
        myCompanyChicago.partnerDropDown.click();
        myCompanyChicago.searchMore.click();

        myCompanyChicago.searchPartner.sendKeys(partner, Keys.ENTER);
        System.out.println(myCompanyChicago.searchPartnerResult.getText());
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);
        //wait.until(ExpectedConditions.urlToBe("http://54.148.96.210/web#id=&view_type=form&model=stock.picking&action=491&active_id=6"));
        wait.until(ExpectedConditions.textToBePresentInElement(myCompanyChicago.searchPartnerResult, partner));
        System.out.println(myCompanyChicago.searchPartnerResult.getText());
        //myCompanyChicago.searchPartnerResult.click();
        if (myCompanyChicago.searchPartnerResult.getText().equalsIgnoreCase(partner)){
           myCompanyChicago.searchPartnerResult.click(); }

        BrowserUtils.waitForClickablility(myCompanyChicago.addItem, 5);
//        BrowserUtils.clickWithJS(myCompanyChicago.addItem);

        myCompanyChicago.addItem.click();
        wait.until(ExpectedConditions.elementToBeClickable(myCompanyChicago.itemLink));
        myCompanyChicago.itemLink.click();

        //wait.until(ExpectedConditions.visibilityOfAllElements(myCompanyChicago.listOfProducts));

        List<WebElement> s = myCompanyChicago.listOfProducts();



        System.out.println(s);

        myCompanyChicago.price.sendKeys(price, Keys.ENTER);
        myCompanyChicago.saveButtonReceipt.click();
    }

    @When("manager schedules {string} with {string}")
    public void manager_schedules_with(String activity, String notes) {

        BrowserUtils.waitForClickablility(myCompanyChicago.scheduleActivity, 5);
        myCompanyChicago.scheduleActivity.click();
        new Select(myCompanyChicago.activity).selectByVisibleText(activity);

        myCompanyChicago.notes.sendKeys(notes);
        myCompanyChicago.scheduleActivityBtn.click();
    }

    @When("manager schedules {string}, {string}, {string}")
    public void manager_schedules(String month, String date, String time) {

        BrowserUtils.waitForClickablility(myCompanyChicago.month, 5);
        if(myCompanyChicago.month.getText().equals(month)){
            myCompanyChicago.month.click();
        }else{
            myCompanyChicago.nextMonth.click();
            myCompanyChicago.month.click();
        }

        new Select(myCompanyChicago.getDate(date)).selectByValue(date);
        myCompanyChicago.dayBtn.click();

        for (WebElement t : myCompanyChicago.time){
            if (t.getText().equals(time)) {
                t.click();
            }
        }

        myCompanyChicago.createSummary.click();
    }

    @When("manager goes to the planned activities page")
    public void manager_goes_to_the_planned_activities_page() {

    }

    @Then("manager should see correct information:")
    public void manager_should_see_correct_information(io.cucumber.datatable.DataTable dataTable) {

    }
}
