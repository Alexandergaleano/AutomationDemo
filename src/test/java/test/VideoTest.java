package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationtestingIndex;
import pages.Video;
import util.Constants;

public class VideoTest {

    String baseUrl = "http://demo.automationtesting.in/Index.html";

    private WebDriver driver;
    Actions action;
    ChromeOptions options = new ChromeOptions();

    @Before // preparacion de pruebas
    public void setUp() throws Exception {
        System.setProperty ("webdriver.chrome.driver", Constants.PATHDRIVERCHROME +"chromedriver.exe");
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        action = new Actions(driver);
    }

    @Test // pruebas
    public void video()throws Exception {
        driver.get(baseUrl);
        AutomationtestingIndex automationtestingIndex = new AutomationtestingIndex(driver);
        Video video = new Video(driver);
        automationtestingIndex.clicklinkSkipSingIn();
        video.clickVideo();
        video.clickVideoYouTube();
        video.clickButtonVideoYouTube();

    }
    @After
    public void close() throws Exception {
        Thread.sleep(7000);
        driver.close();
    }
}
