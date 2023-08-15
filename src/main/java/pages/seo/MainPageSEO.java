package pages.seo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.base.BasePage;

import static common.CommonJobs.getExistElement;
import static constants.Constant.EXIST;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainPageSEO extends BasePage {
    public MainPageSEO(WebDriver driver) {
        super(driver);
    }

    JavascriptExecutor scroller = (JavascriptExecutor) driver;
    WebDriverWait wait = new WebDriverWait(driver, 50);
    By categoryTable = By.xpath("//div[@class=\"swiper jss188\"]/div/div");
    By hitsTable = By.xpath("//h2[text()=\"Хиты продаж\"]/../../div[2]/div/div");
    By advantagesTable = By.xpath("//h2[text()=\"Преимущества работы с ЭТМ\"]/../div/div");
    By actionsTable = By.xpath("//h2[text()=\"Больше выгоды\"]/../../div[2]/div/div/div");
    By assortmentTable = By.xpath("//h6[text()=\"Развитие ассортимента\"]/../span/div/div/div");
    By newsTable = By.xpath("//h2[text()=\"Новости\"]/../../../div[2]/div/div/div");
    By h1Text = By.xpath("//h1[text()=\"ЭТМ - комплексный поставщик инженерных систем\"]");

    public MainPageSEO h1TextOnPage() {
        EXIST = !driver.findElements(h1Text).isEmpty();
        assertEquals(true, EXIST, "Нет " + h1Text + " в DOM");
        return this;
    }

    public MainPageSEO category(String xpath, String nameOfTest) {
        getExistElement(By.xpath(xpath), nameOfTest);
        return this;
    }

    public MainPageSEO hits(String xpath, String nameOfTest) throws InterruptedException {
        getExistElement(By.xpath(xpath), nameOfTest);
        return this;
    }

    public MainPageSEO advantagesCheck(String xpath, String nameOfTest) throws InterruptedException {
        getExistElement(By.xpath(xpath), nameOfTest);
        return this;
    }

    public MainPageSEO actionsCheck(String xpath, String nameOfTest) throws InterruptedException {
        getExistElement(By.xpath(xpath), nameOfTest);
        return this;
    }

    public MainPageSEO assortmentCheck(String xpath, String nameOfTest) throws InterruptedException {
        getExistElement(By.xpath(xpath), nameOfTest);
        return this;
    }

    public MainPageSEO newsCheck(String xpath, String nameOfTest) throws InterruptedException {
        getExistElement(By.xpath(xpath), nameOfTest);
        return this;
    }
}

