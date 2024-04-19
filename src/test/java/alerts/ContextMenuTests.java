package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ContextMenuTests extends BaseTests {
    @Test
    public void testAlertFromContextMenu(){
        var contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.pressRightClick();
        assertEquals("Text in alert doesn't match",contextMenuPage.get_AlertText(),"You selected a context menu");
        contextMenuPage.closeAlert();
    }
}
