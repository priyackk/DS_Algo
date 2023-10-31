package PageObjects;

import org.openqa.selenium.By;

import Utilities.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HomePage_pom extends BaseClass {

	By getStartedBtn = By.xpath("//button[text()='Get Started']");
	By dropDownBtn = By.xpath("//a[@class='nav-link dropdown-toggle']");
	By getStarted_DS = By.xpath("//div[@class='row row-cols-1 row-cols-md-3 g-4']//div[1]/a");
	By dropDown_Arrays = By.xpath("//div[@class='dropdown-menu show']/a[1]");
	By alertText = By.xpath("//div[@class='alert alert-primary']");
	By signInBtn = By.xpath("//a[text()='Sign in']");
	By registerBtn = By.xpath("//a[text()='Register!']");

	public homePageBrL getStartedBtn() {

		driver.findElement(getStartedBtn).click();
		return new homePageBrL();

	}
	
	public HomePage_pom getStarted_DS() {

		driver.findElement(getStarted_DS).click();
		return this;

	}


	public HomePage_pom dropDownBtn() {

		driver.findElement(dropDownBtn).click();
		return this;

	}

	public HomePage_pom dropDown_Arrays() {

		driver.findElement(dropDown_Arrays).click();
		return this;

	}

	public HomePage_pom alertText() {

		driver.findElement(alertText).click();
		return this;

	}

	public loginPageBrL signInBtn() {

		driver.findElement(signInBtn).click();
		return new loginPageBrL();

	}

	public registerPageBrL registerBtn() {

		driver.findElement(registerBtn).click();
		return new registerPageBrL();

	}
	
	/*

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
	
	*/

}
