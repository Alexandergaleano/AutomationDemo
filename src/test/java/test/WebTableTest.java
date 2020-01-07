package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationtestingIndex;
import pages.PageRegister;
import pages.PageWebTable;
import util.Constants;
import com.github.javafaker.Faker;



public class WebTableTest {

    private String EMAIL;
    private String FIRSTNAME;
    private String LASTNAME;
    private String PHONENUMBER;

    String baseUrl1 = "http://demo.automationtesting.in/WebTable.html";
    private WebDriver driver;
    Actions action;
    ChromeOptions options = new ChromeOptions();

    @Before // preparacion de pruebas
    public void setUp() throws Exception {
        Faker faker = new Faker();
        EMAIL = faker.firstName()+"@gmail.com";
        FIRSTNAME = faker.firstName();
        LASTNAME = faker.lastName();
        PHONENUMBER = faker.phoneNumber();
        System.setProperty ("webdriver.chrome.driver", Constants.PATHDRIVERCHROME +"chromedriver.exe");
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        action = new Actions(driver);
    }

    @Test // pruebas
    public void webTable()throws Exception {
        driver.get(baseUrl1);
        AutomationtestingIndex automationtestingIndex = new AutomationtestingIndex(driver);
        PageWebTable pageWebTable = new PageWebTable(driver);
        automationtestingIndex.clicklinkWebTable();
        pageWebTable.doubleclickOnElement();
        pageWebTable.clearElement();
        pageWebTable.sendEmail(EMAIL);
        pageWebTable.clearElement();
        pageWebTable.sendFirstName(FIRSTNAME);
        pageWebTable.clearElement();
        pageWebTable.sendLastName(LASTNAME);
        pageWebTable.clearElement();
        //pageWebTable.sendPhone(PHONENUMBER);
        pageWebTable.sendPhone("3005752191");
        pageWebTable.clearElement();
        pageWebTable.clickCancel();
        pageWebTable.clickRightButton();
        pageWebTable.clickDeleteButton();
        pageWebTable.Alert();
    }
    @After
    public void close() throws Exception {
        Thread.sleep(2000);
        driver.close();
    }
}
