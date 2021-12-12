package com.ticketProject.step_definitions;
import com.ticketProject.pages.LoginPage;
import com.ticketProject.utilities.BrowserUtils;
import com.ticketProject.utilities.ConfigurationReader;
import com.ticketProject.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import io.cucumber.java.en.Given;

public class loginStepDefs {

    @Given("the user login with valid credentials")
    public void theUserLoginWithValidCredentials() {
        Driver.get().get(ConfigurationReader.get("url"));

        new LoginPage().login.click();

    }

    @Then("the user on dashboard page")
    public void theUserOnDashboardPage() {
String title = Driver.get().getCurrentUrl();
        System.out.println("Tikladi ve ana sayfada");
Assert.assertTrue(title.contains("welcome"));
    }

}
