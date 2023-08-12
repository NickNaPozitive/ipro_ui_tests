package pages.seo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.base.BasePage;


import static constants.Constant.TimeOutVariables.IMPLICIT_WAIT;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HeaderSEO extends BasePage {
    public HeaderSEO(WebDriver driver) {super(driver);}
    WebDriverWait wait = new WebDriverWait(driver, IMPLICIT_WAIT);

    boolean exist;

    By newsA = By.xpath("//a[text()=\"Новости ассортимента\"]");
    By iproNewsA = By.xpath("//a[text()=\"Новости iPRO\"]");
    By companyA = By.xpath("//a[text()=\"Новости компании\"]");
    By articlesA = By.xpath("//a[text()=\"Статьи, обзоры\"]");
    By libraryA = By.xpath("//a[text()=\"Техбиблиотека\"]");

    By actionsA = By.xpath("//a[text()=\"Акции\"]");
    By loyaltyA = By.xpath("//a[text()=\"Программа лояльности\"]");



    public HeaderSEO headerNews(){
        exist = !driver.findElements(newsA).isEmpty();
        assertEquals(true, exist, "Нет " + newsA + " в DOM");

        exist = !driver.findElements(iproNewsA).isEmpty();
        assertEquals(true, exist, "Нет " + iproNewsA + " в DOM");

        exist = !driver.findElements(companyA).isEmpty();
        assertEquals(true, exist, "Нет " + companyA + " в DOM");

        exist = !driver.findElements(articlesA).isEmpty();
        assertEquals(true, exist, "Нет " + articlesA + " в DOM");

        exist = !driver.findElements(libraryA).isEmpty();
        assertEquals(true, exist, "Нет " + libraryA + " в DOM");
        return this;
    }

    public HeaderSEO actions(){
        exist = !driver.findElements(actionsA).isEmpty();
        assertEquals(true, exist, "Нет " + actionsA + " в DOM");

        exist = !driver.findElements(loyaltyA).isEmpty();
        assertEquals(true, exist, "Нет " + loyaltyA + " в DOM");

        return this;
    }

}
