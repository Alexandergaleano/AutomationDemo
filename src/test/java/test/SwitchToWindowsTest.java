package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationtestingIndex;
import pages.SwitchToWindows;
import util.Constants;

public class SwitchToWindowsTest {

    String baseUrl2 = "http://demo.automationtesting.in/Windows.html";

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
    public void switchToWindows()throws Exception {
        driver.get(baseUrl2);
        AutomationtestingIndex automationtestingIndex = new AutomationtestingIndex(driver);
        SwitchToWindows switchToWindows = new SwitchToWindows(driver);
        //WebDriverWait wait = new WebDriverWait(driver, 5);
        automationtestingIndex.clicklinkSwitchTo();
        switchToWindows.clickOpenNewSeparateWindows();
        switchToWindows.clickButtonSeparateWindows();
        Thread.sleep(2000);
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle); // for para cambiarse entre ventanas
        }
        //System.out.println(driver.getCurrentUrl()); //mostrar la URL en la cual esta en el momento la ventana
        driver.manage().window().maximize();
        switchToWindows.selectDocumentation();
        switchToWindows.selectMobile();
        switchToWindows.clickSelectAPI();
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href=\"mobile/api/closeapp.php\"]")));
    }
    @After
    public void close() throws Exception {
        Thread.sleep(2000);
        driver.close();
    }
}
