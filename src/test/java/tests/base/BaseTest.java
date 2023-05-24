package tests.base;

import common.CommonActions;
import org.openqa.selenium.WebDriver;
import pages.IPROHome.IPROHomePage;
import pages.base.BasePage;
import pages.catalog.CatalogTileCard;

public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected IPROHomePage iproHomePage = new IPROHomePage(driver);
    protected CatalogTileCard catalogTileCard = new CatalogTileCard(driver);
}
