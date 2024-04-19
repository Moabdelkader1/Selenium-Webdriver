package hover;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HoversPage;

import static org.testng.AssertJUnit.*;

public class HoverTests extends BaseTests {

    @Test
    public void testHoverUser1(){
        var hoverPage = homePage.clickHoversPage();
        var figureCaption =hoverPage.hoverOverFigure(1);
        assertTrue(figureCaption.isCaptionDisplayed());
        assertEquals(figureCaption.getTitle(),"name: user1");
        assertTrue(figureCaption.getLink().endsWith("/users/1"));
        assertEquals(figureCaption.getLinkText(),"View profile");

    }
}
