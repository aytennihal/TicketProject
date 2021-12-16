package com.ticketProject.step_definitions;

import com.ticketProject.pages.BasePage;
import com.ticketProject.pages.LoginPage;
import com.ticketProject.pages.UserListPage;
import com.ticketProject.utilities.BrowserUtils;
import com.ticketProject.utilities.ConfigurationReader;
import com.ticketProject.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;



public class UserListStepDefs {
    Driver driver = new Driver();

    UserListPage userListPage = new UserListPage();


        @And("user enter {string} to the First Name")
        public void userEnterToTheFirstName (String firstName){

            userListPage.firstNameButton.click();
            userListPage.firstNameButton.sendKeys(firstName);
        }

        @And("user enter {string} to the Last Name")
        public void userEnterToTheLastName (String lastName){

            userListPage.lastNameButton.click();
            userListPage.lastNameButton.sendKeys(lastName);
        }

        @And("user enter {string} to the Email Adress")
        public void userEnterToTheEmailAdress (String emailAdress){

            userListPage.emailAdressButton.click();
           userListPage.emailAdressButton.sendKeys(emailAdress);
           //if (emailAdress.contains("@gmail.com")) {
              // System.out.println("Kullanilabilir mail adresi");

           //}else {
           // String actualErrorMessage = userListPage.mailerrorMessage.getText();
            //   System.out.println(actualErrorMessage);
            //   Assert.assertEquals("Please enter email." , actualErrorMessage);
              // System.out.println(actualErrorMessage);
          // }

        }

        @And("user enter {string} to the Phone Number")
        public void userEnterToThePhoneNumber (String phoneNumber){

            userListPage.phoneNumberButton.click();
            userListPage.phoneNumberButton.sendKeys(phoneNumber);
        }

        @And("user enter {string} to the Password")
        public void userEnterToThePassword (String password){

            userListPage.passwordButton.click();
            userListPage.passwordButton.sendKeys(password);

        }

        @And("user enter {string} to the Password Confirmation")
        public void userEnterToThePasswordConfirmation (String passwordConfiguration){

            userListPage.repasswordButton.click();
            userListPage.repasswordButton.sendKeys(passwordConfiguration);
            System.out.println("Password configuration:" + passwordConfiguration);
            //Assert.assertEquals(password, passwordConfiguration);
            System.out.println("Assertion sonrasi");

            //Assert.assertTrue("Sifreler eslesiyor",password.equals(passwordConfiguration));

            //if (password.equals(passwordConfiguration)) {
            // System.out.println("Sifreler ayni");
            // } else {
            //    System.out.println("Sifreler ortusmuyor");
            //}
        }

        @And("user select a {string}")
        public void userSelectA (String gender){

            userListPage.selectedGender(gender).click();

            // System.out.println("Gender bolumunde");
            // userListPage.selectedGender(gender).click();
            // Select dropdown = new Select(userListPage.selectedGender(gender));
            // System.out.println("Gender Tikladi");

            //userListPage.selectedGender(gender).click();
        }

        @And("user select {string}")
        public void userSelect (String role){


            userListPage.selectedRole(role).click();

            ///Select dropdown = new Select(userListPage.selectRole);
            //dropdown.selectByVisibleText(role);
        }

        @And("user click {string}")
        public void userClick (String button){

            switch (button) {
                case "Save":
                    userListPage.saveButton.click();
                    break;
            }


        }

        @Then("user should be able to see new user with {string} under the User List")
        public void userShouldBeAbleToSeeNewUserWithUnderTheUserList (String emailAdress){

            Assert.assertTrue("Verify that new user is created",
                    userListPage.selectedUser(emailAdress).isDisplayed());        }

        @Given("user on user create page")
        public void userOnUserCreatePage () {
            Driver.get().get(ConfigurationReader.get("url"));
            new LoginPage().login.click();

            new BasePage().AdministrationModuleButton.click();
            new BasePage().userCreateButton.click();

            String title = Driver.get().getCurrentUrl();
            Assert.assertTrue(title.contains("user-create"));
            System.out.println("User Create Sayfasinda");

        }

    @When("user click delete button next to user {string}")
    public void userClickDeleteButtonNextToUser(String deleteEmail) {

            userListPage.selectedUserDelete(deleteEmail).click();
        System.out.println("Secilen kullanici silindi");

    }


    @When("user enter invalid {string} to the Email Adress")
    public void userEnterInvalidToTheEmailAdress(String emailName) {
            userListPage.emailAdressButton.sendKeys(emailName);
            userListPage.saveButton.click();

    }

    @Then("user should see {string} error message under mail box")
    public void userShouldSeeErrorMessageUnderMailBox(String expectedErrorMessage) {
            String actualErrorMessage = userListPage.mailerrorMessage.getText();
        System.out.println(actualErrorMessage);
        Assert.assertEquals(expectedErrorMessage,actualErrorMessage);
    }

    @When("user enter invalid {string} to  the Phone Number")
    public void userEnterInvalidToThePhoneNumber(String invalidPhoneNumber) {
       userListPage.phoneNumberButton.sendKeys(invalidPhoneNumber);
       userListPage.saveButton.click();
    }

    @Then("user should see {string} under Phone Number box")
    public void userShouldSeeUnderPhoneNumberBox(String expectedErrorMessage) {
            String actualErrorMessage = userListPage.numberErrorMessage.getText();
        System.out.println(actualErrorMessage);
        Assert.assertEquals(expectedErrorMessage,actualErrorMessage);
    }


    @Then("user should not see {string} in user list anymore")
    public void userShouldNotSeeInUserListAnymore(String deletedUser) {
        Driver.get().navigate().refresh();
        BrowserUtils.verifyElementNotDisplayed(By.xpath("//*[@class='table-responsive']//*[contains(text(),'mustafa@gmail.com')])"));
        System.out.println(deletedUser + "silindi");
    }
}