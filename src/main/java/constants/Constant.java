
package constants;

import common.MailReader;

import javax.mail.MessagingException;

public class Constant {

//    public static final String LOGIN_MARKET = "9692161158";
//    public static final String PASSWORD_MARKET = "20101999dn";
//
//    public static final String LOGIN_IPRO = "60004392dnv";
//    public static final String PASSWORD_IPRO = "dgnp4133";

    public static final String LOGIN_MARKET = "9692161158";
    public static final String EMAIL = "testetm@rambler.ru";
    public static final String PASSWORD_MARKET = "20101999d";

    public static final String LOGIN_IPRO = "1326156dnv";
    public static final String PASSWORD_IPRO = "frrw4811";

    public static final String PRODUCT_CODE = "34031304";
    public static final String BRAND = "АВАНГАРД";

    public static final String CODE;

    static {
        try {
            CODE = MailReader.fetchLast5Messages("testetm@rambler.ru", "20101999dN");
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }


    public static class TimeOutVariables{
        public static final int IMPLICIT_WAIT = 10;
        public static final int EXPLICIT_WAIT = 5;
    }
    public static class Urls{
        public static final String IDEV_HOME_PAGE= "https://idev.etm.ru/";
        public static final String ITEST_HOME_PAGE= "https://itest.etm.ru:3004";
        public static final String PROD_HOME_PAGE= "https://www.etm.ru/";
        public static final String FUTURE_EVENTS_PAGE= "https://skills.etm.ru/events/";
//        public static final String AUTH_PAGE= "https://www.google.com/";
    }
}