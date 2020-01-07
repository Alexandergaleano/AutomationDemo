package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TestCases {
    private WebDriver driver;

    @FindBy(how = How.LINK_TEXT,using ="Practice Site")
    WebElement openPracticeSite;

    @FindBy(how = How.LINK_TEXT,using ="Test Cases")
    WebElement openTestCases;

    @FindBy(how = How.XPATH,using ="//*[@id=\"accordion-222-sub_row_1-0-1-0-0\"]/ul/li[1]/div[1]/a")
    WebElement openHomePage1;

    @FindBy(how = How.XPATH,using ="//*[@id=\"accordion-222-sub_row_1-0-1-0-0\"]/ul/li[12]/div[1]/a")
    WebElement openHomePage12;

    @FindBy(how = How.XPATH,using ="//*[@id=\"accordion-222-sub_row_1-0-1-0-0\"]/ul/li[17]/div[1]/a")
    WebElement openHomePage17;




    public TestCases(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOpenPracticeSite() {
        clickOnElement(openPracticeSite);
    }

    public void clickOpenTestCases() {
        clickOnElement(openTestCases);
    }

    public void clickHomePage1() {
        clickOnElement(openHomePage1);
    }
    public void clickHomePage12() {
        clickOnElement(openHomePage12);
    }
    public void clickHomePage17() {
        clickOnElement(openHomePage17);
    }

    public void clickOnElement(WebElement element){
        element.click();
    }

}
