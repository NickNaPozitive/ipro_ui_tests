package tests.base;

import common.CommonActions;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.WebDriver;
import pages.resitration.RegIPRO;
import pages.IPROHome.IPROHomePage;
import pages.base.BasePage;
import pages.catalog.*;
import pages.seo.HeaderSEO;
import pages.seo.MainPageSEO;
import pages.seo.TagsSEO;


//import static common.Config.BROWSER_AND_PLATFORM;
import java.time.Duration;

import static common.Config.HOLD_BROWSER_OPEN;

public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected IPROHomePage iproHomePage = new IPROHomePage(driver);
    protected CatalogTileCard catalogTileCard = new CatalogTileCard(driver);
    protected CatalogTileCardSearch catalogTileCartSearch = new CatalogTileCardSearch(driver);
    protected CatalogTileCardBrand catalogTileCartBrand = new CatalogTileCardBrand(driver);
    protected CatalogTileCardCategory catalogTileCardCategory = new CatalogTileCardCategory(driver);
    protected CatalogTileCardSaveFilter catalogTileCardSaveFilter = new CatalogTileCardSaveFilter(driver);
    protected RegIPRO regIPRO = new RegIPRO(driver);
    protected HeaderSEO headerSEO = new HeaderSEO(driver);
    protected MainPageSEO mainPage = new MainPageSEO(driver);
    protected TagsSEO tags = new TagsSEO(driver);


    @AfterEach
    public void close(){
        if(HOLD_BROWSER_OPEN){
            driver.manage().deleteAllCookies();
            driver.close();
            driver.quit();
        }
    }
}
