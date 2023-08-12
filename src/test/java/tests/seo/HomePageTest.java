package tests.seo;

import constants.Constant;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tests.base.BaseTest;


public class HomePageTest extends BaseTest {
    @DisplayName("Проврка на существование в DOM блоков: новости, акции")
    @Test
    public void testHeader() {
        basePage.open(Constant.Urls.IDEV_HOME_PAGE);

        headerSEO
                .headerNews()
                .actions();
    }

    @DisplayName("Проврка на существование в DOM блоков: Заголовок h1, Блок Категорий (1 уровень)")
    @Test
    public void testMainPage() throws InterruptedException {
        basePage.open(Constant.Urls.IDEV_HOME_PAGE);
        mainPage
            .h1TextOnPage()
            .category()
            .hits()
            ;

    }

}
