package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DropDownPage;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class DropdownTests extends BaseTests {
    @Test
    public void testSelectOption(){
        var dropDownPage = homePage.clickDropDown();
        dropDownPage.selectFromDropdown("Option 1");

        var selectedoptions = dropDownPage.getSelectedOptions();
        String option = "Option 1";

        assertTrue(selectedoptions.contains(option));
        assertEquals("Incorrect number of options",selectedoptions.size(),1);
    }

    @Test
    public void testEditableDropDown(){
        var dropDownPage = homePage.clickDropDown();
        dropDownPage.editDropDown();
        dropDownPage.selectFromDropdown("Option 1");
        dropDownPage.selectFromDropdown("Option 2");
        assertEquals(dropDownPage.getSelectedOptions().size(),2);
        assertEquals(dropDownPage.getSelectedOptions().get(0),"Option 1");
        assertEquals(dropDownPage.getSelectedOptions().get(1),"Option 2");

    }
}
