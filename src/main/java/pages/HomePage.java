package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class HomePage {
    WebDriver driver;
    JavascriptExecutor js;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.js = (JavascriptExecutor) driver;
    }

    public void closePopups() {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    	wait.until(ExpectedConditions.or(
	    		    ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='livchat_close']")),
	    		    ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='indicator-close']/a"))
	    		));
        if (!driver.findElements(By.xpath("//a[contains(@class, 'close-indicator')]/svg")).isEmpty()) {
            driver.findElement(By.xpath("//a[contains(@class, 'close-indicator')]/child::*")).click();
        }
        if (!driver.findElements(By.id("livprop_popup1")).isEmpty()) {
            js.executeScript("document.getElementById('livchat_close').click();");
        }
    }

    public void navigateToProjects() {
        driver.findElement(By.xpath("//*[@id='menu-item-25810']/a")).click();
    }
}
