package test.Runner;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features =   {"/src/test/resources/Features/"},
		glue     =   {"test.stepdefinition"},
		plugin   =   {"pretty", "json:target/cucumber.json", "html:target/cucumber-reports"}
		,tags     =   {"@sanity"}
		)

public class TestRunner {
	
	

}
