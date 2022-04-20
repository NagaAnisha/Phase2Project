package StepDefs;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	@RunWith(Cucumber.class)

	@CucumberOptions(
			
			plugin= {"html:target/html-cucumber","json:target/cucumber.json"},			
			features="src/test/java/features",
			tags= {"@Regression,@Sanity"},
			glue= {"StepDefs"}
			
			
			)
	public class TestRunner {

}
