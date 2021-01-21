package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {

    private WebDriver driver;

    public Homepage(WebDriver driver){this.driver = driver;}

    public AccessibilityPage clickAccessibilityPage(){
        clickLink("Accessibility");
        return new AccessibilityPage(driver);

    }

    public void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}
