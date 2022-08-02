package locators_info;
import org.openqa.selenium.By;

public class MainPageLocators {



    private String mainPage = "https://qa-scooter.praktikum-services.ru/";

    public String getMainPage(){
    return mainPage;
    }
    // Cookie
    // /App_CookieButton__3cvqF"
    private By cookie = By.className("App_CookieButton__3cvqF");

    public By getCookie(){
        return cookie;
    }

    //Лого "Яндекс" в верхнем левом углу страницы
    // .Header_LogoYandex__3TSOI
    protected By yaLogo = By.className("Header_LogoYandex__3TSOI");

    //Лого "Самокат" в верхнем левом углу страницы
    // .Header_LogoScooter__3lsAR
    protected By scooterLogo = By.className("Header_LogoScooter__3lsAR");

    //Кнопка "Заказать" в самом верху страницы
    // .//button[@class='Button_Button__ra12g']
    protected By topOrderButton = By.xpath(".//button[@class='Button_Button__ra12g']");

    //Кнопка "Статус заказа" в самом верху страницы
    // .Header_Link__1TAG7
    protected By orderStatusButton = By.className("Header_Link__1TAG7");

    //Кнопка "Заказать" в нижней части страницы
    // .//div[5]/button
    protected By bottomOrderButton = By.xpath(".//div[5]/button");

    //Раздел "Сколько это стоит? И как оплатить?"
    // //*[@id='accordion__heading-0']
    protected By list1 = By.xpath("//*[@id='accordion__heading-0']");

    //Ответ раздела "Сколько это стоит? И как оплатить?"
    // //*[@id='accordion__heading-0']/p
    protected By textOfList1 = By.xpath("//*[@id='accordion__panel-0']/p");
    String answerOfList1 = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";

    //Раздел "Хочу сразу несколько самокатов! Так можно?"
    // //*[@id='accordion__heading-1']
    protected By list2 = By.xpath("//*[@id='accordion__heading-1']");

    //Ответ раздела "Хочу сразу несколько самокатов! Так можно?"
    // //*[@id='accordion__heading-1']/p
    protected By textOfList2 = By.xpath("//*[@id='accordion__panel-1']/p");

    String answerOfList2 = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";




    //Раздел "Как рассчитывается время аренды?"
    // //*[@id='accordion__heading-2']
    protected By list3 = By.xpath("//*[@id='accordion__heading-2']");

    //Ответ раздела "Как рассчитывается время аренды?"
    // //*[@id='accordion__heading-2']/p
    protected By textOfList3 = By.xpath("//*[@id='accordion__panel-2']/p");
    String answerOfList3 = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. " +
                            "Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. " +
                            "Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";

    //Раздел "Можно ли заказать самокат прямо на сегодня?"
    // //*[@id='accordion__heading-3']
    protected By list4 = By.xpath("//*[@id='accordion__heading-3']");

    //Ответ раздела "Можно ли заказать самокат прямо на сегодня?"
    // //*[@id='accordion__heading-3']/p
    protected By textOfList4 = By.xpath("//*[@id='accordion__panel-3']/p");
    String answerOfList4 = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";

    //Раздел "Можно ли продлить заказ или вернуть самокат раньше?"
    // //*[@id='accordion__heading-4']
    protected By list5 = By.xpath("//*[@id='accordion__heading-4']");

    //Ответ раздела "Можно ли продлить заказ или вернуть самокат раньше?"
    // //*[@id='accordion__heading-4']/p
    protected By textOfList5 = By.xpath("//*[@id='accordion__panel-4']/p");
    String answerOfList5 = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";

    //Раздел "Вы привозите зарядку вместе с самокатом?"
    // //*[@id='accordion__heading-5']
    protected By list6 = By.xpath("//*[@id='accordion__heading-5']");

    //Ответ раздела "Вы привозите зарядку вместе с самокатом?"
    // //*[@id='accordion__heading-5']/p
    protected By textOfList6 = By.xpath("//*[@id='accordion__panel-5']/p");
    String answerOfList6 = "Самокат приезжает к вам с полной зарядкой. " +
            "Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";

    //Раздел "Можно ли отменить заказ?"
    // //*[@id='accordion__heading-6']
    protected By list7 = By.xpath("//*[@id='accordion__heading-6']");

    //Ответ раздела "Можно ли отменить заказ?"
    // //*[@id='accordion__heading-6']/p
    protected By textOfList7 = By.xpath("//*[@id='accordion__panel-6']/p");
    String answerOfList7 = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";

    //Раздел "Я живу за МКАДом, привезёте?"
    // //*[@id='accordion__heading-7']
    protected By list8 = By.xpath("//*[@id='accordion__heading-7']");

    //Ответ раздела "Я живу за МКАДом, привезёте?"
    // //*[@id='accordion__heading-7']/p
    protected By textOfList8 = By.xpath("//*[@id='accordion__panel-7']/p");
    String answerOfList8 = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";


}
