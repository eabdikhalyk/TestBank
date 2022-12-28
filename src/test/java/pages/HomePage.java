package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    By registerLink = By.cssSelector("#loginPanel > p:nth-child(3) > a");
    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    public void clickToRegister(){
        driver.findElement(registerLink).click();
    }
}
