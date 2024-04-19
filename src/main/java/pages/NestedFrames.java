package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFrames {
    private WebDriver driver;
    public NestedFrames(WebDriver driver){
        this.driver=driver;
    }
    private void switchToMainFrame(){
        driver.switchTo().parentFrame();
    }

    public String getTextinBottomFrame(){
        driver.switchTo().frame(1);
        String text = driver.findElement(By.xpath("/html/body")).getText();
        switchToMainFrame();
        return text;
    }

    public String getTextinLeftFrame(){
        driver.switchTo().frame(driver.findElement(By.xpath("/html/frameset/frame[1]")));
        driver.switchTo().frame(0);

        String text = driver.findElement(By.xpath("/html/body")).getText();

        switchToMainFrame();
        switchToMainFrame();

        return text;
    }
}
