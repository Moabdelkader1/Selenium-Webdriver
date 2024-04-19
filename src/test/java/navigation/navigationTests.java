package navigation;

import base.BaseTests;
import org.testng.annotations.Test;

public class navigationTests extends BaseTests {
    @Test
    public void testNavigator(){
        homePage.clickDynamicLoad().clickExample1();
        getWindowManager().goBack();
        getWindowManager().refresh();
        getWindowManager().goForward();
        getWindowManager().goTo("https://google.com");
    }

    @Test
    public void testSwitchTab(){
        homePage.clickMultipleWindows().clickHere();
        getWindowManager().switchToTab("New Window");
    }
}
