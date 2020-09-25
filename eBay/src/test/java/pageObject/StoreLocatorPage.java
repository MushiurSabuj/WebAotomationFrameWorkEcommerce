package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class StoreLocatorPage {
    @FindBy (how = How.ID, using = "search")
    WebElement searchLocation;

    @FindBy(how = How.CLASS_NAME, using = "cvs-storeLoc-searchBtn")
    WebElement submitButton;

    @FindBy (how = How.CSS, using = "We can't find an exact match. Did you mean...")
    WebElement errorMessage;

    public void sendText(){
        TestLogger.log("log the zip code");
        searchLocation.sendKeys("1137");
        TestLogger.log("zip code enter into the box");
    }

    public void clickSubmitButton(){
        TestLogger.log("Click Submit Button") ;
        submitButton.click();
        TestLogger.log("Clicked Submit Button");
    }

    public String getErrorMessage(){
        String message = errorMessage.getText();
        return message;

    }
}
