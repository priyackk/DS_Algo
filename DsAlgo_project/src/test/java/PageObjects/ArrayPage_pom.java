package PageObjects;

import org.openqa.selenium.By;

import Utilities.BaseClass;

public class ArrayPage_pom extends BaseClass {

	
	By getStarted_Arrays = By.xpath("//div[@class='row row-cols-1 row-cols-md-3 g-4']//div[2]//a");
	By arraysPythonBtn = By.xpath("//a[text()='Arrays in Python']");

	By arraysListBtn = By.xpath("//a[text()='Arrays Using List']");
	By basicOperationBtn = By.xpath("//a[text()='Basic Operations in Lists']");
	By applcnOfArrayBtn = By.xpath("//a[text()='Applications of Array']");

	By searchArrayBtn = By.xpath("//a[text()='Search the array']");
	By maxConsOnesBtn = By.xpath("//a[text()='Max Consecutive Ones']");
	By evenNoOfDigitsBtn = By.xpath("//a[text()='Find Numbers with Even Number of Digits']");
	By sqOfSortedArrayBtn = By.xpath("//a[text()='Squares of  a Sorted Array']");
	
	String arrayPageURL = "https://dsportalapp.herokuapp.com/array/";
	
//	By practiceQuesFrArray = By.xpath("//a[text()='Practice Questions']");

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
	public ArrayPage_pom navigateBackAP() {
		
		driver.navigate().to(arrayPageURL);
		return this;
	}

	public ArrayPage_pom applcnOfArrayBtn() {
        
		driver.findElement(applcnOfArrayBtn).click();
		System.out.println("Ater clicking Application array button");
		return this;

	}
	

	public searchtheArrayPage searchArrayBtn() {

		driver.findElement(searchArrayBtn).click();
		return new searchtheArrayPage();

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


/*
public pracPage practiceQuesFrArray() throws InterruptedException{	
    Thread.sleep(300);
	driver.findElement(practiceQuesFrArray).click();
	System.out.println("Ater clicking practice button");
	return new pracPage();

}
*/
