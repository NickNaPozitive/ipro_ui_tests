package pages.seo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.base.BasePage;

import java.util.concurrent.TimeUnit;

import static constants.Constant.TimeOutVariables.EXPLICIT_WAIT;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainPageSEO extends BasePage {
    public MainPageSEO(WebDriver driver) {super(driver);}
    JavascriptExecutor scroller = (JavascriptExecutor) driver;
    WebDriverWait wait = new WebDriverWait(driver, 50);

    boolean exist;

    By categoryTable = By.xpath("//div[@class=\"swiper jss188\"]/div/div");
    By hitsTable = By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div/div[2]/div[5]/div/div/div/div");

//    By hitsTable = By.cssSelector("#__next > div.jss1 > div.jsx-2907664492.jss2 > div > div.jss119 > div.jss124 > div.swiper.jss121 > div.swiper-wrapper");

    By h1Text = By.xpath("//h1[text()=\"ЭТМ - комплексный поставщик инженерных систем\"]");

    public MainPageSEO h1TextOnPage(){
        exist = !driver.findElements(h1Text).isEmpty();
        assertEquals(true, exist, "Нет " + h1Text + " в DOM");
        return this;
    }

    public MainPageSEO category(){
        int numOfDiv = driver.findElements(categoryTable).size();
        assertEquals(21, numOfDiv, "Нехватает элементов в категориях");
        return this;
    }
    public MainPageSEO hits() throws InterruptedException {
//        for(int i = 1; i <= 13; i++){
//            exist = !driver.findElements(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div/div[2]/div[2]/div[2]/div[1]/div[" + i + "]/div/div[1]")).isEmpty();
//            String name = driver.findElements(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div/div[2]/div[2]/div[2]/div[1]/div[" + i + "]/div/div[1]")).toString();
//            System.out.println(name);
//            assertEquals(true, exist, "Нехватает " + i + " в хитах");
//        }
//
//        int size = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div/div[2]/div[2]/div[2]/div[1]/div"))).size();
//        System.out.println(size);
        int numOfHits = driver.findElements(hitsTable).size();
        assertEquals(5, numOfHits, "Нехватает элементов в хитах");
        return this;
    }
}
