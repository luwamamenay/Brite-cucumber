package com.brite.step_definitions.receiptsMyCompanyStep_Definitions;

import com.brite.pages.HomePage;
import com.brite.utilities.BrowserUtils;
import com.brite.utilities.Pages;
import cucumber.api.java.en.*;

public class SmokeStep_definitions {

    Pages pages = new Pages();

    @When("user should click the Receipts Module")
    public void user_should_click_the_Receipts_Module() {

        HomePage homePage = new HomePage();

        homePage.receiptsLink.click();

    }

    @When("user clicks Create button")
    public void user_clicks_Create_button() {

        pages.getReceiptsMyCompanyPage().createButton.click();
    }


    @When("verify AddAnItem button is clickable")
    public void verify_AddAnItem_button_is_clickable() {

        BrowserUtils.isClickable(pages.getCreatePage().addAnItem);

    }

    @When("verify Save button is clickable")
    public void verify_Save_button_is_clickable() {

        BrowserUtils.isClickable(pages.getCreatePage().saveButton);

    }

}


