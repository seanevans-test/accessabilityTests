package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {

    private WebDriver driver;

    public Homepage(WebDriver driver){this.driver = driver;}

    public AccessabilityPage clickAccessabilityPage(){
        clickLink("");
        return new AccessabilityPage(driver);

    }

    public void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}