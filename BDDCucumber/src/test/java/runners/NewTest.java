package runners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src//test//resources//features//feature.feature",
		glue = {"stepDefs"},
		monochrome=true,
		dryRun=false,
		plugin= {"pretty",
				"html:target//Reports//HtmlReport.html"
//				"json:target//Reports//JsonReport.json",
//				"usage:target//Reports//UsageReport",
//				"rerun:target//failedScenarios.txt"
		}
		)
public class NewTest extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel = true) 
	public Object[][] scenarios() 
	{
		return super.scenarios(); 
		}
}