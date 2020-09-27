package pageObjectTest;

import browserDriver.BrowserDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObject.HomePage;
import pageObject.InPutPage;
import pageObject.ContextMenuPage;

public class InPutPageTest extends BrowserDriver  {
    //WebDriver driver = null;

    HomePage homePage = null;
    InPutPage inPutPage = null;

    @BeforeMethod
    public void initializeElements() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        inPutPage = PageFactory.initElements(driver, InPutPage.class);
        //signInPage = PageFactory.initElements(driver, InPutPage.class);
    }

    @Test
    public void enterInputTest() {
        homePage.search();
        inPutPage.selectInput();
        inPutPage.enterInput();
        //signInPage.sendPassword();
        //signInPage.createSignIn();
        //signInPage.getError();
        //String actualErrorMessage = inPutPage.getError();
        //Assert.assertEquals(actualErrorMessage, "Enter a valid email address");
       // Assert.assertEquals(actualErrorMessage, "Enter a valid password");

    }
}
