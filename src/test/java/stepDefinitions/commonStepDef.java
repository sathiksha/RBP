package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import commonutilities.commonUtils;
import constants.constant;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import webdriver_Manager.driverManager;

public class commonStepDef {
	
	@Before
	public void beforeScenario() throws IOException, InterruptedException {
		
		commonUtils commonUtils = new commonUtils();
		
		commonUtils.loadproperties();
		
		if(driverManager.getDriver()==null)
		driverManager.launchBrowser();
		driverManager.getDriver().manage().window().maximize();
		commonUtils.initWebElemets();
		loginStep();
	}
	
	private void loginStep() throws InterruptedException {
		
		driverManager.getDriver().get(constant.URL);
	}
	
	@AfterStep
	public void attachScreenshot(Scenario scenario) {
		
		if (scenario.isFailed()) {
			
	    byte []  screenshotTaken  =((TakesScreenshot) driverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
	    
	    scenario.attach(screenshotTaken, "image/png", "error screen");
		}
	}
	
}
