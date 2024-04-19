package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
    private WebDriver driver;

    public AlertsPage(WebDriver driver){
        this.driver=driver;
    }

    public void triggerAlert(){
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
    }

    public void triggerConfirm(){
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
    }

    public void triggerPrompt(){
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
    }

    public void alert_clickToAccept(){
        driver.switchTo().alert().accept();
    }

    public void alert_clickToDismiss(){
        driver.switchTo().alert().dismiss();
    }

    public void alert_SetText(String text){
        driver.switchTo().alert().sendKeys(text);
    }
    public String alert_getText(){
        return driver.switchTo().alert().getText();
    }

    public String getResult(){
        return driver.findElement(By.id("result")).getText();
    }


}
