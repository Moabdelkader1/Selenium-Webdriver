package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicLoadPage {
    private WebDriver driver;
    public DynamicLoadPage(WebDriver driver){
        this.driver=driver;
    }

    public DynamicLoadExample1Page clickExample1(){
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/a[1]")).click();
        return new DynamicLoadExample1Page(driver);
    }

    public DynamicLoadExample2Page clickExample2(){
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/a[2]")).click();
        return new DynamicLoadExample2Page(driver);
    }

    public DynamicLoadExample2Page rightClickExample2(){
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/a[2]")).sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
        return new DynamicLoadExample2Page(driver);
    }

}
