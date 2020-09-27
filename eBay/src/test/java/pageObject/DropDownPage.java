package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class DropDownPage {

    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/ul/li[11]/a")
    WebElement clickDropDown;

    @FindBy(how = How.ID, using = "dropdown")
    WebElement dropDown;

    public void selectOption(String optionValue){
        Select select = new Select(dropDown);
        select.selectByValue(optionValue);
    }

}
