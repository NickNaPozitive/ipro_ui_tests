package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

import static constants.Constant.EXIST;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommonJobs extends BasePage {

    public CommonJobs(WebDriver driver) {
        super(driver);
    }

    public static void getExistElementByQuantity(By xpath, String nameOfTest) {
        int numOfEl = driver.findElements(xpath).size();
        EXIST = numOfEl > 1 ? true : false;
        assertEquals(true, EXIST, "Нехватает элементов в -> " + nameOfTest);
    }

    public static void getExistElement(By xpath, String nameOfTest) {
        EXIST = !driver.findElements(xpath).isEmpty();
        assertEquals(true, EXIST, "Нет " + nameOfTest + " в DOM");
    }

    public static int countElements(By xpath) {
        int countOfEl = driver.findElements(xpath).size();
        return countOfEl;
    }

    public static void comparingJob(String expectedUrl, String url, String nameOfTest) {

        assertEquals(expectedUrl, url.substring(0, url.length() - 5), "Нет " + nameOfTest + " в DOM");

    }
}