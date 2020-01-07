package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AtSite {
    private WebDriver driver;

    @FindBy(how = How.LINK_TEXT,using ="Practice Site")
    WebElement openPracticeSite;

    @FindBy(how = How.LINK_TEXT,using ="AT Site")
    WebElement openAtSite;

    @FindBy(how = How.XPATH,using ="//input[@type='email']")
    WebElement sendEmail;

    @FindBy(how = How.XPATH,using ="//input[@type='submit']")
    WebElement subscribe;

    public AtSite(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOpenPracticeSite() {
        clickOnElement(openPracticeSite);
    }

    public void clickOpenAtSite() {
        clickOnElement(openAtSite);
    }

    public void sendEmailAddress( String email){
        sendText(sendEmail,email);
    }

    public void clickButtonSubscribe() {
        clickOnElement(subscribe);
    }

    public void clickOnElement(WebElement element){
        element.click();
    }

    public void sendText(WebElement element,String text){
        element.sendKeys(text);
    }
}
