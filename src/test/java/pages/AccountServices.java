package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountServices {
    WebDriver driver;
    By titleOfAccountServices = By.className("title");
    public AccountServices(WebDriver driver){
        this.driver =  driver;
    }
    public String getTitleOfAccountServices(){
        return driver.findElement(titleOfAccountServices).getText();
    }
}
