package constants;

import org.openqa.selenium.By;

public class Paths {

    public static final String enterButton = "//button[@data-testid=\"authorization-button\"]";

    public static final String checkLoad = "//*[@id=\"home_slider\"]/div/a/img";
    public static final String CARDS_TABLE = "//h1[text()=\"Светильник светодиодный ЖКХ 12Вт\"]/../../../../div[2]/div/div[2]/div[2]/div/div";
    public static final String newsA = "//a[text()=\"Новости ассортимента\"]";
    public static final String iproNewsA = "//a[text()=\"Новости iPRO\"]";
    public static final String companyA = "//a[text()=\"Новости компании\"]";
    public static final String articlesA = "//a[@href=\"/ipro3/articles\"]";
    public static final String libraryA = "//a[text()=\"Техбиблиотека\"]";
    public static final String actionsA = "//a[text()=\"Акции\"]";
    public static final String loyaltyA = "//a[text()=\"Программа лояльности\"]";

    //MAIN PAGE SEO
    public static final String categoryTable = "//h1[text()=\"ЭТМ - комплексный поставщик инженерных систем\"]/../div/div[2]/div[2]/div/div";
    public static final String hitsTable = "//h3[text()=\"Хиты продаж\"]/../../div[2]/div/div";
    public static final String advantagesTable = "//h3[text()=\"Преимущества работы с ЭТМ\"]/../div/div";
    public static final String actionsTable = "//h3[text()=\"Больше выгоды\"]/../../div[2]/div/div/div";
    public static final String assortmentTable = "//h3[text()=\"Развитие ассортимента\"]/../span/div/div/div";
    public static final String newsTable = "//h3[text()=\"Новости\"]/../../../div[2]/div/div/div";
    public static final String h1Text = "//h1[text()=\"ЭТМ - комплексный поставщик инженерных систем\"]";


    //CARD PAGE
    public static final String deliveryTable = "//h4[text()=\"Способы получения\"]/..";
    public static final String paymentTable = "//h4[text()=\"Оплата\"]/..";
    public static final String specificationsTableOne = "//h2[text()=\"Характеристики\"]/../div/div/div[1]/p";
    public static final String specificationsTableTwo = "//h2[text()=\"Характеристики\"]/../div/div/div[2]/p";
    public static final String specificationsTableThree = "//div[text()=\"Характеристики\"]/../noindex/div/div/p";
    public static final String certificates = "//h2[text()=\"Сертификаты\"]/../div/a";
    public static final String dontForget = "//h2[text()=\"Не забудьте купить\"]/../div";
    public static final String allVariants = "//h2[text()=\"Все варианты товара\"]";

    //BRAND PAGE
    public static final String filters = "//h2[text()=\"Категории\"]/../div/div/div";
    public static final String famousProsucts = "//h2[text()=\"Популярные товары\"]/../div/div/div";
    public static final String actions = "//h2[text()=\"Популярные товары\"]/../../../../div[4]/div[2]/div/div/div";

    //CATALOG PAGE
    public static final String category = "//p[text()=\"Категории\"]/../div";
    public static final String cardsTableCatalog = "//h1[text()=\"Кабели с медной токопроводящей жилой \"]/../../../../div[2]/div/div[2]/div[2]/div/div";
}
