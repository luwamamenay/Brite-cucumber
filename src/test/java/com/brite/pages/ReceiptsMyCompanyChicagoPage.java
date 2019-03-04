package com.brite.pages;

import com.brite.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ReceiptsMyCompanyChicagoPage {

    public ReceiptsMyCompanyChicagoPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a/span[.='Receipts'])[1]")
    public WebElement receipts;

    @FindBy (xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']/tbody/tr[3]/td[5]")
    public WebElement receiptNumber;

    @FindBy (xpath = "//div[@class='o_form_buttons_view']//button[1]")
    public WebElement editButton;

    @FindBy (xpath = "//table[@class='o_group o_inner_group o_group_col_6']//button[1]")
    public WebElement openPartnerButton;

    @FindBy (xpath = "//*[@class='o_field_phone o_field_widget o_input']")
    public WebElement phoneNumber;

    @FindBy (xpath = "//*[@class='btn btn-sm btn-primary']")
    public WebElement saveButtonPartner;

    @FindBy (xpath = "(//div[@class='o_list_buttons']//button)[1]")
    public WebElement createButton;

    @FindBy (xpath = "(//div[@class='o_input_dropdown'])[1]")
    public WebElement partnerDropDown;

    @FindBy (xpath = "(//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content'])[1]/li[8] ")
    public WebElement searchMore;

    @FindBy (xpath = "(//div[@class='o_searchview']//input)")
    public WebElement searchPartner;

    @FindBy (xpath = "(//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']/tbody/tr[1]/td[1])[2]")
    public WebElement searchPartnerResult;

//    @FindBy (xpath = "//div[@class='modal-footer']//button[1]")
//    public WebElement createPartner;

    //@FindBy (xpath = "//*[@id=\"notebook_page_388\"]/div[1]/div[2]/table/tbody/tr[1]/td/a")

   @FindBy(linkText = "Add an item")
            public WebElement addItem;
    ////*[contains(text(),'Add an item')]

    @FindBy (xpath = "//div[@name='product_id']/div/input")
    public WebElement itemLink;

    @FindBy (xpath = "//ul[@id='ui-id-169']/li[@class='ui-menu-item']")
    public List<WebElement> listOfProducts;


    public List <WebElement> listOfProducts() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);
        //wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//ul[@id='ui-id-169']/li[@class='ui-menu-item']")));
        Thread.sleep(1000);
        List list = Driver.getDriver().findElements(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content']/li[@class='ui-menu-item']"));

        return list;
    }


    @FindBy (xpath = "//td[@class='o_data_cell o_list_number']/input")
    public WebElement price;

    @FindBy (xpath = "//div[@class='o_field_widget o_field_many2one o_required_modifier']/div")
    public WebElement activity;

    @FindBy (xpath = "(//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content']/li[@class='ui-menu-item'])[1]/a")
    public WebElement testDemo;

    public List <WebElement> listOfActivities() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);
        //wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//ul[@id='ui-id-169']/li[@class='ui-menu-item']")));
        Thread.sleep(1000);
        List list = Driver.getDriver().findElements(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content']/li[@class='ui-menu-item']"));

        return list;
    }

    //stoped here
    @FindBy (xpath = "//div[@class='o_cp_buttons']/div/button[2]")
    public WebElement todayBtnCalendar;

    @FindBy (xpath = "//*[@class='note-editable panel-body']")
    public WebElement notes;

    @FindBy (xpath = "(//*[@class='modal-footer'])[3]//button[1]/span")
    public WebElement scheduleActivityBtn;

    @FindBy (xpath = "//div[@class='ui-datepicker-title']/span[1]")
    public WebElement month;

//    @FindBy (xpath = "//div[@class='form-group']/input")
//    public WebElement summary;

    @FindBy (xpath = "//div[@class='modal-footer']/button[1]")
    public WebElement createSummary;

    @FindBy (xpath = "//a[@class='ui-datepicker-next ui-corner-all']/span[1]")
    public WebElement nextMonth;

    public WebElement getDate(String date) {
        int week = 0;
        int dateConvert = Integer.parseInt(date);
        if (dateConvert >= 1 && dateConvert <= 6){
            week = 1;
        }else if(dateConvert >= 7 && dateConvert <= 13){
            week = 2;
        }else if (dateConvert >= 14 && dateConvert <= 20){
            week = 3;
        }else if (dateConvert >= 21 && dateConvert <= 27){
            week = 4;
        }else if (dateConvert >= 28 && dateConvert <= 30){
            week = 5;
        }

        switch (week){
            case 1:
                week = 1;
            break;
            case 2:
                week = 2;
                break;
            case 3:
                week = 3;
                break;
            case 4:
                week = 4;
                break;
            case 5:
                week = 5;
                break;
        }

        return Driver.getDriver().findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[" + week + "]/td"));
        ////table[@class='ui-datepicker-calendar']/tbody/tr[1]/td
    }

    @FindBy (xpath = "//div[@class='btn-group btn-group-sm']/button[1]")
    public WebElement dayBtn;

    @FindBy (xpath = "//div[@class='fc-slats']/table/tbody/tr")
    public List<WebElement> time;

    @FindBy (xpath = "//*[@class='btn btn-sm btn-default o_button_import']")
    public WebElement importButton;

    @FindBy (xpath = "(//div[@class='o_form_buttons_edit']//button)[1]")
    public WebElement saveButtonReceipt;

    @FindBy (xpath = "(//div[@class='o_chatter_topbar']//button)[3]")
    public WebElement scheduleActivity;

    @FindBy (xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']/tbody/tr[2]/td[1]")
    public WebElement selectReceipt;

    @FindBy (xpath = "//div[@class='btn-group']/div[2]/button")
    public WebElement actionButton;

    @FindBy (xpath = "//div[@class='btn-group']/div[2]/ul/li[2]")
    public WebElement actionListDeleteBtn;

    @FindBy (xpath = "//*[@class='modal-body']")
    public WebElement deleteMessage;

    @FindBy (xpath = "//*[@class='o_list_buttons']//button[2]")
    public WebElement importButtonReceipt;

    @FindBy (xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']/thead/tr/th[3]")
    public WebElement partnerButton;

    @FindBy (xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']/thead/tr/th[4]")
    public WebElement scheduleDateButton;

    @FindBy (xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']/thead/tr/th[5]")
    public WebElement sourceDocumentButton;

    @FindBy (xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']/thead/tr/th[6]")
    public WebElement backOrderButton;

    @FindBy (xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']/thead/tr/th[7]")
    public WebElement statusButton;

    @FindBy (xpath = "//*[@class='btn-group btn-group-sm o_cp_switch_buttons']/button[2]")
    public WebElement kanbanButton;

    @FindBy (xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']/thead/tr/th[1]/div")
    public WebElement referencesButton;

    @FindBy (xpath = "//div[@class='btn-group btn-group-sm o_cp_switch_buttons']/button[3]")
    public WebElement calendarButton;

    @FindBy (xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']/tbody/tr/td[7]")
    public WebElement resultStatus;

    @FindBy (xpath = "//*[@title='Advanced Search...']")
    public WebElement advancedSearchBtn;

    @FindBy (xpath = "//*[@class='btn-group o_search_options'][1]/div[1]//button")
    public WebElement filterBtn;

    @FindBy(xpath = "//*[@class='btn-group o_search_options']/div[2]//button")
    public WebElement groupByBtn;

    @FindBy (xpath = "//*[@class='btn-group o_search_options']/div[3]//button")
    public WebElement favouritesBtn;

    @FindBy (xpath = "//*[@class='o_field_char o_field_widget o_readonly_modifier']")
    public WebElement newReceiptNumber;

    @FindBy (xpath = "//*[@class='o_calendar_buttons']//button[2]")
    public WebElement todayBtn;

}
