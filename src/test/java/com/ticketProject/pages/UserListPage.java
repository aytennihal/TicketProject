package com.ticketProject.pages;

import com.ticketProject.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserListPage extends BasePage {

    @FindBy(xpath = "//*[@id='firstname']")
    public WebElement firstNameButton;

    @FindBy(xpath = "//*[@id='lastname']")
    public WebElement lastNameButton;

    @FindBy(xpath = "//*[@id='emailaddress']")
    public WebElement emailAdressButton;

    @FindBy(xpath = "//*[@id='phonenumber']")
    public WebElement phoneNumberButton;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement passwordButton;

    @FindBy(xpath = "//*[@id='repassword']")
    public WebElement repasswordButton;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement saveButton;

    public WebElement selectedRole(String role) {

        WebElement selectedRole;

        selectedRole = Driver.get().findElement(By.xpath("//*[@class='custom-select']//*[contains(text(),'" + role + "')]"));

        return selectedRole;

    }

    public WebElement selectedGender(String gender) {

        WebElement selectedGender;

        selectedGender = Driver.get().findElement(By.xpath("//*[@class='custom-control-label'][contains(text(),'"+gender+"')]"));
        selectedGender.click();

        return selectedGender;
    }
}