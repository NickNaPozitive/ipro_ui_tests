package tests.seo;

import constants.Constant;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import tests.base.BaseTest;

import static constants.Constant.*;
import static constants.Constant.PASSWORD_IPRO;
import static constants.Paths.*;


public class HomePageTest extends BaseTest {
    @DisplayName("Проврка на существование в DOM блоков: новости, акции")
    @ParameterizedTest(name = "Тест №{index} -> Проврка на существование в DOM блоков -> {1}")
    @CsvSource({
            newsA + "," + "Новости ассортимента",
            iproNewsA + "," + "Новости iPRO",
            companyA + "," + "Новости компании",
            articlesA + "," + "Статьи обзоры",
            libraryA + "," + "Техбиблиотека",
            actionsA + "," + "Акции",
            loyaltyA + "," + "Программа лояльности",
    })
    public void testHeader(String xpath, String nameOfTest) {
        basePage.open(Constant.Urls.IDEV_HOME_PAGE);

        headerSEO
                .headerNews(xpath, nameOfTest)
                .actions(xpath, nameOfTest);
    }

//    @DisplayName("Проврка на существование в DOM блоков: " +
//            "Заголовок h1\n" +
//            "Блок Категорий (1 уровень)\n" +
//            "Хиты продаж (сейчас только 1 карточка доступна)\n" +
//            "Преимущества работы с ЭТМ\n" +
//            "Блок Акции\n" +
//            "Развитие ассортимента (доступен только 1 баннер)\n" +
//            "Блок новостей")
//    @ParameterizedTest
//    @CsvSource({
//
//    })
//    public void testMainPage() throws InterruptedException {
//        basePage.open(Constant.Urls.IDEV_HOME_PAGE);
//        mainPage
//                .h1TextOnPage()
//                .category()
//                .hits()
//                .advantagesCheck()
//                .actionsCheck()
//                .assortmentCheck()
//                .newsCheck();
//
//    }


}
