package com.bnb.step_definitions;

import com.bnb.utilities.DBUtils;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	@Before("@db")
	public void setUpDBConnection() {
		DBUtils.createConnection();
	}

	@After("@db")
	public void tearDownDBConnection() {
		DBUtils.destroy();
	}

	
//	@Before
//	public void setUp() {
//		Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		Driver.getDriver().manage().window().maximize();
//		// Driver.getDriver().get(ConfigurationReader.getProperty("url"));
//	}
//
//
//	@After
//	public void tearDown(Scenario scenario) {
//		// only takes a screenshot if the scenario fails
//		if (scenario.isFailed()) {
//			// taking a screenshot
//			final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
//			// adding the screenshot to the report
//			scenario.embed(screenshot, "image/png");
//		}
//		Driver.closeDriver();
//	}
	
}
