package pageObjectTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObject.HomePage;
import pageObject.SignInPage;
import pageObject.StoreLocatorPage;

public class SignInPageTest {
    WebDriver driver = null;

    HomePage homePage = null;
    StoreLocatorPage storeLocatorPage = null;
    SignInPage signInPage = null;

    @BeforeMethod
    public void initializeElements() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        storeLocatorPage = PageFactory.initElements(driver, StoreLocatorPage.class);
        signInPage = PageFactory.initElements(driver, SignInPage.class);
    }

    @Test
    public void clickSignIn() {
        signInPage.sendEmail();
        signInPage.sendPassword();
        signInPage.createSignIn();
        signInPage.getError();
        String actualErrorMessage = signInPage.getError();
        Assert.assertEquals(actualErrorMessage, "Enter a valid email address");
        Assert.assertEquals(actualErrorMessage, "Enter a valid password");

    }
}
