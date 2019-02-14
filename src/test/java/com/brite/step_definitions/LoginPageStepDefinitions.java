package com.brite.step_definitions;

import com.brite.pages.HomePage;
import com.brite.pages.LoginPage;
import com.brite.utilities.BrowserUtils;
import com.brite.utilities.ConfigurationReader;
import com.brite.utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.brite.utilities.BrowserUtils.waitForClickablility;

public class LoginPageStepDefinitions {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Given("user  in the login page")
    public void user_in_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("When  user  clicks on BriteErpDemo butto")
    public void when_user_clicks_on_BriteErpDemo_butto() {

        loginPage.selectDemo.click();
    }

    @Then("user  logs in using {string} and {string}")
    public void user_logs_in_using_and(String email, String password) {

        loginPage.login(email, password);
    }

    @Then("And the user clicks Log in button")
    public void and_the_user_clicks_Log_in_button() {
        BrowserUtils.waitForPageToLoad(5);
        loginPage.submitBtn.click();
        BrowserUtils.wait(4);
    }

    @Then("click on invetory module")
    public void click_on_invetory_module() {

        homePage.inventoryMenu.click();
    }

    @Given("manger in the login page")
    public void manger_in_the_login_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("manger  clicks on BriteErpDemo button")
    public void manger_clicks_on_BriteErpDemo_button() {
        loginPage.selectDemo.click();
    }
    @When("manger logs in using {string} and {string}")
    public void manger_logs_in_using_and(String email, String password) {
        loginPage.login(email, password);
    }



    @When("And the manager  clicks Log in button")
    public void and_the_manager_clicks_Log_in_button() {
        BrowserUtils.waitForPageToLoad(5);
        loginPage.submitBtn.click();
        BrowserUtils.wait(4);
    }

    @When("clicks on invetory module")
    public void clicks_on_invetory_module() {

        homePage.inventoryMenu.click();
    }



}
