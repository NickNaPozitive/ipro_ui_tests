package tests.base;

import common.CommonActions;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.WebDriver;
import pages.Auth.RegIPRO;
import pages.IPROHome.IPROHomePage;
import pages.base.BasePage;
import pages.catalog.*;

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

    protected RegIPRO authIPRO = new RegIPRO(driver);


    @AfterEach
    public void close(){
        if(HOLD_BROWSER_OPEN){
            driver.manage().deleteAllCookies();
            driver.close();
            driver.quit();
        }
    }
}
