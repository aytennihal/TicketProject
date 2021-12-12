package com.ticketProject.step_definitions;

import com.ticketProject.pages.BasePage;
import com.ticketProject.pages.LoginPage;
import com.ticketProject.pages.UserListPage;
import com.ticketProject.utilities.ConfigurationReader;
import com.ticketProject.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;



public class UserListStepDefs {
    Driver driver = new Driver();

    UserListPage userListPage= new UserListPage();

    @And("user enter {string} to the First Name")
    public void userEnterToTheFirstName(String firstName) {

        userListPage.firstNameButton.click();
        userListPage.firstNameButton.sendKeys(firstName);
    }

    @And("user enter {string} to the Last Name")
    public void userEnterToTheLastName(String lastName) {

        userListPage.lastNameButton.click();
        userListPage.lastNameButton.sendKeys(lastName);
    }

    @And("user enter {string} to the Email Adress")
    public void userEnterToTheEmailAdress(String emailAdress) {

        userListPage.emailAdressButton.click();
        userListPage.emailAdressButton.sendKeys(emailAdress);
    }

    @And("user enter {string} to the Phone Number")
    public void userEnterToThePhoneNumber(String phoneNumber) {

        userListPage.phoneNumberButton.click();
        userListPage.phoneNumberButton.sendKeys(phoneNumber);
    }

    @And("user enter {string} to the Password")
    public void userEnterToThePassword(String password) {

        userListPage.passwordButton.click();
        userListPage.passwordButton.sendKeys(password);
    }

    @And("user enter {string} to the Password Confirmation")
    public void userEnterToThePasswordConfirmation(String passwordConfiguration) {

        userListPage.repasswordButton.click();
        userListPage.repasswordButton.sendKeys(passwordConfiguration);

        String password = userListPage.passwordButton.getText();


        //Assert.assertTrue("Sifreler eslesiyor",password.equals(passwordConfiguration));

        if (password.equals(passwordConfiguration)) {
           System.out.println("Sifreler ayni");
        } else {
            System.out.println("Sifreler ortusmuyor");
        }
    }

    @And("user select a {string}")
    public void userSelectA(String gender) {

        userListPage.selectedGender(gender).click();

       // System.out.println("Gender bolumunde");
       // userListPage.selectedGender(gender).click();
       // Select dropdown = new Select(userListPage.selectedGender(gender));
       // System.out.println("Gender Tikladi");

        //userListPage.selectedGender(gender).click();
    }

    @And("user select {string}")
    public void userSelect(String role) {


        userListPage.selectedRole(role).click();

        ///Select dropdown = new Select(userListPage.selectRole);
        //dropdown.selectByVisibleText(role);
    }

    @And("user click {string}")
    public void userClick(String button) {

        switch (button) {
            case "Save":
                userListPage.saveButton.click();
                break;
        }




    }

    @Then("user should be able to see new user with {string} under the User List")
    public void userShouldBeAbleToSeeNewUserWithUnderTheUserList(String emailAdress) {
    }

    @Given("user on user create page")
    public void userOnUserCreatePage() {
        Driver.get().get(ConfigurationReader.get("url"));
        new LoginPage().login.click();

        new BasePage().AdministrationModuleButton.click();
        new BasePage().userCreateButton.click();

        String title = Driver.get().getCurrentUrl();
        Assert.assertTrue(title.contains("user-create"));
        System.out.println("User Create Sayfasinda");

    }
}
