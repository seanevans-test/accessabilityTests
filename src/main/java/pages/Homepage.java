package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage {

    private WebDriver driver;
    private By accessibilityLink = By.xpath("//a[@href='https://www.skyaccessibility.sky']");
    private By cookiesAcceptClass = By.xpath("//button[@class='sp_message-accept-button']");

    public Homepage(WebDriver driver){
        this.driver = driver;
    }

    public String findAccessibilityLink() {
        String accessibilityText = driver.findElement(accessibilityLink).getText();
        return accessibilityText;
    }

    public void acceptCookies() {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(cookiesAcceptClass));
        driver.findElement(cookiesAcceptClass).click();
//        driver.findElement(By.cssSelector("button.sp_message-accept-button")).click();
//        driver.findElement(cookiesAcceptClass).click();
    }

    public AccessibilityPage clickAccessibilityPage() {
        clickLink(accessibilityLink);
        return new AccessibilityPage(driver);
    }

    public void clickLink(By link) {
        driver.findElement(link).click();
    }
}
