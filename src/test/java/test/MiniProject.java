package test;

import base.DriverFactory;
import pages.HomePage;
import pages.ProjectsPage;
import pages.ContactPage;
import utilities.ScreenshotUtils;
import utilities.WritingExcel;
import utilities.ConfigReader;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class MiniProject {
    public WebDriver driver;
    public HomePage home;
    public ProjectsPage projects;
    public ContactPage contact;
    public JavascriptExecutor js;

    @BeforeClass
    public void setup() throws Exception {
        // Load configuration and initialize the driver
        ConfigReader.loadConfig();
        driver = DriverFactory.initDriver();
        driver.get(ConfigReader.getProperty("url"));
        driver.manage().window().maximize();
        
        js = (JavascriptExecutor) driver;
        
        // Initialize Page Objects
        home = new HomePage(driver);
        projects = new ProjectsPage(driver);
        contact = new ContactPage(driver);
    }

    @Test(priority = 1)
    public void testNavigationAndPopups() throws InterruptedException {
    	
        // Step 1: Handle popup and navigate to Projects
        home.closePopups();
        home.navigateToProjects();
        
    }

    @Test(priority = 2)
    public void testGetProjectDetails() {
    	
        // Step 2: Extract project names
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)");
    	
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='boosted-tab-0']/div[1]/section/div/div/div/div/div/div/div/div/div/div/div[2]")));
    	
        List<String> validProjects = projects.getCompletedProjects();
        System.out.println("Total Number of Completed Projects: " + validProjects.size());

        // Print first 5 projects
        for (int i = 0; i < validProjects.size() && validProjects.size()>0; i++) {
            System.out.println((i + 1) + ". " + validProjects.get(i));
        }
        WritingExcel we = new WritingExcel(validProjects);
        we.createExcel("writing.xlsx");
        
    }

    @Test(priority = 3)
    public void testContactAndScreenshot() throws Exception {
        // Step 3: Navigate to contact and capture screenshot
        contact.navigateToContact();
        
        // Capture screenshot using Utility
        WebElement element = driver.findElement(By.xpath("//*[contains(text(), 'To Buy a Property:')]"));
        ((JavascriptExecutor) driver).executeScript(
            "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'});", 
            element
        );
        
        //Page loading for screenshot
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(
        	    webDriver -> ((JavascriptExecutor) webDriver)
        	        .executeScript("return document.readyState").equals("complete")
        	);
        
        ScreenshotUtils.takeScreenshot(driver, ConfigReader.getProperty("screenshotPath"));
        
        // Print and Verify Email
        String email = contact.getEmail();
        System.out.println("The contact email is: " + email);
        Assert.assertNotNull(email, "Email address is missing from the Contact Page!");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}