package test;

import Pages.AutomationtestingIndex;
import Pages.PageRegister;
import Pages.PageWebTable;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class AutomationDemoSite {

    private String PATHDRIVER = "src/test/resources/drivers/";
    String baseUrl = "http://demo.automationtesting.in/Index.html";
    String baseUrl1 = "http://demo.automationtesting.in/WebTable.html";
    private WebDriver driver;
    Actions action;

    @Before // preparacion de pruebas
    public void setUp() throws Exception {
        System.setProperty ("webdriver.chrome.driver",PATHDRIVER+"chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        action = new Actions(driver);
    }

    @Test // pruebas
    public void register()throws Exception {
        driver.get(baseUrl);
        AutomationtestingIndex automationtestingIndex = new AutomationtestingIndex(driver);
        PageRegister pageRegister = new PageRegister (driver);
        automationtestingIndex.clicklinkSkipSingIn();
        pageRegister.registerForm("Alexander","Galeano","calle 11 19","alex@hotmail.com","3001129426","Al12345","Al12345");
    }

    @Test // pruebas
    public void webTable()throws Exception {
        driver.get(baseUrl1);
        AutomationtestingIndex automationtestingIndex = new AutomationtestingIndex(driver);
        PageWebTable pageWebTable = new PageWebTable(driver);
        automationtestingIndex.clicklinkWebTable();
        pageWebTable.editForm("alex12@hotmail.com","Felipe","Perez","3105206522");
    }
}



