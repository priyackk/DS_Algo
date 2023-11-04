package Utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static void openDriver(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			LoggerLoad.info("Testing on chrome");
			// WebDriverManager.chromedriver().browserVersion("118.0.5993.118").setup();
			driver = new ChromeDriver(); // initialize chrome driver

		} else if (browser.equalsIgnoreCase("firefox")) {
			LoggerLoad.info("Testing on Firefox");
			// WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver(); // initialize Firefox driver

		} else if (browser.equalsIgnoreCase("edge")) {
			LoggerLoad.info("Testing on Edge"); // initialize edge driver
			// WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}

		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "/Users/Priya/eclipse-workspace/Hello-World/src/test/resources/drivers/msedgedriver"
		 * ); driver = new ChromeDriver();
		 */
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();

	}

/*	public static String title() {

		return driver.getTitle();
	}
	*/

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


/*
 * static String dsPortalUrl = "https://dsportalapp.herokuapp.com/"; static
 * String registerPageUrl = "https://dsportalapp.herokuapp.com/register"; static
 * String homePageUrl = "https://dsportalapp.herokuapp.com/home"; static String
 * logInPageUrl = "https://dsportalapp.herokuapp.com/login";
 * 
 * static By msgText = By.xpath("//div[@class='alert alert-primary']"); static
 * By signInUsername = By.xpath("//input[@name='username']"); static By
 * signInPassword = By.xpath("//input[@name='password']"); static By logInBtn =
 * By.xpath("//input[@value='Login']"); static By signInBtn =
 * By.xpath("//a[text()='Sign in']");
 * 
 * static By tryHereBtn = By.xpath("//a[@class='btn btn-info']"); static By
 * tryEditorBox = By.xpath("//form[@id='answer_form']/div/div/div/textarea");
 * static By runBtn = By.xpath("//*[@id='answer_form']/button"); static By
 * outputText = By.xpath("//pre[@id='output']");
 * 
 */
