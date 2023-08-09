package pages.Auth;

import common.MailReader;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.base.BasePage;

import javax.mail.MessagingException;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import static constants.Constant.TimeOutVariables.EXPLICIT_WAIT;
import static constants.Constant.TimeOutVariables.IMPLICIT_WAIT;

public class RegIPRO extends BasePage {
    public RegIPRO(WebDriver driver) {
        super(driver);
    }

    WebDriverWait wait = new WebDriverWait(driver, IMPLICIT_WAIT);

    By allClear = By.xpath("//span[contains(.,'Все понятно')]");
    By allRight = By.xpath("//span[contains(.,'Все верно')]");
    By enterButton = By.xpath("//button[@data-testid=\"authorization-button\"]");
    By regForIPRO = By.xpath("//a[@data-testid=\"go-to-registration-button\"][2]");
    By inputEmail = By.xpath("//input[@name=\"email\"]");
    By btnSendCode = By.xpath("//button[@class=\"styles_btn__SDghj\"]");
    By inputCode = By.xpath("//input[@name=\"smsCode\"]");

    By btnCont = By.xpath("//button[text()=\"Продолжить\"]");


    public RegIPRO firstStepEmail(String email){
        wait.until(ExpectedConditions.visibilityOfElementLocated(allClear));
        wait.until(ExpectedConditions.visibilityOfElementLocated(allRight));
        driver.findElement(allClear).click();
        driver.findElement(allRight).click();
        driver.findElement(enterButton).click();
        driver.findElement(regForIPRO).click();
        driver.findElement(inputEmail).clear();
        driver.findElement(inputEmail).sendKeys(email);
        driver.findElement(btnSendCode).click();
        return this;
    }
    public RegIPRO firstStepCode(String email) throws MessagingException, IOException {
        String code = MailReader.fetchLast5Messages(email, "20101999dN");
        driver.manage().timeouts().implicitlyWait(EXPLICIT_WAIT, TimeUnit.SECONDS);
        driver.findElement(inputCode).clear();
        driver.findElement(inputCode).sendKeys(code);
        driver.manage().timeouts().implicitlyWait(EXPLICIT_WAIT, TimeUnit.SECONDS);
        driver.findElement(btnCont).click();
        return this;
    }
}
