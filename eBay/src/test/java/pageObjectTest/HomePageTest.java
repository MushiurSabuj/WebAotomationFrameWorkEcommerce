package pageObjectTest;

import browserDriver.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObject.HomePage;

public class HomePageTest extends BrowserDriver{
    HomePage homePage = null;

    @BeforeMethod
    public void initializeElements(){
        homePage =PageFactory.initElements(driver, HomePage.class);
    }
    @Test
    public void searchTest() {
        homePage.search();
    }
}


