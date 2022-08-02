package locators_info;

import org.openqa.selenium.By;


public class OrderPageLocators {


    // Поле "Имя"
    protected By firstName =By.xpath("//input[@placeholder='* Имя']");


    // Поле "Фамилия"
    protected By secondName =By.xpath("//input[@placeholder='* Фамилия']");

    // Поле "Адрес"
    protected By adressToDeliver =By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']");


    // Поле "Станция метро"
    protected By metro = By.cssSelector(".select-search__input");

    // Поле Телефон
    protected By phoneNumber = By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']");

    // Кнопка "Далее"
    protected By buttonToProceed = By.xpath("//div[2]/div[3]/button");





}
