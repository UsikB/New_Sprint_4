package locators_info;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.*;

public class MainPageMethods extends MainPageLocators{

    static WebDriver driver = new ChromeDriver();

    public WebDriver getDriver(){
        return driver;
    }

    public void mainPageSetUp(){
        driver.get(getMainPage());
        new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(getCookie()));
        driver.findElement(getCookie()).click();
    }

    public void clickToTopOrderButton(){
        driver.findElement(topOrderButton).click();
    }

    public void testDropDownQuestionAnswer1() {
        new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOfElementLocated(list1));
        WebElement element = driver.findElement(list1);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
        new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOfElementLocated(textOfList1));
        String actual = driver.findElement(textOfList1).getText();
        String expected = answerOfList1;
        assertEquals("Не совпадает",expected, actual);
    }

    public void testDropDownQuestionAnswer2() {
        new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOfElementLocated(list1));
        WebElement element = driver.findElement(list2);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
        new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOfElementLocated(textOfList2));

        String actual = driver.findElement(textOfList2).getText();

        String expected = answerOfList2;
        assertEquals("Не совпадает",expected, actual);
    }

    public void testDropDownQuestionAnswer3() {
        new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOfElementLocated(list1));
        WebElement element = driver.findElement(list3);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
        new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOfElementLocated(textOfList3));

        String actual = driver.findElement(textOfList3).getText();
        String expected = answerOfList3;
        assertEquals("Не совпадает",expected, actual);
    }

    public void testDropDownQuestionAnswer4() {
        new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOfElementLocated(list1));
        WebElement element = driver.findElement(list4);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
        new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOfElementLocated(textOfList4));

        String actual = driver.findElement(textOfList4).getText();

        String expected = answerOfList4;
        assertEquals("Не совпадает",expected, actual);
    }

    public void testDropDownQuestionAnswer5() {
        new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOfElementLocated(list1));
        WebElement element = driver.findElement(list5);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
        new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOfElementLocated(textOfList5));

        String actual = driver.findElement(textOfList5).getText();

        String expected = answerOfList5;
        assertEquals("Не совпадает",expected, actual);
    }

    public void testDropDownQuestionAnswer6() {
        new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOfElementLocated(list1));
        WebElement element = driver.findElement(list6);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(textOfList6));

        String actual = driver.findElement(textOfList6).getText();

        String expected = answerOfList6;
        assertEquals("Не совпадает",expected, actual);
    }

    public void testDropDownQuestionAnswer7() {
        new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOfElementLocated(list1));
        WebElement element = driver.findElement(list7);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(textOfList7));

        String actual = driver.findElement(textOfList7).getText();

        String expected = answerOfList7;
        assertEquals("Не совпадает",expected, actual);
    }

    public void testDropDownQuestionAnswer8() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(list1));
        WebElement element = driver.findElement(list8);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(textOfList8));

        String actual = driver.findElement(textOfList8).getText();

        String expected = answerOfList8;
        assertEquals("Не совпадает",expected, actual);
    }

    public void mainPageTearDown(){
        driver.quit();
    }


}