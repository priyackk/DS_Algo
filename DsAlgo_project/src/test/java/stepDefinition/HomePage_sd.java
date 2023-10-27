package stepDefinition;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import DriverFactory.DriverInstance;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePage_sd extends DriverInstance {
	
	String URL = "https://dsportalapp.herokuapp.com/";
	
	By getStartedBtn = By.xpath("//button[text()='Get Started']");
	By dropDownBtn = By.xpath("//a[@class='nav-link dropdown-toggle']");
	By getStarted_DS = By.xpath("//div[@class='row row-cols-1 row-cols-md-3 g-4']//div[1]/a");
	By dropDown_Arrays = By.xpath("//div[@class='dropdown-menu show']/a[1]");
	By alertText = By.xpath("//div[@class='alert alert-primary']");
	By signInBtn = By.xpath("//a[text()='Sign in']");
	By registerBtn = By.xpath("//a[text()='Register!']");
	

	
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
		
				driver.get(URL);
	    
	}

	@When("I complete action")
	public void i_complete_action() {
		driver.findElement(getStartedBtn).click();
		driver.findElement(dropDownBtn).click();
		driver.findElement(getStarted_DS).click();
		driver.findElement(dropDownBtn).click();
		driver.findElement(dropDown_Arrays).click();
		driver.findElement(alertText).isDisplayed();
		driver.findElement(signInBtn).click();
		driver.findElement(registerBtn).click();	
		
	    	}

}
