//
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import java.io.FileInputStream;
//import java.util.Properties;
//
//
//public class Base {
//
//	public static WebDriver driver;
//	public static Properties prop;
//
//	public void initializeDriver() throws Exception {
//		prop = new Properties();
//		FileInputStream fis = new FileInputStream("src/test/resources/config.properties");
//		prop.load(fis);
//
//		String browser = prop.getProperty("browser");
//
//		if (browser.equalsIgnoreCase("chrome")) driver = new ChromeDriver();
//		else if (browser.equalsIgnoreCase("edge")) driver = new EdgeDriver();
//		else if (browser.equalsIgnoreCase("firefox")) driver = new FirefoxDriver();
//
//		driver.manage().window().maximize();
//		driver.get(prop.getProperty("url"));
//	}
//
//	public void tearDown() {
//		if (driver != null) driver.quit();
//	}
//
//
//}
