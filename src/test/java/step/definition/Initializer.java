package step.definition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import core.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Initializer extends Base{
	@Before
	public void beforeHooks(Scenario scenario) {
		logger.info("Scenario " + scenario.getName() + " started");
		selectBrowser(); // this method will select the browser 
		launchBrowser(); // this method will launch the browser
		
	}
	
	
	
	@After
	public void afterHooks(Scenario scenario) {
		
		if(scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "Failed Test");
			tearDown();
			logger.info("Scenario " + scenario.getName() + " " + scenario.getStatus());
		}else {
			tearDown();
			logger.info("Scenario " + scenario.getName() + " " + scenario.getStatus());
		}
	}

	
}
