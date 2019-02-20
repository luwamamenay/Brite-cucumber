package com.brite.pages;

import com.brite.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReceiptsMyCompanyImportPage {

    public ReceiptsMyCompanyImportPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//input[@id='my-file-selector']")
    public WebElement loadfile;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-default o_import_button o_import_import']")
    public WebElement importButton;

}
