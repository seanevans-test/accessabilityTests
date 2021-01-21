package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage {

    private WebDriver driver;
    private By accessibilityLink = By.xpath("//a[@href='https://www.skyaccessibility.sky']");

    public Homepage(WebDriver driver){
//        WebDriverWait wait = new WebDriverWait(driver, 60);
        this.driver = driver;
    }

    public String findAccessibilityLink() {
        String accessibilityText = driver.findElement(accessibilityLink).getText();
        return accessibilityText;
    }

    public AccessibilityPage clickAccessibilityPage(){
        clickLink(accessibilityLink);
        return new AccessibilityPage(driver);
    }

    public void clickLink(By link){
        driver.findElement(link).click();
    }
}
