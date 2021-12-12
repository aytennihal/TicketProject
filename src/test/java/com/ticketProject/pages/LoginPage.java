package com.ticketProject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.ticketProject.utilities.Driver;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends BasePage{

    @FindBy(xpath = "//*[@class='btn btn-primary btn-lg btn-block']")
    public WebElement login;

}
