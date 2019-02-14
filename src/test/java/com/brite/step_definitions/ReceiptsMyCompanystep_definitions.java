package com.brite.step_definitions;

import com.brite.pages.HomePage;
import com.brite.utilities.BrowserUtils;
import cucumber.api.java.en.*;

public class ReceiptsMyCompanystep_definitions {



    @When("user should click the Receipts Module")
    public void user_should_click_the_Receipts_Module() {

        HomePage homePage = new HomePage();

        homePage.receiptsLink.click();


    }
}


