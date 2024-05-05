package constants;

import org.openqa.selenium.By;

public class Paths {

    public static final String enterButton = "//button[@data-testid=\"authorization-button\"]";
    public static final String checkLoad = "//*[@id=\"home_slider\"]/div/a/img";
    public static final String CARDS_TABLE = "//div[@data-testid=\"catalog-list-item-1\"]";
    public static final String newsA = "//a[@href=\"/ipro3/news\"]";

    public static final String iproNewsA = "//a[@href=\"/ipro3/news/ipronews\"]";

    public static final String companyA = "//a[@href=\"/ipro3/news/company\"]";
    public static final String articlesA = "//a[@href=\"/ipro3/articles\"]";
    //*[@id="__next"]/div[2]/header/div[1]/div[1]/div[1]/div/div[3]/ul/div[2]/li/a
    public static final String libraryA = "//a[@href=\"/ipro3/library\"]";
//    public static final String actionsA = "//a[text()=\"Акции\"]";
    public static final String actionsA = "//a[@href=\"/ipro3/actions\"]";

    public static final String loyaltyA = "//a[text()=\"Программа лояльности\"]";

    //MAIN PAGE SEO
    public static final String categoryTable = "//h1[text()=\"ЭТМ - комплексный поставщик инженерных систем\"]/../div/div[2]/div[2]/div/div";
    public static final String hitsTable = "//h2[text()=\"Хиты продаж\"]/../../div[2]/div/div";
    public static final String advantagesTable = "//h2[text()=\"Преимущества работы с ЭТМ\"]/../div/div";
    public static final String actionsTable = "//h2[text()=\"Больше выгоды\"]/../../div[2]/div/div/div";
    public static final String assortmentTable = "//h2[text()=\"Развитие ассортимента\"]/../span/div/div/div";
    public static final String newsTable = "//h2[text()=\"Новости\"]/../../../div[2]/div/div/div";
    public static final String h1Text = "//h1[text()=\"ЭТМ - комплексный поставщик инженерных систем\"]";


    //CARD PAGE
//    public static final String deliveryTable = "//h4[text()=\"Способы получения\"]/..";
    public static final String paymentTable = "//p[text()=\"Оплата\"]";
    public static final String specificationsTableOne = "//h2[text()=\"Характеристики\"]/../../div[2]/div/div";
    public static final String specificationsTableTwo = "//h2[text()=\"Характеристики\"]/../../div[2]/div/div[2]";
    public static final String specificationsTableThree = "//p[text()=\"Характеристики\"]/../table";
    public static final String certificates = "//h2[@data-testid=\"product-page-section-certificates-and-materials\"]";
    public static final String dontForget = "//h2[text()=\"Не забудьте купить\"]/../div";
    public static final String allVariants = "//h2[text()=\"Все варианты товара\"]";

    //BRAND PAGE
    public static final String filters = "//h3[text()=\"Категории\"]/../div/div/div";
    public static final String famousProsucts = "//h3[text()=\"Популярные товары\"]/../div/div/div";
    public static final String actions = "//h1/../div[3]/div[3]/div[2]/div/div/div";

    public static final String nameBrand = "//h1";

    //CATALOG PAGE
    public static final String category = "//p[text()=\"Категории\"]/../div";
    public static final String cardsTableCatalog = "//div[@data-testid=\"catalog-list-item-1\"]";



    //HTML
    //META content="noindex,nofollow
    public static final String content = "//meta[@content='noindex,nofollow']";
    public static final String canonicalHttps = "//link[@href='";

    //NEWS A
    public static final String newsAssortment = "//a/p[text()=\"Новости ассортимента\"]";
    public static final String allInNewsAssortment = "//a/p[text()=\"Новости ассортимента\"]/../../../../div[2]/div/div/div";
    public static final String newsIpro = "//a/p[text()=\"Новости iPRO\"]/..";
    public static final String allInNewsIpro = "//a/p[text()=\"Новости iPRO\"]/../../../../div[2]/div/div/div";

    public static final String newsCompany = "//a/p[text()=\"Новости компании\"]/..";
    public static final String allInNewsCompany = "//a/p[text()=\"Новости компании\"]/../../../../div[2]/div/div/div";

    public static final String newsReview = "//a/p[text()=\"Статьи, обзоры\"]/..";
    public static final String allInNewsReview = "//a/p[text()=\"Статьи, обзоры\"]/../../../../div[2]/div/div/div";


    // BRAND PAGE SEARCH: TITLE, DESCRIPTION..

    public static final String title = "//title[text()=\"";
    public static final String description = "//meta[@name='description' and @content='Купить товары  ";


    // BRAND PAGE SEARCH: TITLE, DESCRIPTION.. iPRO-7067
    public static final String titleSearch = "//title[text()='";
    public static final String descriptionSearch = "//meta[@name='description' and @content='";
    public static final String footerCatalog = "//h4[text()=\"iPRO\"]/../div/a";
    public static final String inputText = "//input[@placeholder='Умный поиск по названию, артикулу, свойству, производителю']";

    // CARD PAGE: TITLE iPRO-6941

    public static final String titleArticleNumber = "//title[text()='";



}
