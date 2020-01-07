package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AutomationtestingIndex {
    private WebDriver driver;

    @FindBy(how = How.XPATH,using = "//*[@id=\"btn2\"]")
    WebElement linkSkipSingIn;

    @FindBy(how = How.LINK_TEXT,using = "WebTable")
    WebElement linkWebTable;

    @FindBy(how = How.LINK_TEXT,using = "SwitchTo")
    WebElement linkSwitchTo;

    @FindBy(how = How.LINK_TEXT,using = "WYSIWYG")
    WebElement linkWYSIWYG;

    //Constructor
    public AutomationtestingIndex(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void clicklinkSkipSingIn(){
        linkSkipSingIn.click();
    }

    public void clicklinkWebTable(){
        linkWebTable.click();
    }
    public void clicklinkSwitchTo(){
        linkSwitchTo.click();
    }
    public void clicklinkWysiwyg(){
        linkWYSIWYG.click();
    }
}
