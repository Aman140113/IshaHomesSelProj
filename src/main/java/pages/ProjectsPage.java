package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.WaitUtils;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class ProjectsPage {
    WebDriver driver;

    public ProjectsPage(WebDriver driver) {
        this.driver = driver;
    }

    public List<String> getCompletedProjects() {
    	
	    	List<WebElement> allProjects = driver.findElements(By.xpath("//*[@id='boosted-tab-0']/div[1]/section/div/div/div/div/div/div/div/div"));
	    	List<String> validProjects = new ArrayList<>();
	    
        for (WebElement project : allProjects) {
        		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", project);
        		String name = project.findElement(By.xpath("./div/div/div[2]/h2/a")).getAttribute("innerText");
            validProjects.add(name);
        }
        
        
        return validProjects;
	}
}



