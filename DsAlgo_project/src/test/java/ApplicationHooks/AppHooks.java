package ApplicationHooks;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import DriverFactory.DriverInstance;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class AppHooks extends DriverInstance{
	
	@BeforeStep
//	public void beforeSteps(Scenario scenario) {

	public void beforeSteps() {
		
// 		System.out.println("Hi");
		
	}
	
	@BeforeStep
	public void getURLforDataStructure() {
		
	//	driver.get
		
	}
	
	@AfterStep
	public void afterSteps(Scenario scenario) {
//		System.out.println("Hello");
	}
	
	
	@Before
	public void beforeScenario(Scenario scenario) {
		
		System.setProperty("webdriver.msedge.driver","/Users/Priya/eclipse-workspace/Hello-World/src/test/resources/drivers/msedgedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	
	@After 
	public void afterScenario(Scenario scenario) {
		
	//	boolean failed = scenario.isFailed()
	//	System.out.println("Is failed");
		
		driver.quit();
		
		
	}
}
