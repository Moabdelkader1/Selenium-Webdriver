package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class FramesTests extends BaseTests {
    @Test
    public void testWysiwyg(){
        var editorPage = homePage.clickWySiwygEditor();
        editorPage.clearTextArea();

        String s1="Hello";
        String s2="World";

        editorPage.setTextArea(s1);
        editorPage.decreaseIndent();
        editorPage.setTextArea(s2);

        assertEquals(editorPage.getTextArea(),s1+s2);

    }
}
