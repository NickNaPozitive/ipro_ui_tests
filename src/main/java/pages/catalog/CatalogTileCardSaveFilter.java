package pages.catalog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

import java.util.concurrent.TimeUnit;

import static constants.Constant.TimeOutVariables.EXPLICIT_WAIT;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatalogTileCardSaveFilter extends BasePage {
    public CatalogTileCardSaveFilter(WebDriver driver) {
        super(driver);
    }
    By listOfManufacturers = By.xpath("//div[@id=\"panel1a-header\"]");
    By acceptSavedFilter = By.xpath("//*[@id=\"portal\"]/div/div[2]/div[2]/table/tbody/tr[1]/td[3]/div/button[3]");
    By brandSearch = By.xpath("//input[@placeholder=\"Начните вводить\"]");
    By brandClick = By.xpath("//input[@data-testid=\"checkbox-filterBrand_Конкорд\"]");
    By listOfViens = By.xpath("//*[@id=\"panel1a-header\"]/div[2]");
    By veinsClick = By.xpath("//input[@data-testid=\"checkbox-79-139\"]");
    By fromRus = By.xpath("//input[@name=\"from_rus\"]");
    By  enterFilters = By.xpath("//span[text()=\"Применить\"]");
    By saveFilters = By.xpath("//input[@data-testid=\"save-filter-button\"]");
    By myFiltersBtn = By.xpath("//input[@data-testid=\"add-filter-button\"]");


    public CatalogTileCardSaveFilter brandChoose() {
        driver.findElement(listOfManufacturers).click();
        driver.findElement(brandSearch).sendKeys("Конкорд");
        driver.findElement(brandClick).click();
        return this;
    }

    public CatalogTileCardSaveFilter veinsChoose() {
        driver.findElement(listOfViens).click();
        driver.findElement(veinsClick).click();
        return this;
    }

    public CatalogTileCardSaveFilter fromRusChoose() {
        driver.findElement(fromRus).click();
        return this;
    }
    public CatalogTileCardSaveFilter enterAllFilters() {
        driver.findElement(enterFilters).click();
        return this;
    }

    public CatalogTileCardSaveFilter saveAllFilters() {
        driver.findElement(saveFilters).click();
        return this;
    }

    public CatalogTileCardSaveFilter chooseSavedFilter() {
        driver.findElement(myFiltersBtn).click();
        driver.findElement(acceptSavedFilter).click();
        return this;
    }

    public CatalogTileCardSaveFilter checkChoosenFilters(){
        driver.findElement(listOfManufacturers).click();
        assertEquals(true, driver.findElement(brandClick).isSelected(), "Неверно выбран бренд");
        driver.findElement(listOfViens).click();
        assertEquals(true, driver.findElement(veinsClick).isSelected(), "Неверно выбраны жилы");
        assertEquals(true, driver.findElement(fromRus).isSelected(),
                "Неверно выбрал фильтр \"Сделано в России\"");
        return this;
    }

}
