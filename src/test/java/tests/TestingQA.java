package tests;

import locators_info.MainPageMethods;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestingQA {

    MainPageMethods mainPageMethods = new MainPageMethods();


    @Before
    public void setUp(){
        mainPageMethods.mainPageSetUp();
    }


    @Test
    public void testingQA1(){
        mainPageMethods.testDropDownQuestionAnswer1();
    }
    @Test
    public void testingQA2() { mainPageMethods.testDropDownQuestionAnswer2(); }
    @Test
    public void testingQA3() { mainPageMethods.testDropDownQuestionAnswer3(); }
    @Test
    public void testingQA4() { mainPageMethods.testDropDownQuestionAnswer4(); }
    @Test
    public void testingQA5() { mainPageMethods.testDropDownQuestionAnswer5(); }
    @Test
    public void testingQA6() { mainPageMethods.testDropDownQuestionAnswer6(); }
    @Test
    public void testingQA7() { mainPageMethods.testDropDownQuestionAnswer7(); }
    @Test
    public void testingQA8() { mainPageMethods.testDropDownQuestionAnswer8(); }

    @After
    public void tearDown(){
        mainPageMethods.mainPageTearDown();
    }
}
