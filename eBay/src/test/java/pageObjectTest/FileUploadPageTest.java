package pageObjectTest;

import browserDriver.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObject.FileUploadPage;
import pageObject.HomePage;

public class FileUploadPageTest extends BrowserDriver {
    HomePage homePage = null;
    FileUploadPage fileUploadPage = null;

    @BeforeMethod
    public void initializeElements() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        fileUploadPage = PageFactory.initElements(driver, FileUploadPage.class);
    }
        @Test
        public void fileUploadTest(){
            homePage.search();
            String actualText = fileUploadPage.fileLoad();
            Assert.assertEquals(actualText, "File Uploaded!");
        }
    }
