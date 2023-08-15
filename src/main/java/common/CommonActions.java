package common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static common.Config.BROWSER_AND_PLATFORM;
import static constants.Constant.TimeOutVariables.IMPLICIT_WAIT;


public class CommonActions extends Assert {

    public static WebDriver createDriver(){
        WebDriver driver = null;
        WebDriverManager.chromedriver().setup();
        switch (BROWSER_AND_PLATFORM){
            case "CHROME":
                ChromeOptions options= new ChromeOptions();
                options.setHeadless(false);
                options.addArguments("--remote-allow-origins=*");
                driver = new ChromeDriver(options);
                JavascriptExecutor executor = (JavascriptExecutor)driver;
                executor.executeScript("document.body.style.zoom = '1'");
                break;

            case "CHROME_w/t_js":
                WebDriverManager.chromedriver().setup();
                ChromeOptions optionsJS= new ChromeOptions();
                optionsJS.setHeadless(true);
                optionsJS.addArguments("--remote-allow-origins=*");
                Map<String, Object> prefs = new HashMap<>();
                prefs.put("profile.managed_default_content_settings.javascript", 2);
                optionsJS.setExperimentalOption("prefs", prefs);
                driver = new ChromeDriver(optionsJS);
                JavascriptExecutor executorJS = (JavascriptExecutor)driver;
                executorJS.executeScript("document.body.style.zoom = '1'");
                break;

            case "FIREFOX":
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions op= new FirefoxOptions();
                op.setHeadless(false);
                DesiredCapabilities dc = new DesiredCapabilities();
                dc.setJavascriptEnabled(false);
                op.merge(dc);
                driver = new FirefoxDriver(op);
                break;
            default:
                assertEquals(BROWSER_AND_PLATFORM, "qwe", "hello");
        }
        driver.manage().window().maximize();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
        return driver;
    }
}