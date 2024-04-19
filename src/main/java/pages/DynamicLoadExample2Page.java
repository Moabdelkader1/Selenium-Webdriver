package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoadExample2Page {
    private WebDriver driver;
    private By output = By.xpath("//*[@id=\"finish\"]/h4");
    public DynamicLoadExample2Page(WebDriver driver){
        this.driver=driver;
    }

    public void clickStartButton(){
        driver.findElement(By.xpath("//*[@id=\"start\"]/button")).click();
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.id("loading"))));
    }

    public String getText(){
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(output)));
        return driver.findElement(output).getText();
    }
    public Boolean isStartButton(){
        return driver.findElement(By.xpath("//*[@id=\"start\"]/button")).isDisplayed();
    }
}
