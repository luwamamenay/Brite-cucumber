package com.brite.step_definitions.ReceiptsMyCompanyChicago;

import com.brite.pages.HomePage;
import com.brite.pages.LoginPage;
import com.brite.pages.ReceiptsMyCompanyChicagoPage;
import com.brite.utilities.BrowserUtils;
import com.brite.utilities.Driver;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class ReceiptsMyCompanyChicagoStepDefinitions {

    LoginPage loginPage = new LoginPage();

    HomePage homePage = new HomePage();

    ReceiptsMyCompanyChicagoPage myCompanyChicago = new ReceiptsMyCompanyChicagoPage();

    @Then("manager clicks on Receipts - My Company Chicago")
    public void manager_clicks_on_Receipts_My_Company_Chicago() {
        BrowserUtils.waitForClickablility(myCompanyChicago.receipts, 10);
        myCompanyChicago.receipts.click();
    }

    @When("manager clicks on table {string}")
    public void manager_clicks_on_table(String headings) {

        switch (headings) {
            case "Partner":
                myCompanyChicago.partnerButton.click();
                break;
            case "Schedule date":
                myCompanyChicago.scheduleDateButton.click();
                break;
            case "Source document":
                myCompanyChicago.sourceDocumentButton.click();
                break;
            case "Back Order of":
                myCompanyChicago.backOrderButton.click();
                break;
            case "Status":
                myCompanyChicago.statusButton.click();
                break;
        }
    }

    @When("manager clicks on Status")
    public void manager_clicks_on_Status() {
        myCompanyChicago.statusButton.click();
    }

    @Then("status of the first receipts is {string}")
    public void status_of_the_first_receipts_is(String expected) {
        Assert.assertEquals(myCompanyChicago.resultStatus.getText(), expected);
    }

    @When("manager clicks on Calendar")
    public void manager_clicks_on_Calendar() {
        myCompanyChicago.calendarButton.click();
    }

    @Then("button Today is clickable")
    public void button_Today_is_clickable() {
        BrowserUtils.isClickable(myCompanyChicago.todayBtn);
    }

    @When("manager clicks on Kanban")
    public void manager_clicks_on_Kanban() {
        myCompanyChicago.kanbanButton.click();
    }

    @Then("button Import is displayed")
    public void button_Import_is_displayed() {
      BrowserUtils.waitForVisibility(myCompanyChicago.importButtonReceipt, 10);
      myCompanyChicago.importButtonReceipt.isDisplayed();
    }

    @When("manager clicks on Advanced search")
    public void manager_clicks_on_Advanced_search() {
        myCompanyChicago.advancedSearchBtn.click();
    }

    @Then("the {string} should be displayed on the main panel")
    public void the_should_be_displayed_on_the_main_panel(String searchType) {

        switch (searchType){
            case "Filters":
                myCompanyChicago.filterBtn.isDisplayed();
                break;
            case "Group By":
                myCompanyChicago.groupByBtn.isDisplayed();
                break;
            case "Favourites":
                myCompanyChicago.favouritesBtn.isDisplayed();
                break;
        }
    }

    @When("choose partner {string} from dropdown list")
    public void choose_partner_from_dropdown_list(String partner) {
        BrowserUtils.waitForClickablility(myCompanyChicago.receiptNumber, 10);
        myCompanyChicago.receiptNumber.click();
    }

    @When("click on edit button")
    public void click_on_edit_button() {
        myCompanyChicago.editButton.click();
    }


    @When("click button Open Partner")
    public void click_button_Open_Partner() {
        myCompanyChicago.openPartnerButton.click();
    }

    @When("add mobile phone number {string}")
    public void add_mobile_phone_number(String phoneNumber) {
        myCompanyChicago.phoneNumber.clear();
        myCompanyChicago.phoneNumber.sendKeys(phoneNumber);
    }

    @When("click Save on left down corner of window")
    public void click_Save_on_left_down_corner_of_window() {
        BrowserUtils.waitForClickablility(myCompanyChicago.saveButtonPartner, 10);
        myCompanyChicago.saveButtonPartner.click();
    }

    @When("click Save on right top of the main panel")
    public void click_Save_on_right_top_of_the_main_panel() {
        BrowserUtils.waitForClickablility(myCompanyChicago.saveButtonReceipt, 10);
        myCompanyChicago.saveButtonReceipt.click();
    }

    @Then("receipt should be saved and {string} displayed on top of the window")
    public void receipt_should_be_saved_and_displayed_on_top_of_the_window(String string) {
        myCompanyChicago.newReceiptNumber.isDisplayed();
    }

    @Then("receipt should not be saved and {string} should not be displayed on top of the window")
    public void receipt_should_not_be_saved_and_should_not_be_displayed_on_top_of_the_window(String string) {
      myCompanyChicago.newReceiptNumber.isDisplayed();
    }

    @When("manager clicks on first Reference from the list")
    public void manager_clicks_on_first_Reference_from_the_list() {
        BrowserUtils.isClickable(myCompanyChicago.selectReceipt);
        myCompanyChicago.selectReceipt.click();
    }

    @When("manager clicks on Action")
    public void manager_clicks_on_Action() {
        BrowserUtils.waitForClickablility(myCompanyChicago.actionButton, 10);
        myCompanyChicago.actionButton.click();

    }

    @When("manager clicks on Delete from dropdown list")
    public void manager_clicks_on_Delete_from_dropdown_list() {
        BrowserUtils.waitForClickablility(myCompanyChicago.actionListDeleteBtn, 10);
        myCompanyChicago.actionListDeleteBtn.click();
    }

    @Then("confirmation text {string} is displayed")
    public void confirmation_text_is_displayed(String expected) {
        Assert.assertEquals(expected, myCompanyChicago.deleteMessage.getText());
    }

}
