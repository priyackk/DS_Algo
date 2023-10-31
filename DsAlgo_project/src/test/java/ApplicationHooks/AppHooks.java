package ApplicationHooks;
import Utilities.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class AppHooks extends BaseClass {
	
		
	@Before
	public static void beforeScenario(Scenario scenario) {
		
		BaseClass.openDriver("chrome");
		
	}
	
	@After 
	public void afterScenario(Scenario scenario) {
		/*
		//Check to see if scenario has failed
		if(scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) BaseClass.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot,"image/png",scenario.getName());
		*/
		
	 BaseClass.closeDriver();		
      			
	}
}
