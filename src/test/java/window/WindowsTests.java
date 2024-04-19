package window;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class WindowsTests extends BaseTests {
    @Test
    public void testWindowTabs(){
        var startbuttonPage = homePage.clickDynamicLoad().rightClickExample2();
        getWindowManager().switchToNewTab();
        assertTrue(startbuttonPage.isStartButton());
    }
}
