package com.brite.step_definitions.receiptsMyCompanyStep_Definitions;

import com.brite.utilities.BrowserUtils;
import com.brite.utilities.Pages;
import cucumber.api.java.en.*;
import org.junit.Assert;

public class ImportStep_Definition {

    Pages pages = new Pages();

    @When("user clicks Import button")
    public void user_clicks_Import_button() {

        pages.getReceiptsMyCompanyPage().importButton.click();

    }

    @Then("user should verify loadFile button is clickable")
    public void user_should_verify_loadFile_button_is_clickable() {

            BrowserUtils.isClickable(pages.getImportPage().loadfile);


    }

    @When("user should be able to upload a file")
    public void user_should_be_able_to_upload_a_file() {

        String cwd=System.getProperty("user.dir");
        String path = "/src/Files/firstTestCase.xlsx";
        String fileLocation = cwd + path;

        BrowserUtils.wait(3);

        pages.getImportPage().loadfile.sendKeys(fileLocation);


    }


    @Then("user should verify the file is uploaded")
    public void user_should_verify_the_file_is_uploaded() {
        BrowserUtils.wait(3);
        Assert.assertTrue(pages.getImportPage().importButton.isEnabled());

    }

}
