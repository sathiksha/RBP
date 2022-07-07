package commonutilities;

import java.io.File;
import java.io.IOException;
import java.util.Properties;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;

import constants.constant;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import pageObject.ConfigFreeBuitPageObject;
import webdriver_Manager.driverManager;

public class commonUtils {
	
	public  void loadproperties() throws IOException {
	
	Properties properties = new Properties();
	properties.load(getClass().getResourceAsStream("/confiq.properties"));
	
    constant.URL =	properties.getProperty("URL");
		
	constant.BROWSER =	properties.getProperty("BROWSER");
		
	constant.USERNAME =	properties.getProperty("username");
		
	constant.PASSWORD =	properties.getProperty("password");
	
	}
	
	public void initWebElemets() {
		
		PageFactory.initElements(driverManager.getDriver(),ConfigFreeBuitPageObject.getInstance());
	
	}
	
	public void takeScreenshot() throws IOException {
		
		File screenshot = ((TakesScreenshot) driverManager.getDriver()).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(screenshot, new File ("screenshot.png"));
	}
	
}
