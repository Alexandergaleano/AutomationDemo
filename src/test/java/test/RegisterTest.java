package test;

import com.github.javafaker.Faker;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationtestingIndex;
import pages.PageRegister;
import util.Constants;

import java.util.Locale;

public class RegisterTest {

    private String EMAIL;
    private String FIRSTNAME;
    private String LASTNAME;
    private String ADDRESS;
    private String PHONENUMBER;

    String baseUrl = "http://demo.automationtesting.in/Index.html";
    private WebDriver driver;
    Actions action;
    ChromeOptions options = new ChromeOptions();

    @Before // preparacion de pruebas
    public void setUp() throws Exception {
        //Locale locale = new Locale("es-MX");
        Faker faker = new Faker();
        FIRSTNAME = faker.firstName();
        LASTNAME = faker.lastName();
        ADDRESS = faker.secondaryAddress();
        EMAIL = faker.firstName()+"@gmail.com";
        PHONENUMBER = faker.phoneNumber();
        System.setProperty ("webdriver.chrome.driver", Constants.PATHDRIVERCHROME +"chromedriver.exe");
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
        pageRegister.sendFirstName(FIRSTNAME);
        pageRegister.sendLastName(LASTNAME);
        pageRegister.sendAddress(ADDRESS);
        pageRegister.sendEmail(EMAIL);
        //pageRegister.sendPhone(PHONENUMBER);
        pageRegister.sendPhone("3005197829");
        pageRegister.selectGender();
        pageRegister.selectHobbie();
        pageRegister.selectMsdd();
        pageRegister.selectLanguage();
        pageRegister.clickBasic();
        pageRegister.clickSkill();
        pageRegister.selectSkill();
        pageRegister.clickBasic();
        pageRegister.clickCountrie();
        pageRegister.selectCountry();
        pageRegister.clickBasic();
        pageRegister.clickForm();
        pageRegister.selectCount();
        pageRegister.clickYearbox();
        pageRegister.selectYear();
        pageRegister.clickMonth();
        pageRegister.selectMonth();
        pageRegister.clickDay();
        pageRegister.selectDay();
        pageRegister.sendFirstPassword("La12345");
        pageRegister.sendSecondPassword("La12345");
        pageRegister.clickButtonSubmit();
    }
    @After
    public void close() throws Exception {
        Thread.sleep(5000);
        driver.close();
    }
}
