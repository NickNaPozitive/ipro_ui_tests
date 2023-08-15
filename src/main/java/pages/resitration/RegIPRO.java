package pages.resitration;

import common.MailReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.base.BasePage;

import javax.mail.MessagingException;
import java.io.IOException;
import static common.Config.BROWSER_AND_PLATFORM;


import static constants.Constant.PASSWORD_EMAIL;
import static constants.Constant.TimeOutVariables.EXPLICIT_WAIT;
import static constants.Constant.TimeOutVariables.IMPLICIT_WAIT;

public class RegIPRO extends BasePage {
    public RegIPRO(WebDriver driver) {
        super(driver);
    }
    WebDriverWait wait = new WebDriverWait(driver, IMPLICIT_WAIT);
    ChromeOptions options = new ChromeOptions();

    By allClear = By.xpath("//span[contains(.,'Все понятно')]");
    By allRight = By.xpath("//span[contains(.,'Все верно')]");
    By enterButton = By.xpath("//button[@data-testid=\"authorization-button\"]");
    By regForIPRO = By.xpath("//a[@data-testid=\"go-to-registration-button\"][2]");
    By inputEmail = By.xpath("//input[@name=\"email\"]");
//    By btnSendCode = By.xpath("//div[2]/button[@class=\"styles_btn__SDghj\"]");
    By btnSendCode = By.xpath("/html/body/div[3]/div[3]/div[2]/div[2]/button");
    By inputCode = By.xpath("//input[@name=\"smsCode\"]");
    By btnCont = By.xpath("//button[text()=\"Продолжить\"]");


    public RegIPRO firstStepEmail(String email){
        wait.until(ExpectedConditions.visibilityOfElementLocated(allClear));
        wait.until(ExpectedConditions.visibilityOfElementLocated(allRight));
        driver.findElement(allClear).click();
        driver.findElement(allRight).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(enterButton));
        driver.findElement(enterButton).click();
        driver.findElement(regForIPRO).click();
        driver.findElement(inputEmail).clear();
        driver.findElement(inputEmail).sendKeys(email);
        driver.findElement(btnSendCode).click();
        return this;
    }
    public RegIPRO firstStepCode(String email) throws MessagingException, IOException {
        String code = MailReader.getPassFromMail(email, PASSWORD_EMAIL);
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputCode));
        driver.findElement(inputCode).clear();
        driver.findElement(inputCode).sendKeys(code);
        wait.until(ExpectedConditions.visibilityOfElementLocated(btnCont));
        driver.findElement(btnCont).click();
        return this;
    }
}