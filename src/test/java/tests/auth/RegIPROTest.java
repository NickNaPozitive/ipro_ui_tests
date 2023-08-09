package tests.auth;

import common.MailReader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import tests.base.BaseTest;

import javax.mail.MessagingException;

import java.io.IOException;

import static constants.Constant.*;
import static constants.Constant.PASSWORD_IPRO;

public class RegIPROTest extends BaseTest {

    @DisplayName("Регистрация IPRO")
    @ParameterizedTest
    @CsvSource(value ={
            EMAIL
            })
    public void checkAuthIPRO(String email) throws MessagingException, IOException {
        basePage.open(Urls.IDEV_HOME_PAGE);

        authIPRO
                .firstStepEmail(email)
                .firstStepCode(email);
    }
}
