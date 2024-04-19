package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;
    public FileUploadPage(WebDriver driver){
        this.driver=driver;
    }

    public void clickUploadButton(){
        driver.findElement(By.xpath("//*[@id=\"file-submit\"]")).click();
    }
    public void uploadFile(String path){
        driver.findElement(By.xpath("//*[@id=\"file-upload\"]")).sendKeys(path);
    }
    public String getUploadedFile(){
        return driver.findElement(By.id("uploaded-files")).getText();
    }
}
