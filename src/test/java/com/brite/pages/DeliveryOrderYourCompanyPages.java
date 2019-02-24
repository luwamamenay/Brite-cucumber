package com.brite.pages;

import com.brite.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class DeliveryOrderYourCompanyPages {

    public DeliveryOrderYourCompanyPages(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath="(//span[.='Delivery Orders'])[1]")
    public WebElement deliveryOrderDB;

    @FindBy(xpath = "//div[@class='o_control_panel']//ol//li[2]")
    public WebElement title;

    @FindBy(xpath="(//div[@class='o_list_buttons']//button)[1]")
    public WebElement createButton;

    @FindBy(xpath = "(//div[@class='o_list_buttons']//button)[2]")
    public WebElement importButton;

    @FindBy(xpath = "//input[@id='my-file-selector']")
    public WebElement loadFileButton;

    @FindBy(xpath = "(//input[@type='checkbox'])[4]")
    public WebElement checkbox;


    @FindBy(xpath = "//button[@class='btn btn-sm btn-default o_import_button o_import_import']")
    public WebElement clickImport;

    @FindBy(xpath = "//input[@class='oe_import_file_show form-control']")
    public WebElement uploadBox;


    @FindBy(xpath = "(//button[@class='o_dropdown_toggler_btn btn btn-sm dropdown-toggle'])[2]")
    public WebElement actiondropdown;

    @FindBy(xpath = "(//a[@data-section='other'])[2]")
    public WebElement delete;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary']//span")
    public WebElement clickingConfrmationOK;

  //  @FindBy(xpath = "//div[@class='modal-header']//h4//span")
    @FindBy(css = "span.o_subtitle.text-muted.small")
    public WebElement accesErrorMessage;


    @FindBy(xpath = "//div//span[@class='o_pager_value']")
    public WebElement totalnumberDisplyed;


    @FindBy(xpath = "//button[@class='fa fa-chevron-left btn btn-icon o_pager_previous']")
    public WebElement previousNumber;


    @FindBy(xpath = "//button[@class='fa fa-chevron-right btn btn-icon o_pager_next']")
    public WebElement nextNumber;


    @FindBy(xpath = "(//div[@class='o_searchview']//span)[1]")
    public WebElement glassSearch;


    @FindBy(xpath = "(//button[@class='o_dropdown_toggler_btn btn btn-sm dropdown-toggle'])[4]//span[2]")
    public WebElement groupBy;



    @FindBy(xpath = "//a[contains(text(),'Status')]")
    public  WebElement status;


    @FindBy(xpath = "//a[contains(text(),'Order Date')]")
    public  WebElement orderDate;


    @FindBy(xpath = "//a[contains(text(),'Expected Date')]")
    public  WebElement expectedDate;

    @FindBy(xpath = "//a[contains(text(),'Origin')]")
    public WebElement orgin;

    @FindBy(xpath = "//a[contains(text(),'Operation Type')]")
    public  WebElement operationType;

    @FindBy(xpath = "//a[contains(text(),'Procurement Group')]")
    public  WebElement procurmentGroup;


    @FindBy(xpath = "(//div[@class='o_facet_values'])[2]//span")
    public WebElement messages;


    @FindBy(xpath = "(//div[@class='o_input_dropdown']//input)[1]")
    public WebElement partnerBox;

    @FindBy(xpath = "(//button[@class='btn btn-sm btn-primary'])[1]")
    public WebElement create2;


    @FindBy(xpath = "//input[@class='o_field_char o_field_widget o_input']")
    public WebElement sourceDocument;

    @FindBy(xpath = "(//div[@class='o_form_buttons_edit']//button)[1]")
    public WebElement saveButton;

    @FindBy(xpath = "//tbody//td[5]")
    public List<WebElement> sourceDocumntContent;

    public boolean isExists(){
        for (int i = 0; i < sourceDocumntContent.size()-1; i++) {
            if (sourceDocumntContent.get(i).getText().contains("WH001")||
                    sourceDocumntContent.get(i).getText().contains("")){
                return true;
            }

        }
        return false;
    }


    @FindBy(xpath = "(//button[@class='o_dropdown_toggler_btn btn btn-sm dropdown-toggle'])[1]")
    public  WebElement printDropdown;

    @FindBy(xpath = "(//ul[@class='dropdown-menu'])[3]//li[2]//a")
    public  WebElement deliverySlip;

    @FindBy(xpath = "//div[@class ='o_report_no_edit_mode']//button")
    public WebElement printButton;

    @FindBy(xpath = "//div[@class='o_notification_content']")
    public WebElement notifficationMEssage;


    @FindBy(xpath = "(//div[@class='btn-group o_dropdown'])[3]//button/span[2]")
    public WebElement filter;

    @FindBy(xpath = "//a[contains(text(),'Draft')]")
    public  WebElement draft;

     @FindBy(xpath = "//a[contains(text(),'Ready')]")
     public  WebElement ready;

    @FindBy(xpath = "//a[contains(text(),'Waiting Availability')]")
       public WebElement waitingforVailabilty;

    @FindBy(xpath = "(//div[@class='o_facet_values']//span)[2]")
    public WebElement message2;


    @FindBy(xpath = "//tbody//td[3]")
    public List<WebElement> ascending;


    public boolean isInOrder() {
        boolean restult = false;
        for (int i = 0; i < ascending.size() - 1; i++) {
            if (ascending.get(i).getText().compareTo(ascending.get(i + 1).getText()) < 0) {
                return true;
            }
        }
        return false;
    }


    @FindBy(xpath = "//th[@class='o_column_sortable']")
    public List<WebElement> organizingIcons;

}
