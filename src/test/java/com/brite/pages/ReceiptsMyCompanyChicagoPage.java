package com.brite.pages;

import com.brite.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    @FindBy (xpath = "(//div[@class='o_input_dropdown']//input)[1]")
    public WebElement partner;

    @FindBy (xpath = "(//div[@class='o_searchview']//input)")
    public WebElement searchPartner;

    @FindBy (xpath = "(//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']/tbody/tr[1]/td[1])[2]")
    public WebElement searchPartnerResult;

//    @FindBy (xpath = "//div[@class='modal-footer']//button[1]")
//    public WebElement creatPartner;

    @FindBy (xpath = "(//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped o_editable_list']/tbody/tr[1]/td)[2]")
    public WebElement addItem;

    @FindBy (xpath = "//div[@class='o_field_widget o_field_many2one o_required_modifier']/div//input")
    public List<WebElement> itemLink;

    @FindBy (xpath = "(//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped o_editable_list']/tbody/tr[1]/td[3])//span")
    public WebElement price;

    @FindBy (xpath = "(//div[@class='o_input_dropdown'])[1]")
    public List<WebElement> activity;

    @FindBy (xpath = "//*[@class='note-editable panel-body']")
    public WebElement notes;

    @FindBy (xpath = "(//*[@class='modal-footer'])[3]//button[1]/span")
    public WebElement scheduleActivityBtn;

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
