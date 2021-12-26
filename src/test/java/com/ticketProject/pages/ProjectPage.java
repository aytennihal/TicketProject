package com.ticketProject.pages;

import com.ticketProject.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProjectPage extends BasePage{

@FindBy (xpath = "//*[@id='projectname']")
    public WebElement projectName;

    @FindBy (xpath = "//*[@id='projectcode']")
    public WebElement projectCode;


@FindBy(xpath = "//*[@id='startDate']")
    public WebElement startDate;

@FindBy(xpath = "//*[@id='endDate']")
    public WebElement endDate;

@FindBy(xpath = "//textarea[@class='form-control']")
    public WebElement detailBox;

@FindBy(xpath = "//*[@type='submit']")
    public WebElement saveButton;

    public WebElement selectedManager(String role) {



        return Driver.get().findElement(By.xpath("//*[@id='assignedManager']//*[contains(text(),'"+role+"')]"));

    }


}
