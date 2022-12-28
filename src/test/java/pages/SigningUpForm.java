package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SigningUpForm {
    WebDriver driver;
    By firstName = By.id("customer.firstName");
    By lastName = By.id("customer.lastName");
    By address = By.id("customer.address.street");
    By city = By.id("customer.address.city");
    By state = By.id("customer.address.state");
    By zipCode = By.id("customer.address.zipCode");
    By ssn = By.id("customer.ssn");
    By username = By.id("customer.username");
    By password = By.id("customer.password");
    By confirmPassword = By.id("repeatedPassword");
    By buttonRegister = By.cssSelector("#customerForm input.button");
    public SigningUpForm(WebDriver driver){
        this.driver = driver;
    }

    public void enterFirstName(String text){
        driver.findElement(firstName).sendKeys(text);
    }
    public void enterLastName(String text){
        driver.findElement(lastName).sendKeys(text);
    }
    public void enterAddress(String text){
        driver.findElement(address).sendKeys(text);
    }
    public void enterCity(String text){
        driver.findElement(city).sendKeys(text);
    }
    public void enterState(String text){
        driver.findElement(state).sendKeys(text);
    }
    public void enterZipCode(String text){
        driver.findElement(zipCode).sendKeys(text);
    }
    public void enterSSN(String text){
        driver.findElement(ssn).sendKeys(text);
    }
    public void enterUserName(String text){
        driver.findElement(username).sendKeys(text);
    }
    public void enterPassword(String text){
        driver.findElement(password).sendKeys(text);
        driver.findElement(confirmPassword ).sendKeys(text);
    }
    public void clickToRegister(){
        driver.findElement(buttonRegister).click();
    }
}
