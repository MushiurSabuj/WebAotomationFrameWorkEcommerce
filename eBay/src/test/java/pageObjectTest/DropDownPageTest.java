package pageObjectTest;

import browserDriver.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObject.DropDownPage;
import pageObject.HomePage;

public class DropDownPageTest extends BrowserDriver {

    HomePage homePage = null;
    DropDownPage dropDownPage = null;

    @BeforeMethod
    public void initializeElements(){
        homePage = PageFactory.initElements(driver, HomePage.class);
        dropDownPage = PageFactory.initElements(driver, DropDownPage.class);
    }

    @Test
    public void dropDownTest(){
        homePage.search();
        dropDownPage.selectOption("2");

    }
}
