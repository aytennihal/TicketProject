package com.ticketProject.pages;

import com.ticketProject.utilities.BrowserUtils;
import com.ticketProject.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {


    @FindBy (xpath = "//*[@class='nav-link active']")
    public WebElement AdministrationModuleButton;

    @FindBy(xpath = "//*[@href='/admin/user-create']")
    public WebElement userCreateButton;

    @FindBy(xpath = "//*[@href='/admin/project-create']")
    public WebElement projectCreateButton;


    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    /**
     *@return page name, for example: Dashboard
     */

    public String getPageTitle(){
        return Driver.get().getTitle();
    }




    /**
     * This method will navigate user to the specific module in zerobank application.
     * */
    public void navigateToPage(String pageName) {
        String pageLocator = "#appmenu>li[data-id='"+pageName+"']";

        try {
            BrowserUtils.waitForClickablility(By.cssSelector(pageLocator), 5);
            WebElement pageElement = Driver.get().findElement(By.cssSelector(pageLocator));
            new Actions(Driver.get()).moveToElement(pageElement).click().perform();
            //new Actions(Driver.get()).moveToElement(pageElement).pause(200).doubleClick(pageElement).build().perform();
        } catch (Exception e) {
            BrowserUtils.clickWithWait(By.cssSelector(pageLocator), 5);
        }
    }

    /*
    this method navigates you to any of specific file which are located left side
     */
    public void navigateToFolderWhichAreLocatedLeftSide(String text){
        String locator = "//a[.='" + text + "']";
        WebElement locatorElement = Driver.get().findElement(By.xpath(locator));
        new Actions(Driver.get()).moveToElement(locatorElement).click().perform();
    }




}

