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

    @FindBy(xpath = "//*[contains(text(),'Please enter email.')]")
    public WebElement mailerrorMessage;

    @FindBy(xpath = "//*[contains(text(),'Please enter 10 digit mobile number.')]")
    public WebElement numberErrorMessage;

    @FindBy(xpath = "//*[@class='panel']")
    public WebElement userlListPanel;

    public WebElement selectedRole(String role) {

        WebElement selectedRole;

        selectedRole = Driver.get().findElement(By.xpath("//*[@class='custom-select']//*[contains(text(),'" + role + "')]"));

        return selectedRole;

    }

    public WebElement selectedGender(String gender) {

        WebElement selectedGender;

        selectedGender = Driver.get().findElement(By.xpath("//*[@class='custom-control-label'][contains(text(),'" + gender + "')]"));

        return selectedGender;
    }

    public WebElement selectedUserDelete(String emailname) {

        WebElement deletebutton;
        deletebutton = Driver.get().findElement(By.xpath("//a[@href='/admin/user-delete/"+emailname+"']//button[contains(text(), 'Delete')]"));
        return deletebutton;

    }

    public WebElement selectedUser(String emailAdress) {

        WebElement selectedUser;

        selectedUser = Driver.get().findElement(By.xpath("//*[contains(text(),'"+emailAdress+"')]"));

        return selectedUser;


    }




}