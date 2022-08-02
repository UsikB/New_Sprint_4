package locators_info;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import static locators_info.MainPageMethods.driver;

public class RentPageMethods extends RentPageLocators{

    MainPageMethods mainPageMethods = new MainPageMethods();
    OrderPageMethods orderPageMethods = new OrderPageMethods();

    @Test
    public void enterDate(){
//        mainPageMethods.mainPageSetUp();
//        mainPageMethods.clickToTopOrderButton();
//        orderPageMethods.login("Имя", "Фамилия", "Пушкина", "23453454454");
//        orderPageMethods.clickToProceed();
        driver.findElement(date).sendKeys("20.08.2022");
    }

    @Test
    public void enterTimeForRent(){
//        mainPageMethods.mainPageSetUp();
//        mainPageMethods.clickToTopOrderButton();
//        orderPageMethods.login("Имя", "Фамилия", "Пушкина", "23453454454");
//        orderPageMethods.clickToProceed();
        driver.findElement(timeForRent).click();
        driver.findElement(dayOfRent).click();
    }

    @Test
    public void selectBlackColour(){
//        mainPageMethods.mainPageSetUp();
//        mainPageMethods.clickToTopOrderButton();
//        orderPageMethods.login("Имя", "Фамилия", "Пушкина", "23453454454");
//        orderPageMethods.clickToProceed();
        driver.findElement(blackColor).click();
    }

    @Test
    public void selectGreyColour(){
//        mainPageMethods.mainPageSetUp();
//        mainPageMethods.clickToTopOrderButton();
//        orderPageMethods.login("Имя", "Фамилия", "Пушкина", "23453454454");
//        orderPageMethods.clickToProceed();
        driver.findElement(greyColor).click();
    }

    @Test
    public void addTheComment(){
//        mainPageMethods.mainPageSetUp();
//        mainPageMethods.clickToTopOrderButton();
//        orderPageMethods.login("Имя", "Фамилия", "Пушкина", "23453454454");
//        orderPageMethods.clickToProceed();
        driver.findElement(comment).sendKeys("Поскорее, пожалуйста");
    }


    // На этом остановился!!!
    // ТУТ БАГ КОТОРЫЙ НЕ ДАЕТ ОФОРМИТЬ ЗАКАЗ!!!!!!!!
    @Test
    public void test(){
//        mainPageMethods.mainPageSetUp();
//        mainPageMethods.clickToTopOrderButton();
//        orderPageMethods.login("Имя", "Фамилия", "Пушкина", "23453454454");
//        orderPageMethods.clickToProceed();
//        driver.findElement(timeForRent).click();
//        driver.findElement(dayOfRent).click();
//        driver.findElement(greyColor).click();
//        driver.findElement(comment).sendKeys("Поскорее, пожалуйста");
//        driver.findElement(date).sendKeys("20.08.2022");
        driver.findElement(orderButton).click();
        // ТУТ БАГ КОТОРЫЙ НЕ ДАЕТ ОФОРМИТЬ ЗАКАЗ!!!!!!!!
        driver.findElement(yesButtonOnModalWindow).click();
        String actual = driver.findElement(confirmTheOrderText).getText();
        System.out.println(actual);
    }





}
