package pageObject;

import browserDriver.BrowserDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class HomePage {
    WebDriver driver = null;

    @FindBy(how = How.ID, using = "searchbox")
    WebElement searchBox;

    @FindBy (how = How.CLASS_NAME, using = "locator desktop-only guest-locator ng-star-inserted")
    WebElement storeLocator;

    public void clickOnStore() {
        storeLocator.click();
        TestLogger.log("Click storeLocator Button");
        //getPageTitle();
    }

    public String getPageTitle(){
        String pageTitle = driver.getTitle();
        TestLogger.log("Page Title: " + pageTitle);
        return pageTitle;

    }
    public void search(){
        searchBox.sendKeys("water");
    }
}
