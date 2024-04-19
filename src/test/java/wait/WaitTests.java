package wait;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class WaitTests extends BaseTests {
    @Test
    public void testExample1(){
        var loadExample1Page = homePage.clickDynamicLoad().clickExample1();
        loadExample1Page.clickStartButton();
        assertEquals(loadExample1Page.getText(),"Hello World!");
    }

    @Test
    public void testExample2(){
        var loadExample2Page = homePage.clickDynamicLoad().clickExample2();
        loadExample2Page.clickStartButton();
        assertEquals(loadExample2Page.getText(),"Hello World!");
    }
}
