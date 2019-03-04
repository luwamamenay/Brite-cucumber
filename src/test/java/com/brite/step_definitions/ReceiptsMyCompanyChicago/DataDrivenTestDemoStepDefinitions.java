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

    ReceiptsMyCompanyChicagoPage myCompanyChicago = new ReceiptsMyCompanyChicagoPage();

    @Given("manager clicks on Create new transfer")
    public void manager_clicks_on_Create_new_transfer() {
        BrowserUtils.waitForClickablility(myCompanyChicago.createButton, 5);
        myCompanyChicago.createButton.click();
    }


    @When("manager can add {string}, {string}, {string}")
    public void manager_can_add(String partner, String product, String price) throws InterruptedException {

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


        //System.out.println(s.get(0).getText());
        System.out.println(product);
        for (WebElement each : s) {
            System.out.println(each.getText());
            if (each.getText().contains(product)) {
                System.out.println("Congrats!!!");
                System.out.println(each.getText());
                each.click();
                //wait.until(ExpectedConditions.visibilityOf(myCompanyChicago.price));
                //myCompanyChicago.price.sendKeys(price, Keys.ENTER);
            }
        }
       // myCompanyChicago.saveButtonReceipt.click();
        myCompanyChicago.saveButtonReceipt.click();
    }

    @When("manager schedules {string} with {string}")
    public void manager_schedules_with(String activity, String notes) throws InterruptedException {

        BrowserUtils.waitForClickablility(myCompanyChicago.scheduleActivity, 5);
        myCompanyChicago.scheduleActivity.click();
        //myCompanyChicago.activity

        BrowserUtils.waitForVisibility(myCompanyChicago.activity, 5);
        myCompanyChicago.activity.click();
        myCompanyChicago.testDemo.click();
//        List<WebElement> s1 = myCompanyChicago.listOfActivities();
//        for (WebElement each : s1) {
//            System.out.println(each.getText());
//            if (each.getText().contains("TestDemo")) {
//                System.out.println("Congrats!!!");
//                System.out.println(each.getText());
//                each.click();
//                //wait.until(ExpectedConditions.visibilityOf(myCompanyChicago.price));
//                //myCompanyChicago.price.sendKeys(price, Keys.ENTER);
//            }
//        }

        myCompanyChicago.notes.sendKeys(notes);
        myCompanyChicago.scheduleActivityBtn.click();
    }

//    @When("manager schedules {string}, {string}, {string}")
//    public void manager_schedules(String month, String date, String time) {
//
//        BrowserUtils.waitForClickablility(myCompanyChicago.month, 5);
//        if(myCompanyChicago.month.getText().equals(month)){
//            myCompanyChicago.month.click();
//        }else{
//            myCompanyChicago.nextMonth.click();
//            myCompanyChicago.month.click();
//        }
//
//        new Select(myCompanyChicago.getDate(date)).selectByValue(date);
//        myCompanyChicago.dayBtn.click();
//
//        for (WebElement t : myCompanyChicago.time){
//            if (t.getText().equals(time)) {
//                t.click();
//            }
//        }
//
//        myCompanyChicago.createSummary.click();
//    }

    @Then("button Today in Calendar is clickable")
    public void button_Today_in_Calendar_is_clickable(io.cucumber.datatable.DataTable dataTable) {

        //BrowserUtils.waitForClickablility(myCompanyChicago.todayBtnCalendar, 5);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);
        wait.until(ExpectedConditions.elementToBeClickable(myCompanyChicago.todayBtnCalendar));

        //myCompanyChicago.todayBtnCalendar.isDisplayed();
        String expectedTitle = Driver.getDriver().getTitle();
        String actualTitle = "Meetings (Week 10) - Odoo";
        Assert.assertEquals(expectedTitle, actualTitle);
    }
}
