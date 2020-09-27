package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class ContextMenuPage {
    @FindBy (how = How.XPATH, using = "//*[@id=\"content\"]/ul/li[7]/a")
    WebElement menu;

    @FindBy(how = How.ID, using = "hot-spot")
    WebElement clickMenu;

    /*@FindBy (how = How.CSS, using = "We can't find an exact match. Did you mean...")
    WebElement errorMessage;*/

    public void clickDropDown(){
        TestLogger.log("Click the Menu Button");
        menu.click();
        TestLogger.log("Clicked the menu");
    }

    public void clickSubmitButton(){
        TestLogger.log("Click Submit Button") ;
        clickMenu.click();
        TestLogger.log("Clicked Submit Button");
    }
/*
    public String getErrorMessage(){
        String message = errorMessage.getText();
        return message;

    }*/
}
