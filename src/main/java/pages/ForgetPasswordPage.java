package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgetPasswordPage {
    private WebDriver driver;
    public ForgetPasswordPage(WebDriver driver){
        this.driver=driver;
    }
    public void SetEmail(String email){
        driver.findElement(By.id("email")).sendKeys(email);
    }
    public EmailSentPage clickRetrieveButton(){
        driver.findElement(By.id("form_submit")).click();
        return new EmailSentPage(driver);
    }
}
