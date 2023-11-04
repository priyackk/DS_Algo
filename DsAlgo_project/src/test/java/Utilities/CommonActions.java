package Utilities;

import org.openqa.selenium.By;

public class CommonActions extends BaseClass {

	String dsPortalUrl = "https://dsportalapp.herokuapp.com/";
	String registerPageUrl = "https://dsportalapp.herokuapp.com/register";
	String homePageUrl = "https://dsportalapp.herokuapp.com/home";
	String logInPageUrl = "https://dsportalapp.herokuapp.com/login";

	By msgText = By.xpath("//div[@class='alert alert-primary']");
	By signInUsername = By.xpath("//input[@name='username']");
	By signInPassword = By.xpath("//input[@name='password']");
	By logInBtn = By.xpath("//input[@value='Login']");
	By signInBtn = By.xpath("//a[text()='Sign in']");

	By tryHereBtn = By.xpath("//a[@class='btn btn-info']");
	By tryEditorBox = By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	By runBtn = By.xpath("//*[@id='answer_form']/button");
	By outputText = By.xpath("//pre[@id='output']");
	By practiceQuesBtn = By.xpath("//a[@class='list-group-item list-group-item-light text-info']");

	public CommonActions dsPortalUrl() {

		driver.get(dsPortalUrl);
		return this;

	}

	public CommonActions registerPageUrl() {

		driver.get(registerPageUrl);
		return this;
	}

	public CommonActions homePageUrl() {

		driver.get(homePageUrl);
		return this;
	}

	public CommonActions logInPageUrl() {

		driver.get(logInPageUrl);
		return this;
	}

	public CommonActions signInBtn() {

		driver.findElement(signInBtn).click();
		return this;
	}

	public CommonActions msgText() {

		driver.findElement(msgText).isDisplayed();
		return this;
	}

	public CommonActions login() {

		driver.findElement(signInBtn).click();
		driver.findElement(signInUsername).sendKeys("TechieNinjas");
		driver.findElement(signInPassword).sendKeys("Techie@132");
		driver.findElement(logInBtn).click();
		return this;

	}

	public CommonActions navigateBack() {

		driver.navigate().back();
		return this;
	}

	public CommonActions tryAndRunValid(String input) throws InterruptedException {
		driver.findElement(tryHereBtn).click();
		Thread.sleep(200);
		driver.findElement(tryEditorBox).sendKeys(input);
		driver.findElement(runBtn).click();
		driver.findElement(outputText).isDisplayed();
		return this;
	}

	public CommonActions tryAndRunInvalid(String errorInput) throws InterruptedException {
		driver.findElement(tryHereBtn).click();
		Thread.sleep(300);
		driver.findElement(tryEditorBox).sendKeys(errorInput);
		driver.findElement(runBtn).click();
		Thread.sleep(300);
		driver.switchTo().alert().accept();
		return this;

	}

	public CommonActions practiceQuesBtn() {

		driver.findElement(practiceQuesBtn).click();
		return this;

	}

}
