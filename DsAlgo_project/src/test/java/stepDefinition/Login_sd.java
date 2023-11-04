package stepDefinition;

import PageObjects.LoginPage_pom;
import Utilities.BaseClass;
import Utilities.CommonActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_sd extends BaseClass {

	
	@Given("User enters login page")
	public void User_enters_login_page() {
		
		new CommonActions().logInPageUrl();
	}

	@When("^User enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) {
		
		new LoginPage_pom().signIn_userName(username)
		.signIn_passwordBtn(password)
		.loginBtn();		

	    	}

	@When("user clicks on login")
	public void user_clicks_on_login() {
		
		new LoginPage_pom().loginBtn();
		
		
	    	}

	@Then("User successfully logged in")
	public void User_successfully_logged_in() {
		
		new CommonActions().msgText();
		
	    	}



}
