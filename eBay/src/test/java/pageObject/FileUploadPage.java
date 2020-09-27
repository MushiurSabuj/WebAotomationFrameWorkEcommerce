package pageObject;

import browserDriver.BrowserDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FileUploadPage extends BrowserDriver  {

    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/ul/li[18]/a")
    WebElement selectFileUpload;

    @FindBy(how = How.ID, using = "file-upload")
    WebElement chooseFile;

    @FindBy(how = How.ID, using = "file-submit")
    WebElement clickUploadButton;

    @FindBy (how = How.TAG_NAME, using = "h3")
    WebElement fileUploaded;

    public String fileLoad(){
        selectFileUpload.click();
        chooseFile.sendKeys("C:\\Users\\mushi\\OneDrive\\Desktop\\WebAutomationFrameWorkEcommerce\\eBay\\dataFile\\demoFile");
        clickUploadButton.click();
        String uploadTXTFile = fileUploaded.getText();
        return uploadTXTFile;
    }


    }
