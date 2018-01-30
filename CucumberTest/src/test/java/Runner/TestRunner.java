package Runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(
		features="src/test/resources/Features",
		glue="stepDefinitions"
	    ,dryRun=false
		,format={"pretty","html:test-output"}
		)

public class TestRunner {

}
	