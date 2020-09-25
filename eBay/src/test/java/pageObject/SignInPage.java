package pageObject;

import org.apache.maven.wagon.events.WagonEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class SignInPage {
    HomePage homePage = null;
    StoreLocatorPage storeLocatorPage = null;
    SignInPage signInPage = null;


    WebDriver driver = null;

    @FindBy(how = How.ID, using = "userEmail")
    WebElement email;

    @FindBy(how = How.CLASS_NAME, using = "ng-untouched ng-pristine ng-invalid")
    WebElement password;

    @FindBy(how = How.CLASS_NAME, using = "hero-signin")
    WebElement signIn;

    public void sendEmail() {
        TestLogger.log("sabuj987@gmail.com");
        email.sendKeys("sabuj9@gmail.com");
        TestLogger.log("log the zip code");
    }

    public void sendPassword() {
        TestLogger.log("enter password");
        password.sendKeys("12349");
        TestLogger.log("entered wrong password");
    }

    public void createSignIn() {
        TestLogger.log("click signIn");
        signIn.click();
        TestLogger.log("click signIn Button");
    }

    public String getError() {
        String enterSignIn = signIn.getText();
        return enterSignIn;
    }
}
