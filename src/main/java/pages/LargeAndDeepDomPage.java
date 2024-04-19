package pages;

import org.openqa.selenium.*;

public class LargeAndDeepDomPage {
    private WebDriver driver;
    public LargeAndDeepDomPage(WebDriver driver){
        this.driver=driver;
    }

    public void scrollToTable(){
        WebElement tableElement = driver.findElement(By.id("large-table"));
        String script="arguments[0].scrollIntoView();";
        ((JavascriptExecutor)driver).executeScript(script,tableElement);
    }
}
