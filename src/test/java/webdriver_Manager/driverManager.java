package webdriver_Manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverManager {
	
private static WebDriver driver = null;
	
	public static void launchBrowser() {
		
		driver = new ChromeDriver();
		
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
}
