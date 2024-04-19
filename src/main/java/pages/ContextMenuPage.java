package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {
    private WebDriver driver;


    public ContextMenuPage(WebDriver driver){
        this.driver=driver;
    }

    public void pressRightClick(){
        var element = driver.findElement(By.xpath("//*[@id=\"hot-spot\"]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
        actions.contextClick().perform();
    }

    public void closeAlert(){
        driver.switchTo().alert().accept();
    }

    public String get_AlertText(){
        return driver.switchTo().alert().getText();
    }

}
