package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccessibilityPage {

    private WebDriver driver;

    public AccessibilityPage(WebDriver driver){
        this.driver = driver;
    }

    public String getHeaderText(){
        return driver.findElement(By.tagName("h1")).getText();
    }
}
