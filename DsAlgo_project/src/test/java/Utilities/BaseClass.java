package Utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	public static WebDriver driver;
	static String dsPortalUrl = "https://dsportalapp.herokuapp.com/";
	static String registerPageUrl = "https://dsportalapp.herokuapp.com/register";
	static String homePageUrl = "https://dsportalapp.herokuapp.com/home";
	static String loginPageUrl = "https://dsportalapp.herokuapp.com/login";
	static By msg_text = By.xpath("//div[@class='alert alert-primary']");
	static By signIn_userName = By.xpath("//input[@name='username']");
	static By signIn_passwordBtn = By.xpath("//input[@name='password']");
	static By loginBtn = By.xpath("//input[@value='Login']");
	static By signInBtn = By.xpath("//a[text()='Sign in']");

	static By tryHereBtn = By.xpath("//a[@class='btn btn-info']");
	static By textEditorBtn = By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	static By runBtn = By.xpath("//*[@id='answer_form']/button");
	static By outputText = By.xpath("//pre[@id='output']");

	static By pracQnBtn = By.xpath("//a[text()='Practice Questions']");

	public static void openDriver(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver(); //initialize chrome driver
		
			LoggerLoad.info("Testing on chrome");
			
		}else if(browser.equalsIgnoreCase("firefox")) {	
			driver = new FirefoxDriver();  //initialize Firefox driver
			
			LoggerLoad.info("Testing on Firefox"); 
			
		}else if(browser.equalsIgnoreCase("edge")) {	
			driver = new EdgeDriver();
			
			LoggerLoad.info("Testing on Edge"); //initialize edge driver
		}

		
		System.setProperty("webdriver.chrome.driver",
				"/Users/Priya/eclipse-workspace/Hello-World/src/test/resources/drivers/msedgedriver");
        driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();

	}

	public static void dsPortalUrl() {

		driver.get(dsPortalUrl);

	}

	public static void registerPageUrl() {

		driver.get(registerPageUrl);
	}

	public static void homePageUrl() {

		driver.get(homePageUrl);
	}

	public static void loginPageUrl() {

		driver.get(loginPageUrl);
	}

	public static void msg_text() {

		driver.findElement(msg_text).isDisplayed();
	}

	public static void login() {

		driver.findElement(signInBtn).click();
		driver.findElement(signIn_userName).sendKeys("John");
		driver.findElement(signIn_passwordBtn).sendKeys("John@1234");
		driver.findElement(loginBtn).click();

	}

	public static void tryAndRunValid(String input) {
		driver.findElement(tryHereBtn).click();
		driver.findElement(textEditorBtn).sendKeys(input);
		driver.findElement(runBtn).click();
		driver.findElement(outputText).isDisplayed();
	}

	public static void tryAndRunInvalid(String errorInput) {
		driver.findElement(tryHereBtn).click();
		driver.findElement(textEditorBtn).sendKeys(errorInput);
		driver.findElement(runBtn).click();
		driver.switchTo().alert().accept();

	}

	public static void previousPage() {

		driver.navigate().back();
	}

	
	public static void pracQns() {

		driver.findElement(pracQnBtn).click();

	}
	

	public static String title() {

		return driver.getTitle();
	}

	public static WebDriver getDriver() {

		return driver;

	}

	public static void closeDriver() {

		if (driver != null) {
			driver.quit();
			driver = null;
		}

	}
}
