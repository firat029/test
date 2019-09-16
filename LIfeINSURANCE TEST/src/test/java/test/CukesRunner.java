package test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {
				"pretty",
				"html:target/default-cucumber-reports", //generates every time we run the cukes runner
				"json:target/cucumber.json",
				"junit:target/cucumber.xml"
		
		},
		
		tags="@currencies_Validation",
		features= {"src/test/resources/Features/Exercise.feature"}
		 
	,	glue= {"src/test/java/stepDefinition" }
		//,dryRun = true
		)
public class CukesRunner {}
