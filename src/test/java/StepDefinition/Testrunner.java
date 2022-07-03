


package StepDefinition;


import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", 
glue= {"StepDefinitions"},monochrome=true,
plugin = {"pretty","junit:target/JUnitReports/report.xml",
		"json:target/reports/report.json",
		"html:target/HtmlReports"},
tags="@smoketest"
)
public class Testrunner {

}
