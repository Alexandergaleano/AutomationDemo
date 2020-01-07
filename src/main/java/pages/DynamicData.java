package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DynamicData {
    private WebDriver driver;

    @FindBy(how = How.LINK_TEXT,using ="More")
    WebElement openMore;

    @FindBy(how = How.LINK_TEXT,using ="Dynamic Data")
    WebElement openDynamicData;

    @FindBy(how = How.ID,using ="save")
    WebElement clickButtonDynamicData;

    public DynamicData(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickMore(){
        clickOnElement(openMore);
    }

    public void clickDynamicData(){
        clickOnElement(openDynamicData);
    }
    public void clickGetDynamicData(){
        clickOnElement(clickButtonDynamicData);
    }

    public void clickOnElement(WebElement element){
        element.click();
    }
}
