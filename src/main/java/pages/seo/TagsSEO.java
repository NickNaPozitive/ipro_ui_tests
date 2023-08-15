package pages.seo;

import common.CommonJobs;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.base.BasePage;

import static common.CommonJobs.getExistElementByQuantity;

public class TagsSEO extends BasePage {
    public TagsSEO(WebDriver driver) {
        super(driver);
    }

    JavascriptExecutor scroller = (JavascriptExecutor) driver;
    WebDriverWait wait = new WebDriverWait(driver, 50);
    public TagsSEO checkExistCards(String xpath, String nameOfTest) {
        getExistElementByQuantity(By.xpath(xpath), nameOfTest);
        return this;
    }
}
