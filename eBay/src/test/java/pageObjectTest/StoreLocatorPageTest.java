package pageObjectTest;

import browserDriver.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObject.HomePage;
import pageObject.StoreLocatorPage;

public class StoreLocatorPageTest extends BrowserDriver  {
    HomePage homePage = null;
    StoreLocatorPage storeLocatorPage = null;

    @BeforeMethod
    public void initializeElements(){
        homePage = PageFactory.initElements(driver, HomePage.class);
        storeLocatorPage = PageFactory.initElements(driver, StoreLocatorPage.class);
    }
    @Test
    public void enterZip(){
        homePage.clickOnStore();
        storeLocatorPage.sendText();
        storeLocatorPage.clickSubmitButton();
        String actualErrorMessage = storeLocatorPage.getErrorMessage();
        Assert.assertEquals(actualErrorMessage, "We can't find an exact match. Did you mean...");

    }
}
