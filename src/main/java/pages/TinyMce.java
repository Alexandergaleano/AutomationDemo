package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TinyMce {
    private WebDriver driver;

    @FindBy(how = How.XPATH,using ="//*[@id=\"header\"]/nav/div/div[2]/ul/li[8]/ul/li[1]/a")
    WebElement openTinyMce;

    @FindBy(how = How.XPATH,using ="//*[@id=\"mce_0_ifr\"]")
    WebElement textArea;

    public TinyMce(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOpenopenTinyMce(){
        clickOnElement(openTinyMce);
    }
    public void sendTextArea(String text){
        sendText(textArea,text);
    }

    public void clickOnElement(WebElement element){
        element.click();
    }
    public void sendText(WebElement element,String text){
        element.sendKeys(text);
    }
}
