package PageObjects;

import org.openqa.selenium.By;

import Utilities.BaseClass;

public class ArrayPage_pom extends BaseClass {

	
	/*
	By signInBtn = By.xpath("//a[text()='Sign in']");
	By signIn_userName = By.xpath("//input[@name='username']");
	By signIn_passwordBtn = By.xpath("//input[@name='password']");
	By loginBtn = By.xpath("//input[@value='Login']");
	By msgText = By.xpath("//div[@class='alert alert-primary']");
	*/

	By getStarted_Arrays = By.xpath("//div[@class='row row-cols-1 row-cols-md-3 g-4']//div[2]//a");
	By arraysPythonBtn = By.xpath("//a[text()='Arrays in Python']");

	By tryHereBtn = By.xpath("//a[@class='btn btn-info']");
	By textEditorBtn = By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	By runBtn = By.xpath("//*[@id='answer_form']/button");
	By outputText = By.xpath("//pre[@id='output']");

	By arraysListBtn = By.xpath("//a[text()='Arrays Using List']");
	By basicOperationBtn = By.xpath("//a[text()='Basic Operations in Lists']");
	By applcnOfArrayBtn = By.xpath("//a[text()='Applications of Array']");

	By pracQnBtn = By.xpath("//a[text()='Practice Questions']");

	By searchArrayBtn = By.xpath("//a[text()='Search the array']");
	By maxConsOnesBtn = By.xpath("//a[text()='Max Consecutive Ones']");
	By evenNoOfDigitsBtn = By.xpath("//a[text()='Find Numbers with Even Number of Digits']");
	By sqOfSortedArrayBtn = By.xpath("//a[text()='Squares of  a Sorted Array']");

	public getStarted_ArraysArL getStarted_Arrays() {

		driver.findElement(getStarted_Arrays).click();
		return new getStarted_ArraysArL();

	}

	public ArrayPage_pom arraysPythonBtn() {

		driver.findElement(arraysPythonBtn).click();
		return this;

	}

	public ArrayPage_pom arraysListBtn() {

		driver.findElement(arraysListBtn).click();
		return this;

	}

	public ArrayPage_pom basicOperationBtn() {

		driver.findElement(basicOperationBtn).click();
		return this;

	}

	public ArrayPage_pom applcnOfArrayBtn() {

		driver.findElement(applcnOfArrayBtn).click();
		return this;

	}

	public ArrayPage_pom pracQnBtn() {

		driver.findElement(pracQnBtn).click();
		return this;

	}

	public ArrayPage_pom searchArrayBtn() {

		driver.findElement(searchArrayBtn).click();
		return this;

	}

	public ArrayPage_pom maxConsOnesBtn() {

		driver.findElement(maxConsOnesBtn).click();
		return this;

	}

	public ArrayPage_pom evenNoOfDigitsBtn() {

		driver.findElement(evenNoOfDigitsBtn).click();
		return this;

	}

	public ArrayPage_pom sqOfSortedArrayBtn() {

		driver.findElement(sqOfSortedArrayBtn).click();
		return this;

	}

}
