package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageRegister {
    private WebDriver driver;

    @FindBy(how = How.XPATH,using = "//input[@placeholder='First Name']")
    WebElement txtFirstName;
    @FindBy(how = How.XPATH,using = "//input[@placeholder='Last Name']")
    WebElement txtLastName;
    @FindBy(how = How.XPATH,using = "//textarea [@rows='3']")
    WebElement txtAddress;
    @FindBy(how = How.XPATH,using = "//input[@type='email']")
    WebElement txtEmail;
    @FindBy(how = How.XPATH,using = "//input[@type='tel']")
    WebElement txtPhone;
    @FindBy(how = How.XPATH,using = "//input[@value='Male']")
    WebElement selectGender;
    @FindBy(how = How.XPATH,using = "//input[@value='Movies']")
    WebElement selectHobbies;
    @FindBy(how = How.ID,using = "msdd")
    WebElement clickmsdd;
    @FindBy(how = How.LINK_TEXT,using = "Spanish")
    WebElement selectLanguages;
    @FindBy(how = How.ID,using = "basicBootstrapForm")
    WebElement clickBasic;
    @FindBy(how = How.ID,using = "Skills")
    WebElement clickSkills;
    @FindBy(how = How.XPATH,using = "//option[@value='Java']")
    WebElement selectSkills;;
    @FindBy(how = How.ID,using = "countries")
    WebElement clickCountries;
    @FindBy(how = How.XPATH,using = "//option[@value='Colombia']")
    WebElement selectCountry;
    @FindBy(how = How.XPATH,using = "//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span")
    WebElement clickForm;;
    @FindBy(how = How.XPATH,using = "//option[@value='United States of America']")
    WebElement selectCountries;;
    @FindBy(how = How.ID,using = "yearbox")
    WebElement clickYearbox;
    @FindBy(how = How.XPATH,using = "//option[@value= '1991']")
    WebElement selectYear;
    @FindBy(how = How.XPATH,using = "//select[@placeholder='Month']")
    WebElement clickMonth;
    @FindBy(how = How.XPATH,using = "//option[@value= 'December']")
    WebElement selectMonth;
    @FindBy(how = How.XPATH,using = "//select[@placeholder='Day']")
    WebElement clickDay;
    @FindBy(how = How.XPATH,using = "//option[@value= '18']")
    WebElement selectDay;
    @FindBy(how = How.ID,using = "firstpassword")
    WebElement txtFirstPassword;
    @FindBy(how = How.ID,using = "secondpassword")
    WebElement txtSecondPassword;
    @FindBy(how = How.ID,using = "submitbtn")
    WebElement clickSubmit;

    public PageRegister(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void registerForm(String firstName,String lastName,String address,String email,String phone, String firstPassword, String secondPassword ){

        sendText(txtFirstName,firstName);
        sendText(txtLastName,lastName);
        sendText(txtAddress,address);
        sendText(txtEmail,email);
        sendText(txtPhone,phone);
        clickOnElement(selectGender);
        clickOnElement(selectHobbies);
        clickOnElement(clickmsdd);
        clickOnElement(selectLanguages);
        clickOnElement(clickBasic);
        clickOnElement(clickSkills);
        clickOnElement(selectSkills);
        clickOnElement(clickBasic);
        clickOnElement(clickCountries);
        clickOnElement(selectCountry);
        clickOnElement(clickBasic);
        clickOnElement(clickForm);
        clickOnElement(selectCountries);
        clickOnElement(clickYearbox);
        clickOnElement(selectYear);
        clickOnElement(clickMonth);
        clickOnElement(selectMonth);
        clickOnElement(clickDay);
        clickOnElement(selectDay);
        sendText(txtFirstPassword,firstPassword);
        sendText(txtSecondPassword,secondPassword);
        clickOnElement(clickSubmit);
    }

    //Metodo generico para dar clic a un elemento
    public void clickOnElement(WebElement element){
        element.click();
    }

    //Metodo generico para enviar texto a los input
    public void sendText(WebElement element,String text){
        element.clear();
        element.sendKeys(text);
    }


}

