package stepDefinition;

import org.openqa.selenium.By;

import PageObjects.LoginPage_pom;
import Utilities.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_sd extends BaseClass {

	/*
	String URL = "https://dsportalapp.herokuapp.com/login";
	
	By signIn_userName = By.xpath("//input[@name='username']");
	By signIn_passwordBtn = By.xpath("//input[@name='password']");	
	By loginBtn = By.xpath("//input[@value='Login']");
	By loggedIn_text = By.xpath("//div[@class='alert alert-primary']");
	
	*/
	
	@Given("User enters login page")
	public void User_enters_login_page() {
		
			BaseClass.loginPageUrl();
	}

	@When("^User enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) {
		
		new LoginPage_pom().signIn_userName(username)
		.signIn_passwordBtn(password)
		.loginBtn();		
		/*
		
		driver.findElement(signIn_userName).sendKeys(username);
		driver.findElement(signIn_passwordBtn).sendKeys(password);
		
		
		*/
	    	}

	@When("user clicks on login")
	public void user_clicks_on_login() {
		
		new LoginPage_pom().loginBtn();
		
		
	    	}

	@Then("User successfully logged in")
	public void User_successfully_logged_in() {
		
		BaseClass.msg_text();
		
		
		/*
		driver.findElement(loggedIn_text).isDisplayed();
		Thread.sleep(1000);
		
		*/
	    	}



}
