package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class KeysTests extends BaseTests {
    @Test
    public void testKeys() {
        var keyPressesPage = homePage.clickKeyPressesPage();
        keyPressesPage.enterText("a" + Keys.BACK_SPACE);
        assertEquals(keyPressesPage.getResult(), "You entered: BACK_SPACE");
    }

}
