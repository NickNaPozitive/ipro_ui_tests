package tests.seo;

import constants.Constant;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import tests.base.BaseTest;

import static constants.Paths.*;

public class CardPageTest extends BaseTest {
    @DisplayName("Проврка на существование в DOM блоков: тэги")
    @ParameterizedTest(name = "Тест №{index} -> Проврка на существование в DOM блоков -> {1}")
    @CsvSource({
            deliveryTable + "," + "Способы получения",
            paymentTable + "," + "Оплата",
    })
    public void cardPage(String xpath, String nameOfTest) {
        basePage.open(Constant.Urls.CARD_PAGE);
        cardPage
                .checkPaymentAndDelivery(xpath, nameOfTest);
    }
}
