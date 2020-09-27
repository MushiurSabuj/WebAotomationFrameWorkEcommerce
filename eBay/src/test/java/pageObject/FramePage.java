package pageObject;

import browserDriver.BrowserDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class FramePage extends BrowserDriver  {

    @FindBy (how = How.XPATH, using = "//*[@id=\"content\"]/ul/li[22]/a")
    WebElement frame;

    @FindBy (how = How.XPATH, using = "//*[@id=\"content\"]/div/ul/li[1]")
    WebElement nestedFrame;

    //@FindBy (how = How.XPATH, using = "//*[@id=\"content\"]/div/ul/li[1]/a")
   // WebElement clickNestedFrame;

    public void clickFrame(){
        frame.click();
        TestLogger.log("clicked Frame");
    }

    public void enterFrameButton(){
        nestedFrame.click();
    }


}
