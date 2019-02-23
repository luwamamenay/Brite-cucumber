package com.brite.step_definitions;

import com.brite.pages.HomePage;
import com.brite.pages.LoginPage;
import com.brite.utilities.BrowserUtils;
import com.brite.utilities.ConfigurationReader;
import com.brite.utilities.Driver;
import cucumber.api.java.en.*;
import org.junit.Assert;


public class LoginPageStepDefinitions {
    LoginPage loginPage = new LoginPage();

    HomePage homePage = new HomePage();

    @Given("the user goes to url")
    public void the_user_goes_to_url() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("the user clicks on BritErpDemo button")
    public void the_user_clicks_on_BritErpDemo_button() {
        loginPage.selectDemo.click();

    }

    @Then("the title should be {string}")
    public void the_title_should_be(String expectedTitle) {
        BrowserUtils.wait(1);
        Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle);
    }

    @When("the {string} enters valid email and password and going to inventory page")
    public void the_enters_valid_email_and_password_and_going_to_inventory_page(String username) {

        if (username.equalsIgnoreCase("user")) {
            loginPage.login(ConfigurationReader.getProperty("loginUser"), ConfigurationReader.getProperty("passwordUser"));
        } else if (username.equalsIgnoreCase("manager")) {
            loginPage.login(ConfigurationReader.getProperty("loginManager"), ConfigurationReader.getProperty("passwordManager"));
        }

        loginPage.submitBtn.click();
        BrowserUtils.waitForVisibility(homePage.inventoryMenu, 10);
        homePage.inventoryMenu.click();
    }

}
