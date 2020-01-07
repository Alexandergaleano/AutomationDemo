package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Modals {
    private WebDriver driver;

    @FindBy(how = How.LINK_TEXT,using ="More")
    WebElement openMore;

    @FindBy(how = How.LINK_TEXT,using ="Modals")
    WebElement openModals;

    @FindBy(how = How.XPATH,using ="/html/body/section/div[1]/div[1]/div/div[2]/a")
    WebElement openBootstrapModal;

    @FindBy(how = How.XPATH,using ="//*[@id=\"myModal\"]/div/div/div[3]/button[2]")
    WebElement saveChanges;

    @FindBy(how = How.XPATH,using ="/html/body/section/div[1]/div[2]/div/div[2]/a")
    WebElement multipleModals;

    @FindBy(how = How.XPATH,using ="//*[@id=\"myModalMulti\"]/div/div/div[3]/a")
    WebElement myMultipleModals;

    @FindBy(how = How.XPATH,using ="//*[@id=\"myModal2\"]/div/div/div[6]/a[2]")
    WebElement saveChangesMyModals;


    public Modals(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickMore(){
        clickOnElement(openMore);
    }

    public void clickModals(){
        clickOnElement(openModals);
    }

    public void clickBootstrapModal(){
        clickOnElement(openBootstrapModal);
    }

    public void clickSaveChanges(){
        clickOnElement(saveChanges);
    }

    public void clickMultipleModals(){
        clickOnElement(multipleModals);
    }

    public void clickMymultipleModals(){
        clickOnElement(myMultipleModals);
    }

    public void clickSaveChangesMyModals(){
        clickOnElement(saveChangesMyModals);
    }

    public void clickOnElement(WebElement element){
        element.click();
    }
}
