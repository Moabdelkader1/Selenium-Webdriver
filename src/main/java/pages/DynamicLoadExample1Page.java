package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadExample1Page {
    private WebDriver driver;
    public DynamicLoadExample1Page(WebDriver driver){
        this.driver=driver;
    }

    public void clickStartButton(){
        driver.findElement(By.xpath("//*[@id=\"start\"]/button")).click();
        WebDriverWait wait = new WebDriverWait(driver,5);
        //FluentWait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.id("loading"))));
    }
    public String getText(){
        return driver.findElement(By.id("finish")).getText();
    }
}
