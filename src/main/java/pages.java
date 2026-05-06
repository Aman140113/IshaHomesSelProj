//
//import org.openqa.selenium.*;
//import org.openqa.selenium.interactions.Actions;
//import java.util.ArrayList;
//import java.util.List;
//
//public class pages {
//
//	WebDriver driver;
//    JavascriptExecutor js;
//
//    // Locators
//    By completedProjectsMenu = By.cssSelector("#menu-item-25810");
//    By projectTitles = By.cssSelector("h2.item-title a");
//    By moreMenu = By.cssSelector("#menu-item-24516");
//    By contactUsSubMenu = By.cssSelector("#menu-item-24517");
//    By popupClose = By.xpath("//a[contains(@class, 'close-indicator')]/child::*");
//
//    public pages(WebDriver driver) {
//        this.driver = driver;
//        this.js = (JavascriptExecutor) driver;
//    }
//
//    public void handlePopups() {
//        try {
//            if (!driver.findElements(popupClose).isEmpty()) {
//                driver.findElement(popupClose).click();
//            }
//            if (!driver.findElements(By.id("livprop_popup1")).isEmpty()) {
//                js.executeScript("document.getElementById('livchat_close').click();");
//            }
//        } catch (Exception e) { /* Popup not found */ }
//    }
//
//    public void clickCompletedProjects() {
//    	
//        driver.findElement(completedProjectsMenu).click();
//    }
//
//    public List<String> getFirstFiveProjectNames() {
//        List<WebElement> elements = driver.findElements(projectTitles);
//        List<String> names = new ArrayList<>();
//        for (int i = 0; i < Math.min(elements.size(), 5); i++) {
//            names.add(elements.get(i).getText().trim());
//        }
//        return names;
//    }
//
//    public void navigateToContactUs() {
//        Actions act = new Actions(driver);
//        WebElement more = driver.findElement(moreMenu);
//        WebElement contact = driver.findElement(contactUsSubMenu);
//        act.moveToElement(more).moveToElement(contact).click().perform();
//    }
//
//}
