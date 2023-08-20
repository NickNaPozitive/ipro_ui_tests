package tests.base;

import common.CommonActions;
import io.qameta.allure.Allure;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.logging.LogType;
import pages.resitration.RegIPRO;
import pages.IPROHome.IPROHomePage;
import pages.base.BasePage;
import pages.catalog.*;
import pages.seo.*;


import static common.Config.HOLD_BROWSER_OPEN;

@ExtendWith(Listener.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
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
    protected TagsPageSEO tagsPage = new TagsPageSEO(driver);
    protected CardPageSEO cardPage = new CardPageSEO(driver);
    protected BrandPageSEO brandPage = new BrandPageSEO(driver);
    protected CatalogPageSEO catalogPage = new CatalogPageSEO(driver);


    @AfterEach
    public void close() throws InterruptedException {
//        Thread.sleep(3000);
        if (HOLD_BROWSER_OPEN) {
            driver.manage().deleteAllCookies();
            driver.close();
            driver.quit();
        }
    }
}
