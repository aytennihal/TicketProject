package com.ticketProject.pages;

import com.ticketProject.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProjectPage extends BasePage{

@FindBy (xpath = "//*[@id='projectName']")
    public WebElement projectName;

    @FindBy (xpath = "//*[@id='projectCode']")
    public WebElement projectCode;

@FindBy (xpath = "//*[contains(text(),'Select')]")
    public WebElement assignedManager;

@FindBy(xpath = "//*[@type='date'][1]")
    public WebElement startDate;

@FindBy(xpath = "//*[@type='date'][2]")
    public WebElement endDate;

@FindBy(xpath = "//textarea[@class='form-control']")
    public WebElement detailBox;

@FindBy(xpath = "//*[@type='submit']")
    public WebElement saveButton;

    //public WebElement selectedAdministration(String role) {

    // WebElement selected;

      //  selected = Driver.get().findElement(By.xpath("//*[@class='custom-select']//*[contains(text(),'" + role + "')]"));

      //  return selected;







}
