package com.brite.pages;

import com.brite.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Pos_OrderPage {

    private WebDriver driver;

    public Pos_OrderPage() {
        this.driver= Driver.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(className = "oe_menu_text")
    public WebElement Inventory;
    @FindBy(xpath = "//img/logo2.png")
    public WebElement OdOO;
    @FindBy(xpath = "//a[2]")
    public WebElement BriteErpDemo;
    @FindBy(xpath="//div[7]/div[1]/div[@class='o_kanban_card_header' and 1]/div" +
            "[@class='o_kanban_card_header_title' and 1]/div[@class='o_primary' and 1]/a[@class=' oe_kanban_action oe_kanban_action_a' and 1]/span[1]")
    public WebElement PoSOrderTextLink;
    @FindBy(xpath= "//button[@class='btn btn-primary btn-sm o_list_button_add']")
    public WebElement CreateButton;
    @FindBy(id = "o_field_input_136")
    public WebElement Partnerdropdown;
    @FindBy(className = "o_dropdown_button")
    public WebElement DropDownbutton;
    @FindBy(className = "fa fa-external-link btn btn-default o_external_button")
    public WebElement LinkButton;
    @FindBy(xpath = "//li[@id='ui-id-50']/a[1]")
    public WebElement CreateOreditOption;
    @FindBy(id = "o_field_input_141")
    public WebElement Source_Document;
    @FindBy(xpath = "//div[1]/label[@class='o_form_label' and 1]")
    public WebElement IndividualRadio;
    public WebElement CompanyRadio;
    @FindBy(id = "o_field_input_181")
    public WebElement Name;
    @FindBy(className = "img img-responsive")
    public WebElement PartnerImage;
    String Imagesrc="/web/static/src/img/placeholder.png";
    @FindBy(id = "o_field_input_185")
    public WebElement Street1;
    @FindBy(id = "o_field_input_186")
    public WebElement Street2;
    @FindBy(id = "o_field_input_187")
    public WebElement City;
    @FindBy(xpath= "//input[@id='o_field_input_431']")
    public WebElement StateDropDown;
    @FindBy(id = "o_field_input_189")
    public WebElement ZipCode;
    @FindBy(id = "o_field_input_190")
    public WebElement Country;
    @FindBy(id = "o_field_input_191")
    public WebElement TIN;
    @FindBy(id = "o_field_input_192")
    public WebElement TagsDropdown;
    @FindBy(id = "o_field_input_194")
    public  WebElement phone;
    @FindBy(id = "o_field_input_195")
    public  WebElement mobile;
    @FindBy(id = "o_field_input_197")
    public  WebElement email;
    @FindBy(id = "o_field_input_198")
    public  WebElement website;
    @FindBy(id = "o_field_input_200")
    public WebElement lang;
    @FindBy(className = "btn btn-sm oe_stat_button")
    public  WebElement UnpublishedOnWebsitebutton;
    public  WebElement Active;
    public  WebElement Invoiced;
    @FindBy(className = "btn btn-sm btn-primary")
    public WebElement Save;
    @FindBy(className = "btn btn-sm btn-default o_form_button_cancel")
    public WebElement discard;
    @FindBy(xpath = "//td[@class='o_field_x2many_list_row_add']/a[1]")
    public WebElement Add_an_item;
    @FindBy(className = "btn btn-sm btn-default oe_highlight")
    public WebElement Validate;
    @FindBy(className = "btn btn-sm btn-default")
    public WebElement Cancel;

}
