package pages.IPROHome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class IPROHomePage extends BasePage {

    public IPROHomePage(WebDriver driver) {
        super(driver);
    }

    By regButton = By.xpath("//button[@data-testid=\"authorization-button\"]");
    By inputLogin = By.xpath("//input[@name=\"login\"]");
    By inputPass = By.xpath("//input[@name=\"password\"]");

    By submitBtn = By.xpath("//button[@data-testid=\"go-to-system\"]");

    By allClear = By.xpath("//span[contains(.,'Все понятно')]");
    By allRight = By.xpath("//span[contains(.,'Все верно')]");

    By name = By.xpath("//*[@id=\"composition-button\"]/span[1]/div[2]/span");


    public IPROHomePage enterAuthData(String login, String pass) {
        driver.findElement(allClear).click();
        driver.findElement(allRight).click();
        driver.findElement(regButton).click();
        driver.findElement(inputLogin).clear();
        driver.findElement(inputLogin).sendKeys(login);
        driver.findElement(inputPass).clear();
        driver.findElement(inputPass).sendKeys(pass);
        return this;
    }

    public IPROHomePage clearAlerts(){
        driver.findElement(allClear).click();
        driver.findElement(allRight).click();
        return this;
    }

    public IPROHomePage clickForLog() {
        driver.findElement(submitBtn).click();
        return this;
    }

    public IPROHomePage checkAuthComplete() {
        String namePerson = driver.findElement(name).getText();
        assertEquals("Дегтярёв Никита Витальевич", namePerson);
        return this;
    }
}
