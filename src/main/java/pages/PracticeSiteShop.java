package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PracticeSiteShop {
    private WebDriver driver;

    @FindBy(how = How.LINK_TEXT,using ="Practice Site")
    WebElement openPracticeSite;

    @FindBy(how = How.LINK_TEXT,using ="Shop")
    WebElement openShop;

    @FindBy(how = How.XPATH,using ="//*[@id=\"content\"]/ul/li[1]/a[2]")
    WebElement readMore;

    public PracticeSiteShop(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOpenPracticeSite(){
        clickOnElement(openPracticeSite);
    }

    public void clickOpenShop(){
        clickOnElement(openShop);
    }

    public void clickReadMore(){
        clickOnElement(readMore);
    }

    public void clickOnElement(WebElement element){
        element.click();
    }
}
