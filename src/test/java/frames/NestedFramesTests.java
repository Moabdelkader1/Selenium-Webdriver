package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NestedFramesTests extends BaseTests {
    @Test
    public void testBottomAndLeftText(){
        var nestedFrames = homePage.clickNestedFrames();

        assertEquals(nestedFrames.getTextinLeftFrame(),"LEFT");
        assertEquals(nestedFrames.getTextinBottomFrame(),"BOTTOM");
    }
}
