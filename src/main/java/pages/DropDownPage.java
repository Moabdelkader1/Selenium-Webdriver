package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropDownPage {
    private WebDriver driver;
    private By dropdown = By.id("dropdown");
    public DropDownPage(WebDriver driver){
        this.driver=driver;
    }
    public void selectFromDropdown(String option){
         findDropdownElement().selectByVisibleText(option);
    }
    public List<String> getSelectedOptions(){
        List<WebElement> selectedElements =  findDropdownElement().getAllSelectedOptions();
        return selectedElements.stream().map(e -> e.getText()).collect(Collectors.toList());
    }

    public void editDropDown(){
        String script="arguments[0].setAttribute('multiple', '')";
        WebElement dropDownElement = driver.findElement(dropdown);
        ((JavascriptExecutor)driver).executeScript(script,dropDownElement);
    }

    private Select findDropdownElement(){
        return new Select(driver.findElement(dropdown));
    }


}
