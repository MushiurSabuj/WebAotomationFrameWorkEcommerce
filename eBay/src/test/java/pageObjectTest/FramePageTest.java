package pageObjectTest;

import browserDriver.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObject.FramePage;
import pageObject.HomePage;

public class FramePageTest extends BrowserDriver  {

    HomePage homePage = null;
    FramePage framePage = null;

    @BeforeMethod
    public void initializeElements(){
        homePage = PageFactory.initElements(driver, HomePage.class);
        framePage = PageFactory.initElements(driver, FramePage.class);
    }
    @Test
    public void selectFrames(){
        homePage.search();
        framePage.clickFrame();
        framePage.enterFrameButton();
    }
}
