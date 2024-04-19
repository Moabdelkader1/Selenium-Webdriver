package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {
    private WebDriver driver;
    public HorizontalSliderPage(WebDriver driver){
        this.driver=driver;
    }

    public void moveSlider(int num){
        while (Float.parseFloat(getResult()) != num) {
            driver.findElement(By.tagName("input")).sendKeys(Keys.ARROW_RIGHT);
        }
    }
    public String getResult(){
        return driver.findElement(By.id("range")).getText();
    }
}
