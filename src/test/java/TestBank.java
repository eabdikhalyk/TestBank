import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AccountServices;
import pages.HomePage;
import pages.SigningUpForm;

import java.util.concurrent.TimeUnit;

public class TestBank {
    WebDriver driver;
    String firstName = "Peter";
    String lastName = "Bob";
    String address = "Brown street";
    String city = "Boston";
    String state = "Massachusetts";
    String zipCode = "53";
    String ssn = "0101";
    String userName = "PeterBob";
    String password = "pa$$w0rd";
    String titleOFSignUpForm = "Signing up is easy!";
    String messageOfRegistration = "Your account was created successfully. You are now logged in.";
    String titleOfAccountServices = "Accounts Overview";
    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
    }
    @Test(priority=1)
    public void registerAccount(){
        HomePage homePage = new HomePage(driver);
        SigningUpForm signUp = new SigningUpForm(driver);
        homePage.clickToRegister();
        signUp.enterFirstName(firstName);
        signUp.enterLastName(lastName);
        signUp.enterAddress(address);
        signUp.enterCity(city);
        signUp.enterState(state);
        signUp.enterZipCode(zipCode);
        signUp.enterSSN(ssn);
        signUp.enterUserName(userName);
        signUp.enterPassword(password);
        signUp.clickToRegister();
        Assert.assertEquals(signUp.getMessageOfRegistration(), messageOfRegistration);
    }

    @Test(priority=2)
    public void login(){
        HomePage homePage = new HomePage(driver);
        AccountServices accountServices =  new AccountServices(driver);
        homePage.enterUserName(userName);
        homePage.enterPassword(password);
        homePage.clickToLogin();
        Assert.assertEquals(accountServices.getTitleOfAccountServices(),titleOfAccountServices);
    }
    @AfterMethod
    public void driverQuit(){
        driver.quit();
    }
}
