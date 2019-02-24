package com.brite.step_definitions.receiptsMyCompanyStep_Definitions;

import com.brite.utilities.BrowserUtils;
import com.brite.utilities.Pages;
import cucumber.api.java.en.*;
import org.junit.Assert;

public class CreateStep_Definitions {

    Pages pages = new Pages();

    @When("user send any type randomly {string}")
    public void user_send_any_type_randomly(String data) {

        pages.getCreatePage().sourceBox.sendKeys(data);
    }

    @Then("user should verify that source box accept all kind of data.")
    public void user_should_verify_that_source_box_accept_all_kind_of_data() {


        pages.getCreatePage().saveButton.click();

        BrowserUtils.waitForVisibility(pages.getCreatePage().valueOfSource, 10);

        Assert.assertTrue(pages.getCreatePage().valueOfSource.isDisplayed());
    }

    @When("user select option from dropdown list")
    public void user_select_option_from_dropdown_list() {
       pages.getCreatePage().partnerDropdown.click();

       BrowserUtils.wait(3);
       pages.getCreatePage().elementOfDropdown.click();
        BrowserUtils.wait(3);
    }

    @Then("user should verify that option is selected")
    public void user_should_verify_that_option_is_selected() {

        BrowserUtils.waitForVisibility(pages.getCreatePage().partnerDropdown, 5);

        Assert.assertTrue(pages.getCreatePage().partnerDropdown.isDisplayed());
    }

    @When("user select one of the option from Add an item dropdown list with index {string}")
    public void user_select_one_of_the_option_from_Add_an_item_dropdown_list_with_index(String index) {
        pages.getCreatePage().addAnItem.click();
        BrowserUtils.waitForVisibility(pages.getCreatePage().clickDropdown,10);

        pages.getCreatePage().clickDropdown.click();

        BrowserUtils.wait(3);
        pages.getCreatePage().addItemElement.get(Integer.parseInt(index));

    }

    @Then("user should verify that option is selected from AddItem dropdown")
    public void user_should_verify_that_option_is_selected_from_AddItem_dropdown() {

        Assert.assertTrue(pages.getCreatePage().addAnItem.isDisplayed());

    }


}
