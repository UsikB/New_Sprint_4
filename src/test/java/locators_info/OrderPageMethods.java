package locators_info;

import org.checkerframework.checker.units.qual.C;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OrderPageMethods extends OrderPageLocators{

    static WebDriver driver;
    public void setDriver(WebDriver driver){
        this.driver = driver;
    }

    MainPageMethods mainPageMethods = new MainPageMethods();


    public void enterFirstName(){
        new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(firstName)).click();
        driver.findElement(firstName).sendKeys("Имя");
    }

    //УРА!!! Проблема была в том, что методы enterFirstName и тд использовали "другой" драйвер. Через геттеры и сеттеры
    // надо передавать 1 единственный драйвер, чтобы все работало!!!!!!!!!!

    @Test
    public void test(){
        mainPageMethods.mainPageSetUp();
        mainPageMethods.clickToTopOrderButton();
        setDriver(mainPageMethods.getDriver());
        enterFirstName();
    }

    public void enterSecondName(String surname){
        new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(firstName)).click();
        driver.findElement(secondName).sendKeys(surname);
    }

    public void enterAdress(String ardress){
        new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(secondName)).click();
        driver.findElement(adressToDeliver).sendKeys(ardress);
    }

    public void chooseMetroStation(){
        new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(metro)).click();
        driver.findElement(metro).sendKeys("Выхино"+ Keys.DOWN+ Keys.ENTER);
    }

    public void enterPhoneNumber(String numberPhone){
        new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(metro)).click();
        driver.findElement(phoneNumber).sendKeys(numberPhone);
    }
//    @Test
//    public void login(String name, String surname, String ardres, String number){
//
//        enterFirstName(name);
//        enterSecondName(surname);
//        enterAdress(ardres);
//        chooseMetroStation();
//        enterPhoneNumber(number);
//
//    }

    public void clickToProceed(){
        driver.findElement(buttonToProceed).click();
    }

    public void orderPageTearDown(){
        driver.quit();
    }
}
