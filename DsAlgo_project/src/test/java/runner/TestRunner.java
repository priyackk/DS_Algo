package runner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.junit.Cucumber;
	
//@RunWith(Cucumber.class) //Junit execution

	@CucumberOptions(
		//	plugin = {"pretty","html:target/priya.html"}, //reporting purpose
			plugin = "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
			monochrome=false,  //console output color
			tags = "@dsalgo", //tags from feature file
//			dryRun = true,  // To add new method give dryRun true
			features = {"src/test/resources/features"}, //location of feature files
			glue= {"stepDefinition","ApplicationHooks"}) //location of step definition files


	public class TestRunner extends AbstractTestNGCucumberTests{
		
		@Override
	    @DataProvider(parallel = false)
	    public Object[][] scenarios() {
					
			return super.scenarios();
	    }


}
