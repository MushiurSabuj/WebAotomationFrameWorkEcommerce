package pageObjectTest;

import browserDriver.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObject.HomePage;
import pageObject.ContextMenuPage;

public class ContextMenuPageTest extends BrowserDriver  {
    HomePage homePage = null;
    ContextMenuPage contextMenuPage = null;

    @BeforeMethod
    public void initializeElements(){
        homePage = PageFactory.initElements(driver, HomePage.class);
        contextMenuPage = PageFactory.initElements(driver, ContextMenuPage.class);
    }
    @Test
    public void enterZip(){
        homePage.search();
        contextMenuPage.clickDropDown();
        contextMenuPage.clickSubmitButton();
        //String actualErrorMessage = contextMenuPage.getErrorMessage();
        //Assert.assertEquals(actualErrorMessage, "We can't find an exact match. Did you mean...");

    }
}
