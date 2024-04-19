package slider;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HomePage;

import static org.testng.AssertJUnit.assertEquals;

public class SliderHorizontalTests extends BaseTests {
    @Test
    public void testSlider(){
        var horizontalSlider = homePage.clickHorizontalSlider();
        horizontalSlider.moveSlider(4);
        assertEquals(horizontalSlider.getResult(),"4");
    }
}
