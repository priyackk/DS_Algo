package stepDefinition;

import PageObjects.RegisterPage_pom;
import Utilities.BaseClass;
import Utilities.CommonActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register_sd extends BaseClass {
	
	@Given("User is in the register page")
	public void user_is_in_the_register_page() {

		new CommonActions().registerPageUrl();

	}

	@When("Exploring the register page")
	public void exploring_the_register_page() {

		new RegisterPage_pom().registerBtn2()

				.userNameBtn("Ann").registerBtn2()
				.userNameBtn("Ann")
				.passwordBtn("Ann1234")
				.registerBtn2()

				.userNameBtnClear()
				.userNameBtn("!#*$")
				.registerBtn2()
				.passwordBtnClear()
				.passwordBtn("Ann1234")
				.passwordConfirmation("Ann1234")
				.registerBtn2()

				.userNameBtn("!#*$")
				.passwordBtn("Ann1234")
				.passwordConfirmation("Ann123456")
				.registerBtn2()

				.userNameBtn("!#*$")
				.passwordBtn("Ann12")
				.passwordConfirmation("Ann12")
				.registerBtn2()

				.userNameBtn("!#*$")
				.passwordBtn("12345678")
				.passwordConfirmation("12345678")
				.registerBtn2()

				.userNameBtn("TechieNinjas")
				.passwordBtn("Techie@132")
				.passwordConfirmation("Techie@132")
				.registerBtn2();

	}

	
	@Then("User created account succesfully")
	public void User_created_account_succesfully() {

		new CommonActions().msgText();

	}

}


/*
 * String URL = "https://dsportalapp.herokuapp.com/register";
 * 
 * By registerBtn2 = By.xpath("//input[@value='Register']"); By userName =
 * By.xpath("//input[@name='username']"); By passwordBtn =
 * By.xpath("//input[@name='password1']"); By passwordConfirmation =
 * By.xpath("//input[@name='password2']"); By accountCreated_text =
 * By.xpath("//div[@class='alert alert-primary']"); By signOutBtn =
 * By.xpath("//a[text()='Sign out']");
 * 
 */

/*
 * driver.findElement(registerBtn2).click();
 * driver.findElement(userName).sendKeys("Ann");
 * driver.findElement(registerBtn2).click();
 * driver.findElement(userName).sendKeys("Ann");
 * driver.findElement(passwordBtn).sendKeys("Ann1234");
 * driver.findElement(registerBtn2).click();
 * 
 * driver.findElement(userName).clear();
 * driver.findElement(userName).sendKeys("!#*$"); //
 * driver.findElement(registerBtn2).click();
 * driver.findElement(passwordBtn).clear();
 * driver.findElement(passwordBtn).sendKeys("Ann1234");
 * driver.findElement(passwordConfirmation).sendKeys("Ann1234");
 * 
 * driver.findElement(userName).sendKeys("!#*$");
 * driver.findElement(passwordBtn).sendKeys("Ann1234");
 * driver.findElement(passwordConfirmation).sendKeys("Ann123456");
 * driver.findElement(registerBtn2).click(); //Mismatch error
 * 
 * driver.findElement(userName).sendKeys("!#*$");
 * driver.findElement(passwordBtn).sendKeys("Ann12");
 * driver.findElement(passwordConfirmation).sendKeys("Ann12");
 * driver.findElement(registerBtn2).click();
 * 
 * driver.findElement(userName).sendKeys("!#*$");
 * driver.findElement(passwordBtn).sendKeys("12345678");
 * driver.findElement(passwordConfirmation).sendKeys("12345678");
 * driver.findElement(registerBtn2).click(); Thread.sleep(1000);
 * 
 * driver.findElement(userName).sendKeys("Anniec");
 * driver.findElement(passwordBtn).sendKeys("Ann123456");
 * driver.findElement(passwordConfirmation).sendKeys("Ann123456");
 * driver.findElement(registerBtn2).click(); Thread.sleep(1000);
 */


