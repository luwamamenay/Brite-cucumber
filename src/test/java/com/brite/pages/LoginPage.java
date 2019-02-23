package com.brite.pages;

import com.brite.utilities.ConfigurationReader;
import com.brite.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class    LoginPage{

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath ="//a[contains(.,'Demo')]")
    public WebElement selectDemo;

    @FindBy(id= "login")
    public WebElement email;

    @FindBy(id="password")
    public WebElement password;

    @FindBy (xpath = "//button[contains(.,'Log in')]")
    public WebElement submitBtn;

    @FindBy(xpath = "//button[.='Log in']")
    public WebElement login;


    public void login(String email ,String password){

        this.email.sendKeys(email);
        this.password.sendKeys(password);
        login.click();


    }



}
