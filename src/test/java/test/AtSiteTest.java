package test;

import com.github.javafaker.Faker;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import pages.AtSite;
import pages.AutomationtestingIndex;
import util.Constants;

public class AtSiteTest {

    private String EMAIL;

    String baseUrl = "http://demo.automationtesting.in/Index.html";
    private WebDriver driver;
    Actions action;
    ChromeOptions options = new ChromeOptions();

    @Before // preparacion de pruebas
    public void setUp() throws Exception {
        Faker faker = new Faker();
        EMAIL = faker.firstName()+"@gmail.com";
        System.setProperty ("webdriver.chrome.driver", Constants.PATHDRIVERCHROME +"chromedriver.exe");
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        action = new Actions(driver);
    }

    @Test // pruebas
    public void atSite()throws Exception {
        driver.get(baseUrl);
        AutomationtestingIndex automationtestingIndex = new AutomationtestingIndex(driver);
        AtSite atSite = new AtSite(driver);
        automationtestingIndex.clicklinkSkipSingIn();
        atSite.clickOpenPracticeSite();
        atSite.clickOpenAtSite();
        atSite.sendEmailAddress(EMAIL);
        atSite.clickButtonSubscribe();
    }
    @After
    public void close() throws Exception {
        Thread.sleep(5000);
        driver.close();
    }
}
