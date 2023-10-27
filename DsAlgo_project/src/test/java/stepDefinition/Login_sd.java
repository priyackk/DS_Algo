package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import DriverFactory.DriverInstance;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_sd extends DriverInstance{
	
	String URL = "https://dsportalapp.herokuapp.com/login";
	
	By signIn_userName = By.xpath("//input[@name='username']");
	By signIn_passwordBtn = By.xpath("//input[@name='password']");	
	By loginBtn = By.xpath("//input[@value='Login']");
	By loggedIn_text = By.xpath("//div[@class='alert alert-primary']");
	
	@Given("browser is open")
	public void browser_is_open() {
			driver.get(URL);	    
	}

	@When("^User enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) {
		
		driver.findElement(signIn_userName).sendKeys(username);
		driver.findElement(signIn_passwordBtn).sendKeys(password);
	    	}

	@When("user clicks on login")
	public void user_clicks_on_login() {
		
		driver.findElement(loginBtn).click();
		
	    	}

	@Then("User navigates to home page")
	public void user_navigates_to_home_page() throws InterruptedException{
		driver.findElement(loggedIn_text).isDisplayed();
		Thread.sleep(1000);
	    	}



}
