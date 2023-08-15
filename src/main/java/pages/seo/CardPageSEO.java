package pages.seo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.base.BasePage;

import static common.CommonJobs.getExistElement;

public class CardPageSEO extends BasePage {
    public CardPageSEO(WebDriver driver) {
        super(driver);
    }

    JavascriptExecutor scroller = (JavascriptExecutor) driver;
    WebDriverWait wait = new WebDriverWait(driver, 50);

    public CardPageSEO checkPaymentAndDelivery(String xpath, String nameOfTest) {
        getExistElement(By.xpath(xpath), nameOfTest);
        return this;
    }

}
