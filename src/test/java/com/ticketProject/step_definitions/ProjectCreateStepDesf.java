package com.ticketProject.step_definitions;

import com.ticketProject.pages.BasePage;
import com.ticketProject.pages.LoginPage;
import com.ticketProject.pages.ProjectPage;
import com.ticketProject.utilities.ConfigurationReader;
import com.ticketProject.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;

public class ProjectCreateStepDesf {

    ProjectPage projectPage = new ProjectPage();

    @Given("user on project create page")
    public void userOnProjectCreatePage() {

        Driver.get().get(ConfigurationReader.get("url"));
        new LoginPage().login.click();

        new BasePage().AdministrationModuleButton.click();
        new BasePage().projectCreateButton.click();

        String title = Driver.get().getCurrentUrl();
        Assert.assertTrue(title.contains("project-create"));
        System.out.println("Project Create Sayfasinda");
    }

    @And("user enter {string} to the Project Name")
    public void userEnterToTheProjectName(String projectName) {
        projectPage.projectName.sendKeys(projectName);
    }

    @And("user enter {string} to the Project Code")
    public void userEnterToTheProjectCode(String projectCode) {
        projectPage.projectCode.sendKeys(projectCode);
    }

    @And("user select {string} from select Tab")
    public void userSelectFromSelectTab(String manager) {
        projectPage.assignedManager.click();
    }

    @And("user writes {string} to start date")
    public void userWritesToStartDate(String start) {
        projectPage.startDate.sendKeys(start);
    }

    @And("user writes {string} to end date")
    public void userWritesToEndDate(String endDate) {
        projectPage.endDate.sendKeys(endDate);
    }

    @And("user write {string} in Project Details tab")
    public void userWriteInProjectDetailsTab(String details) {
        projectPage.detailBox.sendKeys(details);
    }

    @And("user click {string} for save Project")
    public void userClickForSaveProject(String button) {
        projectPage.saveButton.click();
        System.out.println("Proje eklendi");
    }
}
