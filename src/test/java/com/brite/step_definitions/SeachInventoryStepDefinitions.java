package com.brite.step_definitions;

import com.brite.pages.LoginPage;
import com.brite.pages.SearchTransferPage;
import com.brite.utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeachInventoryStepDefinitions {

    LoginPage loginPage = new LoginPage();

    SearchTransferPage myPage = new SearchTransferPage();


    @When("the “manager” enters valid email and password and going to inventory page")
    public void the_manager_enters_valid_email_and_password_and_going_to_inventory_page() {

        loginPage.login("in@info.com", "alsfuh7we67");

    }

    @When("the manager clicks Inventory Advanced Filter Search button")
    public void the_manager_clicks_Inventory_Advanced_Filter_Search_button() {

            myPage.advanceSearch.click();
    }

    @When("the manager clicks Inventory Advanced Filter Gruop By button")
    public void the_manager_clicks_Inventory_Advanced_Filter_Gruop_By_button() {
       myPage.searchGroupByButton.click();
    }

    @Then("the manager should be able to click the inventory Advanced Filter Group By button")
    public void the_manager_should_be_able_to_click_the_inventory_Advanced_Filter_Group_By_button() {

        System.out.println("passed");
    }

    @When("the manager clicks Inventory Advanced Filter Favorites button")
    public void the_manager_clicks_Inventory_Advanced_Filter_Favorites_button() {
        myPage.searchFavoritesButton.click();
    }

    @When("the manager clicks Archived Search button")
    public void the_manager_clicks_Archived_Search_button() {
    myPage.searchArchiveButtonSelected.click();
    }

    @When("the manager clicks Remove the Searched Items")
    public void the_manager_clicks_Remove_the_Searched_Items() {
        myPage.SearchArchiveButtonRemoved.click();
    }

    @Then("the manager should be able to click the Remove button")
    public void the_manager_should_be_able_to_click_the_Remove_button() {
        myPage.SearchArchiveButtonRemoved.click();

    }







}
