package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollPage {
    private WebDriver driver;
    private By textblock = By.id("jscroll-added");
    public InfiniteScrollPage(WebDriver driver){
        this.driver=driver;
    }

    /**
     *
     * @param index starts at 1
     */
    public void scrollToParaghraph(int index){
        String script = "window.scrollTo(0,document.body.scrollHeight)";
        while (getNumberOfParaghraphsPresent()<index){
            ((JavascriptExecutor)driver).executeScript(script);
        }
    }

    public int getNumberOfParaghraphsPresent(){
        return driver.findElements(textblock).size();
    }

}
