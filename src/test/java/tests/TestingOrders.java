package tests;

import locators_info.MainPageMethods;
import locators_info.OrderPageMethods;
import locators_info.RentPageMethods;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestingOrders {
    OrderPageMethods orderPageMethods = new OrderPageMethods();
    MainPageMethods mainPageMethods = new MainPageMethods();
    RentPageMethods rentPageMethods = new RentPageMethods();


    @Before
    public void SetUp(){
        mainPageMethods.mainPageSetUp();
        mainPageMethods.clickToTopOrderButton();
    }

    @Test
    public void topOrderButtonCreatingOrderWithPositiveScenario(){
        orderPageMethods.enterFirstName();
        orderPageMethods.enterSecondName("Фамилия");
        orderPageMethods.enterAdress("adress");
        orderPageMethods.chooseMetroStation();
        orderPageMethods.enterPhoneNumber("23432343322");
        orderPageMethods.clickToProceed();
        rentPageMethods.addTheComment();
        rentPageMethods.selectBlackColour();
        rentPageMethods.enterTimeForRent();
        rentPageMethods.enterDate();
        rentPageMethods.test();
    }

    @After
    public void TearDown(){
        orderPageMethods.orderPageTearDown();
    }
}
