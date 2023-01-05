package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    By userName = By.cssSelector("input[name=username]");
    By password = By.cssSelector("input[name=password]");
    By buttomLogin = By.cssSelector("input.button");
    By registerLink = By.cssSelector("#loginPanel > p:nth-child(3) > a");
    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    public void enterUserName(String text){
        driver.findElement(userName).sendKeys(text);
    }
    public void enterPassword(String text){
        driver.findElement(password).sendKeys(text);
    }
    public void clickToLogin(){
        driver.findElement(buttomLogin).click();
    }
    public void clickToRegister(){
        driver.findElement(registerLink).click();
    }
}
