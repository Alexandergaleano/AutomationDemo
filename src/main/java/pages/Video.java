package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Video {
    private WebDriver driver;

    @FindBy(how = How.XPATH,using ="//*[@id=\"header\"]/nav/div/div[2]/ul/li[7]/a")
    WebElement openVideo;

    @FindBy(how = How.XPATH,using ="//*[@id=\"header\"]/nav/div/div[2]/ul/li[7]/ul/li[1]/a")
    WebElement openVideoYouTube;

    @FindBy(how = How.XPATH,using ="/html/body/section/div[1]/div/div/iframe")
    WebElement clickButtonPlayVideoYouTube;

    public Video(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void clickVideo(){
        clickOnElement(openVideo);
    }
    public void clickVideoYouTube(){
        clickOnElement(openVideoYouTube);
    }

    public void clickButtonVideoYouTube(){
        clickOnElement(clickButtonPlayVideoYouTube);
    }


    public void clickOnElement(WebElement element){
        element.click();
    }
}
