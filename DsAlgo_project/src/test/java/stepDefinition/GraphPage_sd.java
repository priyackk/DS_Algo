package stepDefinition;
import org.openqa.selenium.By;

import PageObjects.GraphPage_pom;
import Utilities.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GraphPage_sd extends BaseClass{
	
	String URL = "https://dsportalapp.herokuapp.com/home";
	
	/*
	By signInBtn = By.xpath("//a[text()='Sign in']");
	By signIn_userName = By.xpath("//input[@name='username']");
	By signIn_passwordBtn = By.xpath("//input[@name='password']");
	By loginBtn = By.xpath("//input[@value='Login']");
	By msgText = By.xpath("//div[@class='alert alert-primary']");
	*/

    By getStarted_graph = By.xpath("//div[@class='row row-cols-1 row-cols-md-3 g-4']//div[7]/div//a");
    By topic_graph = By.xpath("//div[@style='margin-top: 40px;margin-bottom: 40px;margin-right: 150px;margin-left: 80px;background-color: ;']/ul[2]/a");
    By tryHereBtn = By.xpath("//a[@class='btn btn-info']");
    By textEditorBtn = By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	By runBtn = By.xpath("//*[@id='answer_form']/button");
	By outputText = By.xpath("//pre[@id='output']");
    By topic_graphRep = By.xpath("//a[text()='Graph Representations']");
	
    @Given ("User opens home page before login to test graphs")
	public void user_opens_home_page_before_login_to_test_graphs() {
		
    	BaseClass.loginPageUrl();
		
	    	}

	@When("User logged in from login page to test graphs")
	public void User_logged_in_from_login_page_to_test_graphs() {
		
		BaseClass.login();				    	   
	    	}
	
	@Then("User successfully logged in now to test graphs")
    public void user_successfully_logged_in_now_to_test_graphs() {
    	
      BaseClass.msg_text();    
      
	}
	
	
	/*
	@When("User clicks graph button to test correct input")
	public void user_clicks_graph_button_to_test_correct_input() {
		
			driver.findElement(getStarted_graph).click();
	}
	
	*/

	@When("^User tests graph page and enters (.*) in text editor box and gives (.*)$")
	public void user_tests_graph_page_and_enters_input_in_text_editor_box_and_gives_expectedOutput(String input,String expectedOutput) throws InterruptedException {
        
		new GraphPage_pom().getStarted_graph();
		new GraphPage_pom().topic_graph();
		BaseClass.tryAndRunValid(input);
		BaseClass.previousPage();
		new GraphPage_pom().topic_graphRep();
		BaseClass.tryAndRunValid(input);
		

	}
		
		/*
		driver.findElement(topic_graph).click(); //Scenario 111
	    driver.findElement(tryHereBtn).click(); //Scenario 112 *    
	    driver.findElement(textEditorBtn).sendKeys(input);
	    driver.findElement(runBtn).click();
	    Thread.sleep(1000);
	    
	    driver.navigate().back();
	    
	    driver.findElement(topic_graphRep).click(); //Scenario 111
	    driver.findElement(tryHereBtn).click(); //Scenario 112 
	    
	    
	    driver.findElement(textEditorBtn).sendKeys(input);
	    driver.findElement(runBtn).click();  */

	        	
	@Then("Graph page completed for correct input")
	public void graph_page_completed_for_correct_input() {
		
//		driver.quit();
	    	}
	
	@When("^User clicks graph button for wrong input and gives (.*) and gets (.*)$")
	public void User_clicks_graph_button_for_wrong_input_and_gives_errorInput_and_gets_errorMsg(String errorInput,String errorMsg )throws InterruptedException{
		
		
		new GraphPage_pom().getStarted_graph();
		new GraphPage_pom().topic_graph();
		BaseClass.tryAndRunInvalid(errorInput);
		BaseClass.previousPage();
		new GraphPage_pom().topic_graphRep();
		BaseClass.tryAndRunInvalid(errorInput);
		
		
	}


		/*
		
		driver.findElement(getStarted_graph).click();
		driver.findElement(topic_graph).click(); //Scenario
	    driver.findElement(tryHereBtn).click(); //Scenario

		
		driver.findElement(textEditorBtn).sendKeys(errorInput);
	    driver.findElement(runBtn).click();
	    Thread.sleep(1000);
	    driver.switchTo().alert().accept();

	    
	    driver.navigate().back();
	    
	    driver.findElement(topic_graphRep).click(); //Scenario 111
	    driver.findElement(tryHereBtn).click(); //Scenario 112 
	    
        //Code for text box editor
	    
	    driver.findElement(textEditorBtn).sendKeys(errorInput);
	    driver.findElement(runBtn).click();
	    Thread.sleep(1000);
	    driver.switchTo().alert().accept();

	   	*/

	@When("Graph page completed for wrong input")
	public void graph_page_completed_for_wrong_input() {
	 
//		driver.quit();
	    
	}




	
	


}
