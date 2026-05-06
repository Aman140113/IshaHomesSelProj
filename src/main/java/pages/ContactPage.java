package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class ContactPage {
    WebDriver driver;

    public ContactPage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToContact() {
        WebElement desk = driver.findElement(By.cssSelector("#menu-item-24516"));
        WebElement ele = driver.findElement(By.cssSelector("#menu-item-24517"));
        Actions act = new Actions(driver);
        act.moveToElement(desk).moveToElement(ele).click().build().perform();
    }

    public String getEmail() {
        WebElement emailElement = driver.findElement(By.xpath("//a[contains(@href, 'mailto:')]"));
        return emailElement.getText();
    }
}
