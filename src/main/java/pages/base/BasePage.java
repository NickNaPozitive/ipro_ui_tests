package pages.base;

import org.openqa.selenium.WebDriver;
import pages.catalog.CatalogTileCardSaveFilter;

import java.util.concurrent.TimeUnit;

import static constants.Constant.TimeOutVariables.EXPLICIT_WAIT;

public class BasePage {
    protected WebDriver driver;


    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public void open(String url){
        driver.get(url);
    }

    public BasePage waiter(){
        driver.manage().timeouts().implicitlyWait(EXPLICIT_WAIT, TimeUnit.SECONDS);
        return this;
    }
}
