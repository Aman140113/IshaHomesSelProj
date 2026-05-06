//
//
//import org.openqa.selenium.*;
//import org.openqa.selenium.io.FileHandler;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import java.io.File;
//import java.io.IOException;
//import java.time.Duration;
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//
// 
//public class utilities {
//	
//	
//	public static void waitForElementVisible(WebDriver driver, By locator) {
//        new WebDriverWait(driver, Duration.ofSeconds(10))
//            .until(ExpectedConditions.visibilityOfElementLocated(locator));
//    }
//
////    public static void takeScreenshot(WebDriver driver, String fileName) throws Exception {
////        TakesScreenshot scrShot = (TakesScreenshot) driver;
////        File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
////        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
////        File destFile = new File("screenshots/" + fileName + "_" + timestamp + ".png");
////        FileHandler.copy(srcFile, destFile);
////    }
//
//	public static void takeScreenshot1(WebDriver driver, String fileName) throws IOException {
//		// TODO Auto-generated method stub
////		TakesScreenshot scrShot = (TakesScreenshot) driver;
////        File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
////        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
////        File destFile = new File("screenshots/" + fileName + "_" + timestamp + ".png");
////        FileHandler.copy(srcFile, destFile);
//		
//		TakesScreenshot scrShot = (TakesScreenshot) driver;
//		File contactSS = scrShot.getScreenshotAs(OutputType.FILE);
//		
//		LocalDateTime curr = LocalDateTime.now();
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
//		String timeStr = String.format("C:\\Mini_Pro\\screenshot_%s.png", dtf.format(curr));
//		
//		File destContactSS = new File(timeStr);
//		FileHandler.copy(contactSS, destContactSS);
//		
//	}
//	
//	
//
//}
