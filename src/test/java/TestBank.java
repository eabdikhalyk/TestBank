import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

public class TestBank {
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
    }
    @Test
    public void registerAccount(){
        HomePage homePage = new HomePage(driver);
        homePage.clickToRegister();
    }

    @AfterMethod
    public void driverQuit(){
        driver.quit();
    }
}
