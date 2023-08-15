package pages.seo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.base.BasePage;


import java.time.Duration;

import static common.CommonJobs.getExistElement;
import static common.CommonJobs.getExistElementByQuantity;
import static constants.Constant.TimeOutVariables.IMPLICIT_WAIT;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HeaderSEO extends BasePage {
    public HeaderSEO(WebDriver driver) {super(driver);}
    WebDriverWait wait = new WebDriverWait(driver, IMPLICIT_WAIT);

    boolean exist;


    public HeaderSEO headerNews(String xpath, String nameOfTest){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        getExistElement(By.xpath(xpath), nameOfTest);
        return this;
    }

    public HeaderSEO actions(String xpath, String nameOfTest){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        getExistElement(By.xpath(xpath), nameOfTest);
        return this;
    }

}
