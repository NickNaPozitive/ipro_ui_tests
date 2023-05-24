package common;

import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static common.Config.BROWSER_AND_PLATFORM;
import static constants.Constant.TimeOutVariables.IMPLICIT_WAIT;


public class CommonActions extends Assert {

    public static WebDriver createDriver(){
        WebDriver driver = null;
        switch (BROWSER_AND_PLATFORM){
            case "CHROME":
                WebDriverManager.chromedriver().setup();
                ChromeOptions options= new ChromeOptions();
//                options.setHeadless(false);
                options.addArguments("--kiosk");
                driver= new ChromeDriver(options);
                JavascriptExecutor executor = (JavascriptExecutor)driver;
                executor.executeScript("document.body.style.zoom = '0.10'");
                break;
            case "MOZILLA":
                System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver");
                driver = new FirefoxDriver();
                break;
            default:
                assertEquals(BROWSER_AND_PLATFORM, "qwe", "hello");
        }
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
        return driver;
    }
}