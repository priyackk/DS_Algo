package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import DriverFactory.DriverInstance;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class ArraysPage_sd extends DriverInstance{
		
	String URL = "https://dsportalapp.herokuapp.com/home";
	
	By signInBtn = By.xpath("//a[text()='Sign in']");
	By signIn_userName = By.xpath("//input[@name='username']");
	By signIn_passwordBtn = By.xpath("//input[@name='password']");
	By loginBtn = By.xpath("//input[@value='Login']");
	By msgText = By.xpath("//div[@class='alert alert-primary']");
	By getStarted_Arrays = By.xpath("//div[@class='row row-cols-1 row-cols-md-3 g-4']//div[2]//a");
	By arraysPythonBtn = By.xpath("//a[text()='Arrays in Python']");
	By tryHereBtn_Arrays = By.xpath("//a[@class='btn btn-info']");
	
	By textEditorBtn = By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	By runBtn = By.xpath("//*[@id='answer_form']/button");
	By outputText = By.xpath("//pre[@id='output']");
	By arraysListBtn = By.xpath("//a[text()='Arrays Using List']");
	By tryHereBtn_List = By.xpath("//a[text()='Try here>>>']");
    By basicOperationBtn = By.xpath("//a[text()='Basic Operations in Lists']");
    By tryHereBtn_basicOperation= By.xpath("//a[@class='btn btn-info']");  
    By applcnOfArrayBtn = By.xpath("//a[text()='Applications of Array']");
    By tryHereBtn_applcnOfArray = By.xpath("//a[@class='btn btn-info']");
    By pracQnBtn = By.xpath("//a[text()='Practice Questions']");
    By searchArrayBtn = By.xpath("//a[text()='Search the array']");
    By maxConsOnesBtn = By.xpath("//a[text()='Max Consecutive Ones']");
    By evenNoOfDigitsBtn = By.xpath("//a[text()='Find Numbers with Even Number of Digits']");
    By sqOfSortedArrayBtn = By.xpath("//a[text()='Squares of  a Sorted Array']");
	
	
	
    @Given("User opens home page before login to test arrays")
    public void user_opens_home_page_before_login_to_test_arrays() {
		
			driver.get(URL);
			}

    @When("User logged in from login page to test arrays")
    public void User_logged_in_from_login_page_to_test_arrays (){
		
		driver.findElement(signInBtn).click();
		driver.findElement(signIn_userName).sendKeys("John");
//		driver.findElement(signIn_passwordBtn).clear();
		driver.findElement(signIn_passwordBtn).sendKeys("John@1234");
		driver.findElement(loginBtn).click();
		
	    	}
    
    @Then("User successfully logged in now to test arrays")
    public void user_successfully_logged_in_now_to_test_arrays() {
    	
    	driver.findElement(msgText).isDisplayed();
    }
    
    @When("User clicks array button to test correct input")
    public void user_clicks_array_button_to_test_correct_input() {

    driver.findElement(getStarted_Arrays).click();	
	 
    }
	
    @When("^User tests array page enters (.*) in text editor box and it gives (.*)$")
	public void user_tests_array_page_enters_input_in_text_editor_box_and_it_gives_expectedOutput(String input, String expectedOutput) throws InterruptedException{
		
    	driver.findElement(arraysPythonBtn).click(); //Scenario 33
		driver.findElement(tryHereBtn_Arrays).click();  //Scenario 34
		//Code for text box editor
		driver.findElement(textEditorBtn).sendKeys(input);
		driver.findElement(runBtn).click();
	    Thread.sleep(1000);
	    driver.navigate().back();
	    
	    driver.findElement(arraysListBtn).click();   //Scenario 35
	    driver.findElement(tryHereBtn_List).click(); //Scenario 36
	    //Code for text box editor
	    driver.findElement(textEditorBtn).sendKeys(input);
	    driver.findElement(runBtn).click();
	    Thread.sleep(1000);
        driver.navigate().back();
	    
	    driver.findElement(basicOperationBtn).click(); //Scenario 37
	    driver.findElement(tryHereBtn_basicOperation).click();  //Scenario 38
	    //Code for text box editor
	    driver.findElement(textEditorBtn).sendKeys(input);
	    driver.findElement(runBtn).click();
	    Thread.sleep(1000);
	    driver.navigate().back();
	    
	    driver.findElement(applcnOfArrayBtn).click();  //Scenario 39
	    driver.findElement(tryHereBtn_applcnOfArray).click(); // Scenario 40
	    //Code for text box editor
	    driver.findElement(textEditorBtn).sendKeys(input);
	    driver.findElement(runBtn).click();
	    Thread.sleep(1000);
	    driver.navigate().back();
	    
	    driver.findElement(pracQnBtn).click();  //Scenario 41
	    driver.findElement(searchArrayBtn).click(); //Scenario 42
	    driver.navigate().back();
	    
	    driver.findElement(maxConsOnesBtn).click(); //Scenario 43
	    driver.navigate().back();
	    
	    
	    driver.findElement(evenNoOfDigitsBtn).click();  //Scenario 44
	    driver.navigate().back();
	    	    
	    driver.findElement(sqOfSortedArrayBtn).click(); //Scenario 45
	    driver.navigate().back();
	}
	
	
	@Then("Array page completed for correct input")
	public void array_page_completed_for_correct_input() {
	
		//driver.quit();
	    	}

	@When("^User clicks array button for wrong input and gives (.*) and gets (.*)$")
	public void user_clicks_array_button_for_wrong_input_and_gives_errorInput_and_gets_errorMsg(String errorInput,String errorMsg ) throws InterruptedException {
		
		driver.findElement(getStarted_Arrays).click();
		
		driver.findElement(arraysPythonBtn).click(); //Scenario 33
		driver.findElement(tryHereBtn_Arrays).click();  //Scenario 34
		//Code for text box editor
		driver.findElement(textEditorBtn).sendKeys(errorInput);
		driver.findElement(runBtn).click();
	    Thread.sleep(1000);
		driver.switchTo().alert().accept();   // To handle alerts
	    Thread.sleep(1000);
	    driver.navigate().back();
	    
	    driver.findElement(arraysListBtn).click();   //Scenario 35
	    driver.findElement(tryHereBtn_List).click(); //Scenario 36
	    //Code for text box editor
	    driver.findElement(textEditorBtn).sendKeys(errorInput);
	    driver.findElement(runBtn).click();
	    Thread.sleep(1000);
	    driver.switchTo().alert().accept();
        driver.navigate().back();
	    
	    driver.findElement(basicOperationBtn).click(); //Scenario 37
	    driver.findElement(tryHereBtn_basicOperation).click();  //Scenario 38
	    //Code for text box editor
	    driver.findElement(textEditorBtn).sendKeys(errorInput);
	    driver.findElement(runBtn).click();
	    Thread.sleep(1000);
	    driver.switchTo().alert().accept();
	    driver.navigate().back();
	    
	    driver.findElement(applcnOfArrayBtn).click();  //Scenario 39
	    driver.findElement(tryHereBtn_applcnOfArray).click(); // Scenario 40
	    //Code for text box editor
	    driver.findElement(textEditorBtn).sendKeys(errorInput);
	    driver.findElement(runBtn).click();
	    Thread.sleep(1000);
	    driver.switchTo().alert().accept();
	    driver.navigate().back();
	    
	    driver.findElement(pracQnBtn).click();  //Scenario 41
	    driver.findElement(searchArrayBtn).click(); //Scenario 42
	    driver.navigate().back();
	    
	    driver.findElement(maxConsOnesBtn).click(); //Scenario 43
	    driver.navigate().back();
	    
	    
	    driver.findElement(evenNoOfDigitsBtn).click();  //Scenario 44
	    driver.navigate().back();
	    	    
	    driver.findElement(sqOfSortedArrayBtn).click(); //Scenario 45
	    driver.navigate().back();
	    
	    	}
	
	@When("Array page completed for wrong input")
	public void array_page_completed_for_wrong_input() {
		
	}





}
