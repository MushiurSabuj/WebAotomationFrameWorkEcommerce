package pageObject;

import browserDriver.BrowserDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class InPutPage extends BrowserDriver {
    HomePage homePage = null;
    InPutPage inPutPage = null;
    ContextMenuPage contextMenuPage = null;

    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/ul/li[27]/a")
    WebElement clickInput;

   @FindBy (how = How.XPATH, using = "//*[@id=\"content\"]/div/div/div/input")
    WebElement pressInput;

   // @FindBy(how = How.CLASS_NAME, using = "hero-signin")
   // WebElement signIn;*/

    public void selectInput() {
        //TestLogger.log("sabuj987@gmail.com");
        clickInput.click();
        TestLogger.log("log");

    }

    public void enterInput() {
        pressInput.click();
        TestLogger.log("entered wrong password");
    }
/*
    public void createSignIn() {
        TestLogger.log("click signIn");
        signIn.click();
        TestLogger.log("click signIn Button");
    }

    public String getError() {
        String enterSignIn = signIn.getText();
        return enterSignIn;
    }*/
}
