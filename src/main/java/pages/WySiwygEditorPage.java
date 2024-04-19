package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WySiwygEditorPage {
    private WebDriver driver;
    public WySiwygEditorPage(WebDriver driver){
        this.driver=driver;
    }

    private void switchToEditArea(){
        driver.switchTo().frame("mce_0_ifr");
    }

    private void switchToMainArea(){
        driver.switchTo().parentFrame();
    }

    public void clearTextArea(){
        switchToEditArea();
        driver.findElement(By.id("tinymce")).clear();
        switchToMainArea();
    }

    public void setTextArea(String text){
        switchToEditArea();
        driver.findElement(By.id("tinymce")).sendKeys(text);
        switchToMainArea();
    }

    public String getTextArea(){
        switchToEditArea();
        String s = driver.findElement(By.id("tinymce")).getText();
        switchToMainArea();
        return s;
    }

    public void decreaseIndent(){
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[1]/div[1]/div[2]/div/div[5]/button[2]")).click();
    }



}
