package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SwitchToWindows {
    private WebDriver driver;

    @FindBy(how = How.LINK_TEXT,using ="Open New Seperate Windows")
    WebElement openNewSeparateWindows;

    @FindBy(how = How.XPATH,using ="//*[@id=\"Seperate\"]/button")
    WebElement buttonSeparateWindows;

    @FindBy(how = How.LINK_TEXT,using ="Documentation")
    WebElement documentation;

    @FindBy(how = How.XPATH,using ="//*[@id=\"container\"]/header/div/div/div[2]/ul/li[2]/ul/li[2]/a")
    WebElement mobile;

    @FindBy(how = How.LINK_TEXT,using ="API")
    WebElement selectAPI;

    public SwitchToWindows(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOpenNewSeparateWindows(){
        clickOnElement(openNewSeparateWindows);
    }
    public void clickButtonSeparateWindows(){
        clickOnElement(buttonSeparateWindows);
    }
    public void selectDocumentation(){
        clickOnElement(documentation);
    }
    public void selectMobile(){
        clickOnElement(mobile);
    }

    public void clickSelectAPI(){
        clickOnElement(selectAPI);
    }

    public void clickOnElement(WebElement element){
        element.click();
    }

}
