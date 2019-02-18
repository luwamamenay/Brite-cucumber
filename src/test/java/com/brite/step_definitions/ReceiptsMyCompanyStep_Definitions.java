package com.brite.step_definitions;

import com.brite.utilities.Pages;
import cucumber.api.java.en.*;
import org.junit.Assert;

import java.util.Arrays;

public class ReceiptsMyCompanyStep_Definitions {

    Pages pages = new Pages();
    int random = (int) (Math.random() * 5 + 1);

    @When("user click check boxes randomly")
    public void user_click_check_boxes_randomly() {

        pages.getReceiptsMyCompanyPage().checkboxes.get(random).click();
    }

    @Then("user should verify that check box is selected")
    public void user_should_verify_that_check_box_is_selected() {
        Assert.assertTrue(pages.getReceiptsMyCompanyPage().checkboxes.get(random).isSelected());
    }

    @When("user click one of the header")
    public void user_click_one_of_the_header() {
        pages.getReceiptsMyCompanyPage().headerReference.click();
    }

    @Then("user should verify that column is sorted.")
    public void user_should_verify_that_column_is_sorted() {

        int array[] = new int[pages.getReceiptsMyCompanyPage().referenceList.size()];
        int j = 0;
        for (int i = 0; i < pages.getReceiptsMyCompanyPage().referenceList.size() - 1; i++) {

            int a = Integer.parseInt(pages.getReceiptsMyCompanyPage().referenceList.get(i).getText().substring(12));
            array[j] = a;
            j++;
        }
        Arrays.sort(array);

        for (int i = 0; i < array.length - 1; i++) {
            Assert.assertTrue(array[i] < array[i + 1]);
        }
    }
}
