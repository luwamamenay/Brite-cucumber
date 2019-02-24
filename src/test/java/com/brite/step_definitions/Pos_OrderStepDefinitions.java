package com.brite.step_definitions;

import com.brite.pages.HomePage;
import com.brite.pages.LoginPage;
import com.brite.pages.Pos_OrderPage;
import com.brite.utilities.BrowserUtils;
import com.brite.utilities.ConfigurationReader;
import com.brite.utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Pos_OrderStepDefinitions {

    public WebDriver driver;
    HomePage homePage=new HomePage();
    LoginPage loginPage=new LoginPage();
    Pos_OrderPage pos_orderPage=new Pos_OrderPage();

    @Given("I am on  the login page")
    public void i_am_on_the_login_page() { driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            Driver.getDriver().navigate().to(ConfigurationReader.getProperty("url"));
            Assert.assertEquals("http://52.39.162.23/web/database/selector", driver.getTitle());
            pos_orderPage.BriteErpDemo.click();

    }
    @When("I submit username and password")
    public void i_submit_username_and_password(String username) {
        username.equalsIgnoreCase("user");
        System.out.println("I am logging in");
        System.out.println("email: " + ConfigurationReader.getProperty("loginUser"));
        System.out.println("password: " + ConfigurationReader.getProperty("passwordUser"));
        loginPage.email.sendKeys(ConfigurationReader.getProperty("loginUser"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("passwordUser"));

    }
    @When("click on submit button")
    public void click_on_submit_button() {
        loginPage.submitBtn.click();

    }
    @Then("I should be logged in")
    public void i_should_be_logged_in() {
        //BrowserUtils.waitForVisibility(homePage.inventoryMenu, 10);
        homePage.inventoryMenu.click();

    }
    @Given("User is on Inventory Module")
    public void user_is_on_Inventory_Module() {
     Assert.assertTrue(pos_orderPage.PoSOrderTextLink.isDisplayed());
     pos_orderPage.Inventory.click();

    }
    @When("user click on Pos orders link button")
    public void user_click_on_Pos_orders_link_button() {
       pos_orderPage.PoSOrderTextLink.click();

    }
    @Then("User is on PosOrders page")
    public void user_is_on_PosOrders_page() {
       pos_orderPage.CreateButton.click();
        BrowserUtils.wait(10);
    }

    @Given("User navigate InventoryPoS Orders page")
    public void user_navigate_InventoryPoS_Orders_page() {
        //Assert.assertTrue(pos_orderPage.PartnerImage.isDisplayed());
        pos_orderPage.CreateButton.click();
        BrowserUtils.wait(10);
    }

    @When("click on the create button")
    public void click_on_the_create_button() {
        //Select dropdown = new Select(pos_orderPage.Partnerdropdown.findElement(By.id());
    }
    @Then("user is on InventoryPoS OrdersNew page")
    public void user_is_on_InventoryPoS_OrdersNew_page() {
         Assert.assertTrue(pos_orderPage.IndividualRadio.isSelected());
         pos_orderPage.IndividualRadio.click();
    }
    @Given("user is on the create page")
    public void user_is_on_the_create_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("I click on create button")
    public void i_click_on_create_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("I fill {string} {string} {string} {string} {string}")
    public void i_fill(String string, String string2, String string3, String string4, String string5) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("I fill {string} {string} {string}  {string} <{string}>{string}{int}{int}{int}{string}Afrodie{int}@yahoo.com\"")
    public void i_fill_Afrodie_yahoo_com(String string, String string2, String string3, String string4,
     String string5, String string6, Integer int1, Integer int2, Integer int3, String string7, Integer int4) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("I hit Save button")
    public void i_hit_Save_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("I go back to partner page and verify title")
    public void i_go_back_to_partner_page_and_verify_title() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("I fill {string} {string} {string}  {string} <{string}>{string}{int}{int}{int}{string}hewandarmlow@gmail.com\"")
    public void i_fill_hewandarmlow_gmail_com(String string, String string2, String string3, String string4,
     String string5, String string6, Integer int1, Integer int2, Integer int3, String string7) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

}
