package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationtestingIndex;
import pages.TestCases;
import util.Constants;

public class TextCasesTest {

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
    public void textCases()throws Exception {
        driver.get(baseUrl);
        AutomationtestingIndex automationtestingIndex = new AutomationtestingIndex(driver);
        TestCases textCases = new TestCases(driver);
        automationtestingIndex.clicklinkSkipSingIn();
        textCases.clickOpenPracticeSite();
        textCases.clickOpenTestCases();
        textCases.clickHomePage1();
        Thread.sleep(3000);
        textCases.clickHomePage12();
        Thread.sleep(3000);
        textCases.clickHomePage17();
    }
    @After
    public void close() throws Exception {
        Thread.sleep(3000);
        driver.close();
    }
}
