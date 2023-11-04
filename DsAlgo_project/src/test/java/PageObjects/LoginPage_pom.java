package PageObjects;

import org.openqa.selenium.By;

import Utilities.BaseClass;

public class LoginPage_pom extends BaseClass {

	By signIn_userName = By.xpath("//input[@name='username']");
	By signIn_passwordBtn = By.xpath("//input[@name='password']");
	By loginBtn = By.xpath("//input[@value='Login']");
	By loggedIn_text = By.xpath("//div[@class='alert alert-primary']");

	public LoginPage_pom signIn_userName(String username) {

		driver.findElement(signIn_userName).sendKeys(username);
		return this;

	}

	public LoginPage_pom signIn_passwordBtn(String password) {

		driver.findElement(signIn_passwordBtn).sendKeys(password);
		return this;

	}

	public loginBtnpage loginBtn() {

		driver.findElement(loginBtn).click();
		return new loginBtnpage();

	}

	/*
	 * public LoginPage_pom login(String username,String password) {
	 * 
	 * driver.findElement(signIn_userName).sendKeys(username);
	 * driver.findElement(signIn_passwordBtn).sendKeys(password);
	 * driver.findElement(loginBtn).click(); return this;
	 * 
	 * }
	 */

}
