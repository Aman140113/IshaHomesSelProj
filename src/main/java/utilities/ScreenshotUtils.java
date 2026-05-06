package utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;
import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ScreenshotUtils  {
    public static void takeScreenshot(WebDriver driver, String filePath) throws Exception {
        TakesScreenshot scrShot = (TakesScreenshot) driver;
        File srcFile = scrShot.getScreenshotAs(OutputType.FILE);

        LocalDateTime curr = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
        String timeStr = String.format(System.getProperty("user.dir") + "%s\\screenshots_%s.png", filePath, dtf.format(curr));

        File destFile = new File(timeStr);
        FileHandler.copy(srcFile, destFile);
    }
}
