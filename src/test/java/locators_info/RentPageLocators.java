package locators_info;

import org.openqa.selenium.By;

public class RentPageLocators {

    // Поле "Дата"
    protected By date = By.xpath("//input[@placeholder= '* Когда привезти самокат']");

    // Поле "Срок аренды"
    protected By timeForRent = By.xpath("//div[2]/div[2]/div[2]/div[1]/div[1]");

    // Срок аренды "Сутки"
    protected By dayOfRent = By.xpath("//*[@id='root']/div/div[2]/div[2]/div[2]/div[2]/div[1]");


    // Черный цвет самоката
    protected By blackColor = By.id("black");
    // Серый цвет самоката
    protected By greyColor = By.id("grey");

    // Поле "Комментарий для курьера"
    protected By comment = By.xpath("//input[@placeholder= 'Комментарий для курьера']");

    // Кнопка "Заказать"
    protected By orderButton = By.xpath("//div[2]/div[3]/button[2]");

    // Модальное окно "Хотите оформить заказ?", кнопка "ДА"
    protected By yesButtonOnModalWindow = By.xpath("/html/body/div/div/div[2]/div[5]/div[2]/button[2]");

    // Модальное окно "Хотите оформить заказ?", кнопка "НЕТ"
    protected By noButtonOnModalWindow = By.xpath("//*[@id='root']/div/div[2]/div[5]/div[2]/button[1]");

    // Модальное окно подтверждения заказа
    protected By confirmTheOrderText = By.className("Order_ModalHeader__3FDaJ");

}
