package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DsAlgoProject_sd {
	public static WebDriver driver;
	String URL = "https://dsportalapp.herokuapp.com/";
	
	By getStartedBtn = By.xpath("//button[text()='Get Started']");
	By dropDownBtn = By.xpath("//a[@class='nav-link dropdown-toggle']");
	By getStarted_DS = By.xpath("//div[@class='row row-cols-1 row-cols-md-3 g-4']//div[1]/a");
	By dropDown_Arrays = By.xpath("//div[@class='dropdown-menu show']/a[1]");
	By signInBtn = By.xpath("//a[text()='Sign in']");
	By registerBtn = By.xpath("//a[text()='Register!']");
	By registerBtn2 = By.xpath("//input[@value='Register']");
	By userName = By.xpath("//input[@name='username']");
	By passwordBtn = By.xpath("//input[@name='password1']");
	By passwordConfirmation = By.xpath("//input[@name='password2']");
	By signOutBtn = By.xpath("//a[text()='Sign out']");
	By loginBtn = By.xpath("//input[@value='Login']");
	By signIn_userName = By.xpath("//input[@name='username']");
	By signIn_passwordBtn = By.xpath("//input[@name='password']");
	By timeComplexity = By.xpath("//a[text()='Time Complexity']");
	By pracQnsBtn = By.xpath("//a[text()='Practice Questions']");
	By tryHereBtn_DS = By.xpath("//a[@class='btn btn-info']");
	By getStarted_Arrays = By.xpath("//div[@class='row row-cols-1 row-cols-md-3 g-4']//div[2]//a");
	By arraysPythonBtn = By.xpath("//a[text()='Arrays in Python']");
	By tryHereBtn_Arrays = By.xpath("//a[@class='btn btn-info']");
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
    By dropDownBtn2 = By.xpath("//a[@class='nav-link dropdown-toggle']");
    By graphBtn = By.xpath("//a[text()='Graph']");
    By topic_graph = By.xpath("//div[@style='margin-top: 40px;margin-bottom: 40px;margin-right: 150px;margin-left: 80px;background-color: ;']/ul[2]/a");
    By tryHereBtn_topic_graph = By.xpath("//a[text()='Try here>>>']");
    By topic_graphRep = By.xpath("//a[text()='Graph Representations']");
    By tryHereBtn_graphRep = By.xpath("//a[text()='Try here>>>']");
    
	
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
		System.setProperty("webdriver.msedge.driver","/Users/Priya/eclipse-workspace/Hello-World/src/test/resources/drivers/msedgedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(URL);
			}

	@Given("some other precondition")
	public void some_other_precondition() {
	    
	}

	@When("I complete action")
	public void i_complete_action() {
		
		driver.findElement(getStartedBtn).click();
		driver.findElement(dropDownBtn).click();
		driver.findElement(getStarted_DS).click();
		driver.findElement(dropDownBtn).click();
		driver.findElement(dropDown_Arrays).click();
		driver.findElement(signInBtn).click();
		driver.findElement(registerBtn).click();
		driver.findElement(registerBtn2).click();
		driver.findElement(userName).sendKeys("John");
		driver.findElement(registerBtn2).click();
		driver.findElement(userName).sendKeys("John");
		driver.findElement(passwordBtn).sendKeys("John123!");
		driver.findElement(registerBtn2).click();
		driver.findElement(userName).clear();
		driver.findElement(userName).sendKeys("!#*$");
		driver.findElement(registerBtn2).click();
		driver.findElement(passwordBtn).clear();
		driver.findElement(passwordBtn).sendKeys("123456789");
	//	driver.findElement(passwordConfirmation).sendKeys("abc123!@");
		driver.findElement(passwordConfirmation).sendKeys("123456789");
		driver.findElement(registerBtn2).click(); 
		//Scenario 18
		driver.findElement(userName).sendKeys("Johnnyaadefh");
		driver.findElement(passwordBtn).sendKeys("John@1234");
		driver.findElement(passwordConfirmation).sendKeys("John@1234");
		driver.findElement(registerBtn2).click(); 
		//Sign in scenarios
		driver.findElement(signOutBtn).click();	
        driver.findElement(signInBtn).click();
        driver.findElement(loginBtn).click();   /* userName error*/  
        driver.findElement(signIn_userName).sendKeys("Johnny");
        driver.findElement(loginBtn).click();   /* password field error*/
             
        driver.findElement(userName).clear();     /*Invalid userName and password error*/
        driver.findElement(signIn_userName).sendKeys("Johnny");
        driver.findElement(signIn_passwordBtn).sendKeys("abcde@12");
        driver.findElement(loginBtn).click();  
            
        driver.findElement(signIn_userName).sendKeys("Johnny");
		driver.findElement(signIn_passwordBtn).sendKeys("John@1234");
		driver.findElement(loginBtn).click(); /* Logged in with userName on top */
		driver.findElement(signOutBtn).click(); 
			 
		 driver.findElement(signInBtn).click();  
		 driver.findElement(signIn_userName).sendKeys("ab#cde");   // Scenario 25
		 driver.findElement(signIn_passwordBtn).sendKeys("John@1234");
		 driver.findElement(loginBtn).click();  
		 
		 driver.findElement(signIn_userName).sendKeys("John");   // Scenario 26
		 driver.findElement(signIn_passwordBtn).sendKeys("@1234");
		 driver.findElement(loginBtn).click();  

		 driver.findElement(signIn_userName).sendKeys("John");   // Scenario 26
		 driver.findElement(signIn_passwordBtn).sendKeys("John@1234");
		 driver.findElement(loginBtn).click(); 
			
		//Data structure 
		/*driver.findElement(getStarted_DS).click();
        driver.findElement(timeComplexity).click();
        driver.findElement(pracQnsBtn).click();
		driver.navigate().back();
		driver.findElement(tryHereBtn_DS).click();
 		driver.navigate().back(); */
		 
		//Arrays 
		 
	//	driver.findElement(dropDown_Arrays).click(); 
		driver.findElement(getStarted_Arrays).click();
		
		//Scenario 33 
		
	    driver.findElement(arraysPythonBtn).click();
	    driver.findElement(tryHereBtn_Arrays).click();  //Scenario 34
	    driver.navigate().back();
	    
	    driver.findElement(arraysListBtn).click();   //Scenario 35
	    driver.findElement(tryHereBtn_List).click(); //Scenario 36
	    driver.navigate().back();
	    
	    driver.findElement(basicOperationBtn).click(); //Scenario 37
	    driver.findElement(tryHereBtn_basicOperation).click();  //Scenario 38
	    driver.navigate().back();
	    
	    driver.findElement(applcnOfArrayBtn).click();  //Scenario 39
	    driver.findElement(tryHereBtn_applcnOfArray).click(); // Scenario 40
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
	    
	 // driver.navigate().to("https://dsportalapp.herokuapp.com/home");
	    
	    //Graph
	    
	    driver.findElement(dropDownBtn2).click();
	    driver.findElement(graphBtn).click(); //Scenario 109
	    driver.findElement(topic_graph).click();
	    driver.findElement(tryHereBtn_topic_graph).click(); //scenario 110
	    driver.navigate().back();
	    
	    driver.findElement(topic_graphRep).click(); //Scenario 111
	    driver.findElement(tryHereBtn_graphRep).click(); //Scenario 112 */
		
	}

	@When("some other action")
	public void some_other_action() {
	    	}

	@When("yet another action")
	public void yet_another_action() {
	    	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
	    
	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
	    
	}

	@Given("I want to write a step with name1")
	public void i_want_to_write_a_step_with_name1() {
	   	}

	@When("I check for the {int} in step")
	public void i_check_for_the_in_step(Integer int1) {
	   
	}

	@Then("I verify the success in step")
	public void i_verify_the_success_in_step() {
	   	}

	@Given("I want to write a step with name2")
	public void i_want_to_write_a_step_with_name2() {
	    	}

	@Then("I verify the Fail in step")
	public void i_verify_the_fail_in_step() {
	   
	}




}
