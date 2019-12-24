package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageWebTable {
    private WebDriver driver;
    Actions action;

    @FindBy(how = How.XPATH,using ="//div[contains(@id,'-0-uiGrid-000B-cell')]/user-click-select/div[1]/button")
    WebElement buttonEdit;
    @FindBy(how = How.XPATH,using ="//div[contains(@id,'-0-uiGrid-0005-cell')]/div[2]/input")
    WebElement clear;
    @FindBy(how = How.XPATH,using ="//div[contains(@id,'-0-uiGrid-0005-cell')]/div[2]/input")
    WebElement editEmail;
    @FindBy(how = How.XPATH,using ="//div[contains(@id,'-0-uiGrid-0006-cell')]/div[2]/input")
    WebElement editFirstName;
    @FindBy(how = How.XPATH,using ="//div[contains(@id,'-0-uiGrid-0008-cell')]/div[2]/input")
    WebElement editLastName;
    @FindBy(how = How.XPATH,using ="//div[contains(@id,'-0-uiGrid-0009-cell')]/div[2]/input")
    WebElement editPhone;
    @FindBy(how = How.XPATH,using ="//div[contains(@id,'-0-uiGrid-000B-cell')]/user-click-select/div[2]/cancel-click/button")
    WebElement clickCancel;
    @FindBy(how = How.XPATH,using ="//div[contains(@id,'-0-uiGrid-000B-cell')]/user-click-select/div/del-click/button")
    WebElement click;
    @FindBy(how = How.XPATH,using ="//div[contains(@id,'-0-uiGrid-000B-cell')]/user-click-select/div[1]/div/ul/li[1]/button")
    WebElement clickDelete;
    @FindBy(how = How.XPATH,using ="//div[contains(@id,'-0-uiGrid-000B-cell')]/user-click-select/div[1]/div/ul/li[1]/button")
    WebElement clickAlert;



    public PageWebTable(WebDriver driver) {
        this.driver = driver;
        action = new Actions(driver);
        PageFactory.initElements(driver, this);
    }

    public void editForm(String email,String firstName,String lastName,String phone) throws InterruptedException {

        doubleclickOnElement(buttonEdit);
        clickOnElement(clear);
        sendText(editEmail,email);
        clickOnElement(clear);
        sendText(editFirstName,firstName);
        clickOnElement(clear);
        sendText(editLastName,lastName);
        clickOnElement(clear);
        sendText(editPhone,phone);
        clickOnElement(clear);
        Thread.sleep(1000);
        clickOnElement(clickCancel);
        clickRight(click);
        clickOnElement(clickDelete);
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    private void clickRight(WebElement actions) {
        action.contextClick(actions).build().perform();
    }


    private void doubleclickOnElement(WebElement actions) {
        action.doubleClick(actions).perform();
    }

    //Metodo generico para dar clic a un elemento
    public void clickOnElement(WebElement element){
        element.click();
    }

    //Metodo generico para enviar texto a los input
    public void sendText(WebElement element,String text){
        element.clear();
        element.sendKeys(text);
    }


}
