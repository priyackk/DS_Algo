package ApplicationHooks;
import Utilities.BaseClass;
import Utilities.ConfigReader;
import Utilities.LoggerLoad;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;

public class AppHooks extends BaseClass {
	
		
	@Before
	
	public static void beforeScenario() throws Throwable {
		// Get browser type from config file
		LoggerLoad.info("Loading config file");
		ConfigReader.loadConfig();
		String browser = ConfigReader.getBrowserType();
		BaseClass.openDriver(ConfigReader.getBrowserType());
		LoggerLoad.info("Initializing driver for:"+browser);  
		
				
	}
	
	@After 
	public void afterScenario() {
		
		/*
		//Check to see if scenario has failed
		if(scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) BaseClass.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot,"image/png",scenario.getName());
		*/
		
	 BaseClass.closeDriver();		
      			
	}
}
